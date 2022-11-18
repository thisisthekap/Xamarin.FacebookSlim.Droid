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

    @Override
    public Date getExpires() {
        return expires;
    }

    @Override
    public String[] getPermissions() {
        return permissions;
    }

    @Override
    public String[] getDeclinedPermissions() {
        return declinedPermissions;
    }

    @Override
    public String[] getExpiredPermissions() {
        return expiredPermissions;
    }

    @Override
    public String getToken() {
        return token;
    }

    @Override
    public Date getLastRefresh() {
        return lastRefresh;
    }

    @Override
    public String getApplicationId() {
        return applicationId;
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public Date getDataAccessExpirationTime() {
        return dataAccessExpirationTime;
    }

    @Override
    public String getGraphDomain() {
        return graphDomain;
    }
}
