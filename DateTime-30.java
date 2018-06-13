import java.time.*;
public class DateTime19 {

    public static void main(String[] Strings) {

        LocalDate day = LocalDate.of(2018, Month.MAY, 25);
        LocalDate oldday = LocalDate.of(2017, Month.MARCH, 1);
        Period diff = Period.between(oldday, day);
        System.out.println("Difference between "+ oldday +" and "+ day +": "+ diff.getYears() +" years and "+ diff.getMonths() +" months");
    }
}