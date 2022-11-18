package com.tonestro.facebookslim;

public class LoginManagerSlimFactory {
    private LoginManagerSlimFactory() {
    }

    public static LoginManagerSlim createInstance(){
        return new LoginManagerSlimImpl();
    }
}
