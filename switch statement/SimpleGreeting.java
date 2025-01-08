import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SimpleGreeting {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime = now.format(formatter);

        String greeting;
        
        int hour = now.getHour();
        if (hour >= 5 && hour < 12) {
            greeting = "Good Morning";
        } else if (hour >= 12 && hour < 17) {
            greeting = "Good Afternoon";
        } else if (hour >= 17 && hour < 21) {
            greeting = "Good Evening";
        } else {
            greeting = "Good Night";
        }

        System.out.println(greeting + "! The current time is: " + formattedTime);
    }
}
