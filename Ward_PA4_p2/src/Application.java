import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        // creating object

        DuplicateCounter d=new DuplicateCounter();

        // calling remove and write function

        d.count("problem2.txt");

        d.write("unique_word_counts.txt");

    }



}
