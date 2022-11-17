package com.tonestro.facebookslim;

import android.app.Activity;

public interface LoginManagerSlim {
    void Login(Activity activity, String[] permissions, LoginResultListener loginResultListener);

    void Logout();
}
