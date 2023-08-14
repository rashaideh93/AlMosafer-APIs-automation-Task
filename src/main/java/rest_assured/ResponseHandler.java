package rest_assured;

public class ResponseHandler {

    public static boolean isNotNullOrEmpty(Object param) {
        return !(param == null || param.toString().isEmpty());
    }
}