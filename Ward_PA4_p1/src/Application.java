import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        DuplicateRemover duplicateRemove = new DuplicateRemover();
        System.out.println("Opening file");
        String path = "problem1.txt";

        duplicateRemove.remove(path);

        String outputFilepath = "unique_words.txt";
        duplicateRemove.write(outputFilepath);

        System.out.println("Duplicates removed");
    }
}
