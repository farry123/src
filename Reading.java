import java.io.*;
import java.util.StringTokenizer;

public class Reading{

    public static void main(String args[]){

        FileReader reader = null;
        try {
            reader = new FileReader("/Users/farry/IdeaProjects/lab8/src/example");
            int s = 0;
            StringBuffer buffer = new StringBuffer();
            while((s = reader.read())!= -1) {
                char ch = (char) s;
                buffer.append(ch);
            }

            String completedString = buffer.toString().replace("\nis ","\nwas ").replaceAll(" is "," was ");
            System.out.println(completedString);

            StringTokenizer stringTokenizer = new StringTokenizer(completedString);
            System.out.println("----------------------------------");
            System.out.println("Number of words in message: " + stringTokenizer.countTokens());





        } catch (FileNotFoundException e) {
            System.err.println("File is not found: " +
                    e.getMessage());
        } catch (IOException e) { System.out.println("IO exception: " +
                e.getMessage());
        } finally {
            if (reader != null) {
                try { reader.close();
                } catch (IOException e) {} }
        }
    }
}
