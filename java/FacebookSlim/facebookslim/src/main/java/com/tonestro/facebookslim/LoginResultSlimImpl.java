package com.tonestro.facebookslim;

class LoginResultSlimImpl implements LoginResultSlim {
    private final AccessTokenSlim accessToken;
    private final String[] recentlyGrantedPermissions;
    private final String[] recentlyDeniedPermissions;

    public LoginResultSlimImpl(AccessTokenSlim accessToken, String[] recentlyGrantedPermissions, String[] recentlyDeniedPermissions) {
        this.accessToken = accessToken;
        this.recentlyGrantedPermissions = recentlyGrantedPermissions;
        this.recentlyDeniedPermissions = recentlyDeniedPermissions;
    }

    public AccessTokenSlim getAccessToken() {
        return accessToken;
    }

    public String[] getRecentlyGrantedPermissions() {
        return recentlyGrantedPermissions;
    }

    public String[] getRecentlyDeniedPermissions() {
        return recentlyDeniedPermissions;
    }
}
