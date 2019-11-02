import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;

public class DuplicateRemover {
    public String[] uniqueWords;

    // method "remove"
    public void remove(String dataFile) {


        try {

            File file = new File(dataFile);

            Scanner scanner = new Scanner(file);

            scanner.useDelimiter("\\Z");

            Set<String> stringSet = new LinkedHashSet<String>(Arrays.asList(scanner.next().split("\\s+")));

            uniqueWords = stringSet.toArray(new String[0]);

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Found exception occurred");
        }


    }


    public void write(String outputFile ){

        try {

            FileWriter fw = new FileWriter(outputFile);

            String wordString = String.join(" ", uniqueWords);

            fw.write(wordString);

            fw.close();

        } catch (Exception e) {
            System.out.println("Could not open file" + outputFile + "for writing");
        }
    }
}
