import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserOutputExample {
    public static boolean writeContents(BufferedReader contents, File outputFile) {
        try {
            BufferedWriter outputStream = new BufferedWriter(new FileWriter(outputFile));
            contents.transferTo(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
