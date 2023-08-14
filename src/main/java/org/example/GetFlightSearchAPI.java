package org.example;

import apihelpers.ApiUtilities;
import constatns.ApiConstant;
import io.restassured.response.Response;
import rest_assured.GetApiHelper;

import java.util.Objects;

public class GetFlightSearchAPI {
    public static Response apiResponse;

    public Response hitFlightSearch(String originId,String destinationId,String departure,String arrive,String cabin
            ,String passenger){

        ApiConstant.setFlightSearch(originId,destinationId,departure,arrive,cabin,passenger);
        apiResponse = Objects.requireNonNull(GetApiHelper.getResponseByHeaders(ApiConstant.Flight_Search, ApiUtilities.headers()));
        apiResponse.getBody().prettyPrint();
        return apiResponse;
    }
}
