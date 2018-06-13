import java.time.*;
public class DateTime22 {

    public static void main(String[] Strings) {

        LocalDate today = LocalDate.now();
        System.out.println("Current Date: "+today);
        System.out.println("10 days before today is "+today.plusDays(-10));
        System.out.println("10 days after today is "+today.plusDays(10));

    }
}