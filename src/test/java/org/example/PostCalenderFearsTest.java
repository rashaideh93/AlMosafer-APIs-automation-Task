package org.example;

import Reading_Helper.XMLReader;
import Shared_Methods.DynamicDataGenerator;
import constatns.ApiConstant;
import error_handlers.StatusCodeValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostCalenderFearsTest {

    Response response;

    @Test(description = "validate that api return success and return data correctly")
    public void validateAddAppointmentApiStatusCode() {
        String departureFrom = DynamicDataGenerator.generateRandomDepartureFrom();
        String departureTo = DynamicDataGenerator.generateRandomDepartureTo(departureFrom);
        PostCalenderFearsAPI postCalenderFearsAPI = new PostCalenderFearsAPI();
        response = postCalenderFearsAPI.hitPostFares(departureFrom, departureTo, XMLReader.getXMLData("adult"));
        StatusCodeValidator.validateStatusCode(PostCalenderFearsAPI.apiResponse, ApiConstant.SUCCESS);
        response.getBody();
        JsonPath jsonPath = response.jsonPath();
        double price = jsonPath.getDouble(departureFrom + ".price");
        Assert.assertNotEquals(price, null);
    }
}
