import java.io.File;
public class InputOutputFileSystem5 {

    public static void main(String[] args) {

        File my_file_dir = new File("D:\\test\\test.txt");

        if (my_file_dir.isDirectory()){
            System.out.println(my_file_dir.getAbsolutePath() + " is a directory.\n");

        } else {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.\n");
        }

        if (my_file_dir.isFile()) {
            System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");

        } else {
            System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
        }
    }
}