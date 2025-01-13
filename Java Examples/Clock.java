import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class Clock {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                LocalTime time = LocalTime.now();
                int hours = time.getHour();
                int minutes = time.getMinute();
                int seconds = time.getSecond();

                String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
                System.out.println(formattedTime);
            }
        }, 0, 1000); 
    }
}
