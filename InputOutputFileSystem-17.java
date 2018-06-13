import java.io.*;
public class InputOutputFileSystem17 {

    private static final String FILE_PATH = "D:\\test\\test.txt";
    private File file;

    public InputOutputFileSystem17() {
        file = new File(FILE_PATH);
    }

    private void readFirst3LinesInFile() {

        LineNumberReader lineNumberReader = null;
        String lines;

        try {

            lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(file)));

            while ((lines = lineNumberReader.readLine()) != null && lineNumberReader.getLineNumber() <= 3) {
                System.out.println(lines);
            }

        } catch (IOException e) {
             e.printStackTrace();

        } finally {

            try {
                assert lineNumberReader != null;
                lineNumberReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem17().readFirst3LinesInFile();
    }
}