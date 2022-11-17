package com.tonestro.facebookslim;

public interface LoginResultListener {
    void onCanceled();
    void onError(Exception exception);
    void onSuccess(LoginResultSlim loginResult);
}
