import java.io.File;
public class InputOutputFileSystem1 {

    public static void main(String[] args) {
        File file = new File("D:\\test");
        String[] fileList = file.list();

        for(String name:fileList){
            System.out.println(name);
        }
    }
}