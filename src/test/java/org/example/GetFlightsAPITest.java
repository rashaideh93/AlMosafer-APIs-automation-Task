package org.example;


import Reading_Helper.XMLReader;
import Shared_Methods.DynamicDataGenerator;
import constatns.ApiConstant;
import error_handlers.StatusCodeValidator;
import org.testng.annotations.Test;


public class GetFlightsAPITest {

    @Test(description = "validate flight search return data")
    public void GetFlightSearch(){
        String departureFrom = DynamicDataGenerator.generateRandomDepartureFrom();
        String departureTo = DynamicDataGenerator.generateRandomDepartureTo(departureFrom);
        GetFlightSearchAPI getFlightSearchAPI = new GetFlightSearchAPI();
        getFlightSearchAPI.hitFlightSearch(XMLReader.getXMLData("originId"),XMLReader.getXMLData("destinationId"),departureFrom
        ,departureTo,XMLReader.getXMLData("cabin"),XMLReader.getXMLData("adult"));
        StatusCodeValidator.validateStatusCode(getFlightSearchAPI.apiResponse, ApiConstant.SUCCESS);
    }
}
