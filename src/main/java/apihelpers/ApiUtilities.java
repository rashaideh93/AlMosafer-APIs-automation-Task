package apihelpers;

import constatns.ApiConstant;

import java.util.HashMap;

public class ApiUtilities {

    public static HashMap<String, String> headers() {
        HashMap<String, String> headers;
        headers = new HashMap<>();
        headers.put("Accept-Language", ApiConstant.ACCEPT_LANGUAGE);
        return headers;
    }

}
