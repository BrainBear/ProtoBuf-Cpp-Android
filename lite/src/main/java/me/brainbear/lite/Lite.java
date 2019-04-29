package me.brainbear.lite;

import android.util.Log;

/**
 * created by canxionglian on 2019-04-28
 */
public class Lite {

    private static final String TAG = "Lite";


    static {
        System.loadLibrary("lite-lib");
    }


    public native String stringFromJNI();

    public void test() {
        Log.i(TAG, "test: " + stringFromJNI());
    }
}

