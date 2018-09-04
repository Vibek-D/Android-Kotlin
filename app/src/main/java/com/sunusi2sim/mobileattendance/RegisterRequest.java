package com.sunusi2sim.mobileattendance;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HP USER on 25/04/2016.
 */
public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://sunusi2sim.comli.com//Register.php";
    private Map<String, String> params;

    public RegisterRequest ( String name, String email, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL,listener, null );
        params = new HashMap<>();
        params.put("name", name);
        params.put("email", email);
        params.put("password", password);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
