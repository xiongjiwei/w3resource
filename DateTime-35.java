import java.util.*;
import java.text.*;
public class DateTime35 {

    public static void main(String[] Strings) {

        try {
            String originalString = "2018-05-25 19:31:02";
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
            String newstr = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
            System.out.println(newstr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}