import java.time.*;
public class DateTime27 {

    public static void main(String[] Strings) {

        LocalTime time = LocalTime.of(3, 30, 30);

        System.out.println("Current Local time: " + time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minue: " + time.getMinute());
        System.out.println("Second: " +time.getSecond());

    }
}