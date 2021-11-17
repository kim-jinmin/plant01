package com.example.plant01;

import androidx.annotation.Nullable;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    final static private String URL = " http://plant00.ivyro.net/UserRegister.php";
    private Map<String,String> parameters;

    public RegisterRequest( String UserName, String UserPassword, String UserPostcode, String UserAdr,
                           String UserNick, String UserPh, String UserBirth, String UserGender, String UserEmail, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("UserName", UserName);
        parameters.put("UserPassword", UserPassword);
        parameters.put("UserPostcode", UserPostcode);
        parameters.put("UserAdr", UserAdr);
        parameters.put("UserNick", UserNick);
        parameters.put("UserPh", UserPh);
        parameters.put("UserBirth", UserBirth);
        parameters.put("UserGender", UserGender);
        parameters.put("UserEmail", UserEmail);


    }

    public  Map<String, String> getParams(){
        return parameters;
    }


}
