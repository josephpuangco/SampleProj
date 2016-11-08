package au.com.serviceseeking.listener;

import android.os.SystemClock;
import android.view.View;

/**
 * Created by Jan Marvin Mosa on 5/26/16.
 */
public abstract class SSSingleClickListener implements View.OnClickListener {
    private long lastClickTime = 0;
    @Override
    public void onClick(View v) {
        // preventing double, using threshold of 1000 ms
        if (SystemClock.elapsedRealtime() - lastClickTime < 1000){
            return;
        }
        lastClickTime = SystemClock.elapsedRealtime();

        onSingleClick(v);
    }

    protected abstract void onSingleClick(View v);
}


