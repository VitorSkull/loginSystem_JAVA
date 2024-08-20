package com.systemlogin;
import java.util.HashMap;
public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords(){
        logininfo.put("vitorskull", "cadeiras");
        logininfo.put("eve", "linda");
        logininfo.put("teste", "123");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
