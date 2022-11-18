package com.tonestro.facebookslim;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;

public class FacebookSdkSlim {

    private FacebookSdkSlim() {
        // nothing to do
    }

    public static void setDebugEnabled(boolean debugEnabled) {
        FacebookSdk.setIsDebugEnabled(debugEnabled);
    }

    public static boolean isDebugEnabled() {
        return FacebookSdk.isDebugEnabled();
    }

    public static void addLoggingBehavior(String loggingBehavior) {
        FacebookSdk.addLoggingBehavior(LoggingBehavior.valueOf(loggingBehavior));
    }
}
