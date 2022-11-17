package com.tonestro.facebookslim;

import java.util.Date;

public interface AccessTokenSlim {
    Date getExpires();

    String[] getPermissions();

    String[] getDeclinedPermissions();

    String[] getExpiredPermissions();

    String getToken();

    Date getLastRefresh();

    String getApplicationId();

    String getUserId();

    Date getDataAccessExpirationTime();

    String getGraphDomain();
}
