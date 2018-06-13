import java.time.*;
public class DateTime15 {

    public static void main(String[] Strings) {

        LocalTime time = LocalTime.now();
        System.out.println("Time now hours : " + time);

        LocalTime newTime = time.plusHours(1);
        System.out.println("Time after 1 hours : " + newTime);

    }
}