import java.util.Calendar;

public class DateTime11 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
