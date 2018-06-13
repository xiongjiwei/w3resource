import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutputFileSystem16 {

    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
        {
            String filename= "D:\\test\\test.txt";
            FileWriter fw = new FileWriter(filename,true);
            //appends the string to the file
            fw.write("Java Exercises\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader(filename));
            //read the file content
            while (strLine != null)
            {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}
