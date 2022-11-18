package com.tonestro.facebookslim;

public interface LoginResultListener {
    void onSuccess(LoginResultSlim loginResult);
    void onCanceled();
    void onError(Exception exception);
}
