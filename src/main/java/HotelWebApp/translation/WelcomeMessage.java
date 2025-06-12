package HotelWebApp.translation;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage {
    private final Locale locale;

    public WelcomeMessage(Locale locale) {
        this.locale = locale;
    }

    public String getWelcomeMessage() {
        ResourceBundle messages = ResourceBundle.getBundle("translations", locale);
        return messages.getString("welcome");
    }
}

