package com.tonestro.facebookslim;

import android.content.Context;
import android.os.Bundle;

import com.facebook.appevents.AppEventsLogger;

public class AppEventsLoggerSlim {
    private final AppEventsLogger logger;

    private AppEventsLoggerSlim(Context context) {
        logger = AppEventsLogger.newLogger(context);
    }

    public static AppEventsLoggerSlim NewLogger(Context context) {
        return new AppEventsLoggerSlim(context);
    }

    public void LogEvent(String event, Bundle eventProperties) {
        logger.logEvent(event, eventProperties);
    }
}
