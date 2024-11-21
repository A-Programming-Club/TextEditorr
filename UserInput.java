import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class UserInput {
    public static File fileInput() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter out = new PrintWriter("temp");
        StringTokenizer st = new StringTokenizer(bf.readLine());
        

        System.out.print("File name: ");
        String file = bf.readLine();

        while(true){
            String userInput = bf.readLine();
            write(file, userInput, true);

        }

    }
    public static void main(){}
}