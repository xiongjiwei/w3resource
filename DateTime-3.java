import java.util.Calendar;

public class DateTime3 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println();
        System.out.println("\nCurrent Date and Time:" + cal.getTime());

        System.out.println("Actual Maximum Year: " + cal.getActualMaximum(Calendar.YEAR));
        System.out.println("Actual Maximum Month: " + cal.getActualMaximum(Calendar.MONTH));
        System.out.println("Actual Maximum Week of Year: " + cal.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("Actual Maximum Date: " + cal.getActualMaximum(Calendar.DATE) + "\n");
        System.out.println();

    }
}
