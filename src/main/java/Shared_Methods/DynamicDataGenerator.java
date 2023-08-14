package Shared_Methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class DynamicDataGenerator {

    public static String generateRandomDepartureFrom() {
        LocalDate currentDate = LocalDate.now();
        LocalDate departureFrom = generateRandomDate(currentDate, currentDate.plusMonths(6)); // Dates within the next 6 months
        return departureFrom.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static String generateRandomDepartureTo(String departureFrom) {
        LocalDate departureFromDate = LocalDate.parse(departureFrom);
        LocalDate departureTo = departureFromDate.plusDays(7); // Second departure date, 7 days after the first date
        return departureTo.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    private static LocalDate generateRandomDate(LocalDate startDate, LocalDate endDate) {
        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();

        long randomEpochDay = ThreadLocalRandom.current().nextLong(startEpochDay, endEpochDay + 1);
        return LocalDate.ofEpochDay(randomEpochDay);
    }
}

