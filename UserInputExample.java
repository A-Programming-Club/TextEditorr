import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputExample {
    public static File promptForFilename() throws IOException {
        /*
         * Should this become a `private static` member of `UserInput`?
         * Doing so would mean we don't need to open and manage multiple readers for
         * the same input stream, `System.in`, when adding new functionality.
         */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Filename: ");
        String filename = in.readLine();
        File chosenFile = new File(filename);

        /*
         * `createNewFile() should create the requested file if it does not already
         * exist.
         * If the requested file already exists, this does nothing and `chosenFile` will
         * be whatever file the user chose.
         */
        chosenFile.createNewFile();
        return chosenFile;
    }
}
