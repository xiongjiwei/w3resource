import java.io.*;
public class InputOutputFileSystem11 {

    private static final String filePath = "D:\\test\\test.txt";

    private File file;

    public InputOutputFileSystem11() {
        file = new File(filePath);
    }

    private void readFileByLines() {

        BufferedReader bufferedReader = null;

        String lines;

        try {

            bufferedReader = new BufferedReader(new FileReader(file));
            while ((lines = bufferedReader.readLine()) != null) {
                System.out.println(lines);
            }

        } catch (IOException e) {
             e.printStackTrace();

        } finally {

            try {
                assert bufferedReader != null;
                bufferedReader.close();

            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem11().readFileByLines();
    }
}