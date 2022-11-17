package com.tonestro.facebookslim;

public interface LoginResultSlim {
    AccessTokenSlim getAccessToken();
    String[] getRecentlyGrantedPermissions();
    String[] getRecentlyDeniedPermissions();
}
