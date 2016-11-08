package au.com.serviceseeking.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import au.com.serviceseeking.R;
import au.com.serviceseeking.listener.SSSingleClickListener;

public class SSLoginActivity extends SSTemplateActivity  {

    private EditText mEmail;
    private EditText mPassword;
    private View mProgressView;
    private TextView userEmail;
    private TextView signOther;
    private SSSingleClickListener mListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEmail = (EditText) findViewById(R.id.txt_login_email);
        mPassword = (EditText) findViewById(R.id.txt_login_password);
        TextView signIn = (TextView) findViewById(R.id.tv_login_sign);
        signOther = (TextView) findViewById(R.id.tv_login_sign_other);
        TextView forgotPassword = (TextView) findViewById(R.id.tv_login_forgot);
        TextView buildVersion = (TextView) findViewById(R.id.tv_login_version);
        TextView fbIcon = (TextView) findViewById(R.id.tv_fb_icon);
        userEmail = (TextView) findViewById(R.id.tv_login_email);
        ImageView profilePic = (ImageView) findViewById(R.id.image_login_profile);
        View viaFb = (View) findViewById(R.id.lin_login_fb);

        initListener();

        signIn.setOnClickListener(mListener);
        viaFb.setOnClickListener(mListener);
        signOther.setOnClickListener(mListener);
        forgotPassword.setOnClickListener(mListener);

        fbIcon.setTypeface(fontMaterialDesign);
        buildVersion.setText(String.format(getString(R.string.complete_build_version), getString(R.string.app_version), getString(R.string.app_version_code)));
        mProgressView = findViewById(R.id.progress_login_loading);

    }

    public void initListener(){
        mListener = new SSSingleClickListener() {
            @Override
            protected void onSingleClick(View v) {
                switch (v.getId()) {
                    case R.id.tv_login_sign:
//                        attemptLogin();
                        userEmail.setVisibility(View.VISIBLE);
                        signOther.setVisibility(View.VISIBLE);
                        mEmail.setVisibility(View.GONE);
                        break;
                    case R.id.tv_login_sign_other:
                        userEmail.setVisibility(View.GONE);
                        signOther.setVisibility(View.GONE);
                        mEmail.setVisibility(View.VISIBLE);
                        break;
                    case R.id.tv_login_forgot:
                        Toast.makeText(getApplicationContext(), "forgotpassword" , Toast.LENGTH_SHORT).show();
                        attemptLogin();
                        break;
                    case R.id.lin_login_fb:
                        Toast.makeText(getApplicationContext(), "fb" , Toast.LENGTH_SHORT).show();
                        attemptLogin();
                        break;
                }
            }
        };
    }

    private void attemptLogin() {
        // Reset errors.
        mEmail.setError(null);
        mPassword.setError(null);

        // Store values at the time of the login attempt.
        String email = mEmail.getText().toString();
        String password = mPassword.getText().toString();

        boolean cancel = false;
        View focusView = null;

        // Check for a valid email address.
        if (TextUtils.isEmpty(email)) {
            mEmail.setError(getString(R.string.error_field_required));
            focusView = mEmail;
            cancel = true;
        } else if (!isValidEmail(email)) {
            mEmail.setError(getString(R.string.error_invalid_email));
            focusView = mEmail;
            cancel = true;
        }

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        } else {
            // Show a progress spinner, and kick off a background task to
            // perform the user login attempt.
            Toast.makeText(getApplicationContext(), "Thanks! ", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

}

