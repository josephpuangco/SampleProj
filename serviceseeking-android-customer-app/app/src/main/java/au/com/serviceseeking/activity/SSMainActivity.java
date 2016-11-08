package au.com.serviceseeking.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import au.com.serviceseeking.R;

/**
 * Created by Joseph Puangco on 02/11/2016.
 */
public class SSMainActivity extends SSTemplateActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}