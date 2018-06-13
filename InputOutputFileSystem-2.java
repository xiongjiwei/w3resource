import java.io.File;
public class InputOutputFileSystem2 {

    private static final String filePath = "D:\\test";

    private File file;

    public InputOutputFileSystem2() {
        file = new File(filePath);
    }

    public static void main(String[] args) {
        String[] fileList = file.list((dir, name) -> name.toLowerCase().endsWith(".java"));

        for (String fileName : fileList) {
            System.out.println(fileName);
        }
    }
}