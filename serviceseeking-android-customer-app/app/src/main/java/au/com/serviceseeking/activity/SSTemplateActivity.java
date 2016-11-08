package au.com.serviceseeking.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Spinner;

import java.io.File;
import java.util.Set;

import au.com.serviceseeking.utility.SSFont;
import au.com.serviceseeking.utility.SSLog;


public class SSTemplateActivity extends AppCompatActivity {
//    protected SSHttpRequestHelper httpRequest;
    protected Typeface fontMaterialDesign;
    protected Typeface fontAwesomeFont;
//    protected Tracker tracker;
//    public MaterialDialog.Builder materialDialog;
//    public SSUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SSLog.d("LifeCycle", getClass().getSimpleName() + ": onCreate");
        super.onCreate(savedInstanceState);
//        httpRequest = SSHttpRequestHelper.getInstance();
        fontMaterialDesign = SSFont.getTypeFace(this);
        fontAwesomeFont = SSFont.getTypeFace2(this);
//        ServiceSeekingApplication application = (ServiceSeekingApplication) getApplication();
//        tracker = application.getDefaultTracker();
//
//        materialDialog = new MaterialDialog.Builder(this);
//
//        SharedPreferences userData = PreferenceManager.getDefaultSharedPreferences(this);
//        String userId = userData.getString("user", "");
//        mUser = SQLite.select()
//                .from(SSUser.class)
//                .where(SSUser_Table.id.eq(userId))
//                .querySingle();
    }

    @Override
    public void onStart() {
        SSLog.d("LifeCycle", getClass().getSimpleName() + ": onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        SSLog.d("LifeCycle", getClass().getSimpleName() + ": onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        SSLog.d("LifeCycle", getClass().getSimpleName() + ": onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        SSLog.d("LifeCycle", getClass().getSimpleName() + ": onStop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        SSLog.d("LifeCycle", getClass().getSimpleName() + ": onDestroy");
//        this.deleteAllActivityIntentData();
//        View rootView = getWindow().getDecorView().getRootView();
//        cleanupView(rootView);
        super.onDestroy();
    }


}
