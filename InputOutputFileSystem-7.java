import java.io.File;
import java.util.Date;

public class InputOutputFileSystem7 {

    public static void main(String[] args) {
        File file = new File("D:\\test");
        Date date=new Date(file.lastModified());
        System.out.println("\nThe file was last modified on: "+date+"\n");
    }
}
