package HotelWebApp.conversion;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TimeController {
    @GetMapping("/api/timeconvert")
    public String getTimeConvert() {
        ZonedDateTime current = ZonedDateTime.now();
        String result = TimeConvert.timeConvert(current);
        return result;
    }
}
