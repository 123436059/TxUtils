package com.utill.tx.txlibrary.Log;

import android.util.Log;

/**
 * Created by Taxi on 2017/2/8.
 */

public class L {

    public static final String TAG = "taxi";
    public static boolean isDebug = true;

    private L() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static void d(String tag, String content) {
        if (isDebug) {
            Log.d(tag, content);
        }
    }

    public static void d(String content) {
        d(TAG, content);
    }

    public static void e(String tag, String content) {
        if (isDebug) {
            Log.e(tag, content);
        }
    }

    public static void e(String content) {
        e(TAG, content);
    }

    public static void i(String tag, String content) {
        if (isDebug) {
            Log.i(tag, content);
        }
    }

    public static void i(String content) {
        i(TAG, content);
    }

    public static void v(String tag, String content) {
        if (isDebug) {
            Log.v(tag, content);
        }
    }

    public static void v(String content) {
        v(TAG, content);
    }

    public static void w(String tag, String content) {
        if (isDebug) {
            Log.w(tag, content);
        }
    }

    public static void w(String content) {
        w(TAG, content);
    }

}
