package com.tonestro.facebookslim;

public class LoginManagerSlimFactory {
    private LoginManagerSlimFactory() {
    }

    public LoginManagerSlim createInstance(){
        return new LoginManagerSlimImpl();
    }
}
