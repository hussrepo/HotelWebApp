package HotelWebApp.translation;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WelcomeController {
    @GetMapping("/api/messages")
    public Map<String, String> getWelcomeMessages() {
        WelcomeMessage engMsg = new WelcomeMessage(Locale.US);
        WelcomeMessage freMsg = new WelcomeMessage(Locale.CANADA_FRENCH);

        Map<String, String> messages = new HashMap<>();
        messages.put("eng", engMsg.getWelcomeMessage());
        messages.put("fre", freMsg.getWelcomeMessage());

        return messages;
    }
}
