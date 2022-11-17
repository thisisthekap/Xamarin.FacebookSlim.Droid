package com.tonestro.facebookslim;

import java.util.Date;

class AccessTokenSlimImpl implements AccessTokenSlim {
    private final Date expires;
    private final String[] permissions;
    private final String[] declinedPermissions;
    private final String[] expiredPermissions;
    private final String token;
    private final Date lastRefresh;
    private final String applicationId;
    private final String userId;
    private final Date dataAccessExpirationTime;
    private final String graphDomain;

    public AccessTokenSlimImpl(Date expires, String[] permissions, String[] declinedPermissions, String[] expiredPermissions, String token, Date lastRefresh, String applicationId, String userId, Date dataAccessExpirationTime, String graphDomain) {
        this.expires = expires;
        this.permissions = permissions;
        this.declinedPermissions = declinedPermissions;
        this.expiredPermissions = expiredPermissions;
        this.token = token;
        this.lastRefresh = lastRefresh;
        this.applicationId = applicationId;
        this.userId = userId;
        this.dataAccessExpirationTime = dataAccessExpirationTime;
        this.graphDomain = graphDomain;
    }

    public Date getExpires() {
        return expires;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public String[] getDeclinedPermissions() {
        return declinedPermissions;
    }

    public String[] getExpiredPermissions() {
        return expiredPermissions;
    }

    public String getToken() {
        return token;
    }

    public Date getLastRefresh() {
        return lastRefresh;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getUserId() {
        return userId;
    }

    public Date getDataAccessExpirationTime() {
        return dataAccessExpirationTime;
    }

    public String getGraphDomain() {
        return graphDomain;
    }
}
