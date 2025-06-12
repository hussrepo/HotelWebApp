package HotelWebApp.conversion;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConvert {
    public static String timeConvert(ZonedDateTime origTime) {
        ZonedDateTime et = origTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime mt = origTime.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime utc = origTime.withZoneSameInstant(ZoneId.of("UTC"));

        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        return String.format(
                "ET: %s | MT: %s | UTC: %s",
                et.format(format),
                mt.format(format),
                utc.format(format)
        );
    }
}
