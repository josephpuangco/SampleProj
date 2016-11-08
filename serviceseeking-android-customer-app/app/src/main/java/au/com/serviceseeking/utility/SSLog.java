package au.com.serviceseeking.utility;


import android.util.Log;

import au.com.serviceseeking.config.SSConfig;


/**
 * Created by Jan Marvin Mosa on 4/29/2016.
 */

public class SSLog {
    private static final int MAX_SINGLE_LOG_SIZE = 1000;

    public static void v(Object obj, String str) {
        if (SSConfig.isDebugMode()) {
            v(obj != null ? obj.getClass().getSimpleName() : "", str);
        }
    }

    public static void d(Object obj, String str) {
        if (SSConfig.isDebugMode()) {
            int size = str.length();
            if (size > MAX_SINGLE_LOG_SIZE) {
                int start = 0;
                int end = MAX_SINGLE_LOG_SIZE;
                while (size > start) {
                    d(start == 0 && obj != null ? obj.getClass().getSimpleName() : "", str.substring(start, end));
                    start = end;
                    int remaining = size - end;
                    end += remaining > MAX_SINGLE_LOG_SIZE ? MAX_SINGLE_LOG_SIZE : remaining;
                }
            } else {
                d(obj != null ? obj.getClass().getSimpleName() : "", str);
            }
        }
    }

    public static void i(Object obj, String str) {
        if (SSConfig.isDebugMode()) {
            i(obj != null ? obj.getClass().getSimpleName() : "", str);
        }
    }

    public static void w(Object obj, String str) {
        if (SSConfig.isDebugMode()) {
            w(obj != null ? obj.getClass().getSimpleName() : "", str);
        }
    }

    public static void e(Object obj, String str) {
        if (SSConfig.isDebugMode()) {
            e(obj != null ? obj.getClass().getSimpleName() : "", str);
        }
    }

    public static void e(Object obj, String str, Throwable t) {
        if (SSConfig.isDebugMode()) {
            e(obj != null ? obj.getClass().getSimpleName() : "", str, t);
        }
    }

    public static void v(String tag, String str) {
        if (SSConfig.isDebugMode()) {
            Log.v(tag, str);
        }
    }

    public static void d(String tag, String str) {
        if (SSConfig.isDebugMode()) {
            Log.d(tag, str);
        }
    }

    public static void i(String tag, String str) {
        if (SSConfig.isDebugMode()) {
            Log.i(tag, str);
        }
    }

    public static void w(String tag, String str) {
        if (SSConfig.isDebugMode()) {
            Log.w(tag, str);
        }
    }

    public static void e(String tag, String str) {
        if (SSConfig.isDebugMode()) {
            Log.e(tag, str);
        }
    }

    public static void e(String tag, String str, Throwable t) {
        if (SSConfig.isDebugMode()) {
            Log.e(tag, str, t);
        }
    }

    public static void w(Object obj, Throwable t) {
        if (SSConfig.isDebugMode()) {
            Log.w(obj != null ? obj.getClass().getSimpleName() : "", t);
        }
    }
}
