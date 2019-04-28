package me.brainbear.nano;

import android.util.Log;

/**
 * created by canxionglian on 2019-04-28
 */
public class Nano {

    private static final String TAG = "Nano";


    static {
        System.loadLibrary("nano-lib");
    }


    public native String stringFromJNI();

    public void test() {
        Log.i(TAG, "test: " + stringFromJNI());
    }
}
