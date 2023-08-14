package error_handlers;

import constatns.ApiConstant;
import io.restassured.response.Response;
import org.testng.Assert;

public class StatusCodeValidator {


    public static void validateStatusCode(Response response, int code) {

        switch (code) {
            case 200:
                Assert.assertEquals(response.getStatusCode(), ApiConstant.SUCCESS);
                break;
            case 401:
                Assert.assertEquals(response.getStatusCode(), ApiConstant.ERROR_401);
                break;
            case 422:
                Assert.assertEquals(response.getStatusCode(), ApiConstant.ERROR_422);
                break;
            case 404:
                Assert.assertEquals(response.getStatusCode(), ApiConstant.ERROR_404);
                break;
            case 201:
                Assert.assertEquals(response.getStatusCode(), ApiConstant.CREATED);
                break;
        }

    }
}
