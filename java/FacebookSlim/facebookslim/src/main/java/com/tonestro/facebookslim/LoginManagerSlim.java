package com.tonestro.facebookslim;

import android.app.Activity;
import android.content.Intent;

public interface LoginManagerSlim {
    void Login(Activity activity, String[] permissions, LoginResultListener loginResultListener);

    void Logout();

    void OnActivityResult(int requestCode, int resultCode, Intent data);
}
