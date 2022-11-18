package com.tonestro.facebookslim;

import android.content.Context;
import android.os.Bundle;

import com.facebook.appevents.AppEventsLogger;

public class AppEventsLoggerSlim {
    private final AppEventsLogger logger;

    private AppEventsLoggerSlim(Context context) {
        logger = AppEventsLogger.newLogger(context);
    }

    public static AppEventsLoggerSlim newLogger(Context context) {
        return new AppEventsLoggerSlim(context);
    }

    public void logEvent(String eventName, Bundle parameters) {
        logger.logEvent(eventName, parameters);
    }
}
