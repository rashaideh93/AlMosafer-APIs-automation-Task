package rest_assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.HashMap;

public class GetApiHelper {


    public static Response getResponseByHeaders(String apiUrl, HashMap<String, String> headers) {
        if (ResponseHandler.isNotNullOrEmpty(apiUrl))
            return RestAssured.given().that().headers(headers).when().get(apiUrl).thenReturn();
        Assert.fail(ApiConstants.INVALID_EMPTY_URL_ERROR);
        return null;
    }


}


