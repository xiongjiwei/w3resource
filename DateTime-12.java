import java.text.DateFormatSymbols;
import java.util.Locale;

public class DateTime12 {

    public static void main(String []args){

        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("chinsese"));

        String[] dayNames = symbols.getWeekdays();
        for (String s : dayNames) {
            System.out.println(s);
        }
    }
}
