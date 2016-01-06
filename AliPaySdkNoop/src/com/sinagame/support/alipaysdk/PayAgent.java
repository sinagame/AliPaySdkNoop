package com.sinagame.support.alipaysdk;

public class PayAgent {

    public static interface PayStateListener {
        void onSuccess();

        void onFailure();

        void onRunning();

        void onCancler();

        void onOffLine();

        void onCheckNO();
    }

    public PayAgent(String[] s, PayStateListener l) {
    }

    protected boolean b(String i) {
        return true;
    }

    public void pay(final android.app.Activity act, String arg1, String arg2,
                    String arg3, String arg4, String arg5) {
    }

}
