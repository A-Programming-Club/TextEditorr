import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class UserInput {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter("temp");
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        System.out.print("File name: ");
        String file = bf.nextToken();
        String userInput = input.nextToken();
    }
}