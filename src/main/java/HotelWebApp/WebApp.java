package HotelWebApp;

import HotelWebApp.translation.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class WebApp {
	public static void main(String[] args) {

		SpringApplication.run(WebApp.class, args);

		//Create message vars
		WelcomeMessage engMsg = new WelcomeMessage(Locale.US);
		WelcomeMessage freMsg = new WelcomeMessage(Locale.CANADA_FRENCH);
		//Thread ENG
		Thread engThread = new Thread(() -> {
			String message = engMsg.getWelcomeMessage();
			System.out.println("ENG: " + message + " Thread: " + Thread.currentThread().getId());
		});
		//Thread FRE
		Thread freThread = new Thread(() -> {
			String message = freMsg.getWelcomeMessage();
			System.out.println("FRE: " + message + " Thread: " + Thread.currentThread().getId());
		});
		engThread.start();
		freThread.start();
		try {
			engThread.join();
			freThread.join();
		} catch (InterruptedException e) {
			System.out.println("Thread(s) Interrupt Error: " + e.getMessage());
		}
		}
	}


