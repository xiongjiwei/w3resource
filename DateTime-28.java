import java.time.*;
public class DateTime28 {

    public static void main(String[] Strings) {

        LocalDateTime dateTime = LocalDateTime.now().minusHours(1).minusMinutes(20);
        System.out.println("Current Date and Time:  " + LocalDateTime.now());
        System.out.println("Before 1 houres and 20 minutes: " + dateTime);
    }
}