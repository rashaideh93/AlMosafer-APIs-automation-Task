package org.example;

import apihelpers.ApiUtilities;
import constatns.ApiConstant;
import io.restassured.response.Response;
import rest_assured.PostApiHelper;

import java.util.Objects;

public class PostCalenderFearsAPI {

    public static Response apiResponse;

    public Response hitPostFares(String departureFrom, String departureTo, String adult) {
        String body = "{\"leg\":[{\"originId\":\"RUH\",\"destinationId\":\"JED\",\"departureFrom\":\"" + departureFrom + "\"" +
                ",\"departureTo\":\"" + departureTo + "\"}],\"cabin\":\"Economy\",\"pax\":{\"adult\":" + adult + ",\"child\":0,\"infant\":0},\"stops\":[],\"airline\":[],\"timeSlots\":{},\"airports\":{}}";
        apiResponse = Objects.requireNonNull(PostApiHelper.post(ApiConstant.PostCalenderFearsApi, ApiUtilities.headers(), body));
        apiResponse.getBody().prettyPrint();
        return apiResponse;
    }
}
