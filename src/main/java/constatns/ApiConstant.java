package constatns;

public class ApiConstant {

    public static final String ACCEPT_LANGUAGE;
    public static final int SUCCESS;
    public static final int ERROR_422;
    public static final int ERROR_401;
    public static final int ERROR_404;
    public static final int CREATED;
    public static final String PostCalenderFearsApi;
    private static final String Almosafer_URL;
    public static String Flight_Search;


    static {

        Almosafer_URL = "https://www.almosafer.com/";
        ACCEPT_LANGUAGE = "en-gb";
        SUCCESS = 200;
        ERROR_422 = 422;
        ERROR_401 = 401;
        ERROR_404 = 404;
        CREATED = 201;
        PostCalenderFearsApi = Almosafer_URL + "api/v3/flights/flight/get-fares-calender";
    }


    public static void setFlightSearch(String originId, String destinationId, String departure, String arrive, String cabin
            , String passenger) {

        Flight_Search = Almosafer_URL + "api/v3/flights/flight/search?query=" + originId + "-" + destinationId + "/" + departure +
                "/" + arrive + "/" + cabin + "/" + passenger + "Adult";
    }
}
