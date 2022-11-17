package com.tonestro.facebookslim;

import android.app.Activity;

import androidx.annotation.NonNull;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import java.util.Arrays;

class LoginManagerSlimImpl implements LoginManagerSlim {

    private LoginResultListener loginResultListener;

    public LoginManagerSlimImpl() {
        CallbackManager callbackManager = CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(callbackManager, new LoginCallback());
        LoginManager.getInstance().setLoginBehavior(LoginBehavior.NATIVE_WITH_FALLBACK);
    }

    public void Login(Activity activity, String[] permissions, LoginResultListener loginResultListener) {
        this.loginResultListener = loginResultListener;
        LoginManager.getInstance().logInWithReadPermissions(activity, Arrays.asList(permissions));
    }

    public void Logout() {
        LoginManager.getInstance().logOut();
    }

    private class LoginCallback implements FacebookCallback<LoginResult> {
        @Override
        public void onSuccess(LoginResult loginResult) {
            if (loginResultListener == null) {
                return;
            }

            AccessToken accessToken = loginResult.getAccessToken();
            LoginResultSlim loginResultSlim = new LoginResultSlimImpl(
                    new AccessTokenSlimImpl(
                            accessToken.getExpires(),
                            accessToken.getPermissions().toArray(new String[0]),
                            accessToken.getDeclinedPermissions().toArray(new String[0]),
                            accessToken.getExpiredPermissions().toArray(new String[0]),
                            accessToken.getToken(),
                            accessToken.getLastRefresh(),
                            accessToken.getApplicationId(),
                            accessToken.getUserId(),
                            accessToken.getDataAccessExpirationTime(),
                            accessToken.getGraphDomain()
                    ),
                    loginResult.getRecentlyGrantedPermissions().toArray(new String[0]),
                    loginResult.getRecentlyDeniedPermissions().toArray(new String[0]));

            loginResultListener.onSuccess(loginResultSlim);
        }

        @Override
        public void onCancel() {
            if (loginResultListener == null) {
                return;
            }

            loginResultListener.onCanceled();
        }

        @Override
        public void onError(@NonNull FacebookException e) {
            if (loginResultListener == null) {
                return;
            }
            loginResultListener.onError(e);
        }
    }
}
