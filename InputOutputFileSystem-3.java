import java.io.File;
public class InputOutputFileSystem3 {

    public static void main(String[] args) {
        File my_file_dir = new File("D:\\test");
        if (my_file_dir.exists()) {
            System.out.println("exists.\n");

        } else {
            System.out.println("does not exist.\n");
        }
    }
}