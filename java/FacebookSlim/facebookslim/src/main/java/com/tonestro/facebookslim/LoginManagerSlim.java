package com.tonestro.facebookslim;

import android.app.Activity;
import android.content.Intent;

public interface LoginManagerSlim {
    void login(Activity activity, String[] permissions, LoginResultListener loginResultListener);

    void logout();

    boolean onActivityResult(int requestCode, int resultCode, Intent data);
}
