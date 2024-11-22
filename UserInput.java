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
        //StringTokenizer st = new StringTokenizer(bf.readLine());
        
        System.out.print("File name: ");
        String file = bf.readLine();

        if(new File(file).exists()){
            System.out.println("Do you want to create a new file? Y/N: ");
            if(UserInput.YN(bf)){
                System.out.print("File name: ");
                file = bf.readLine();
            }else{
                return new File(file);
            }
        }else if(!(new File(file).exists())){
            System.out.println("Do you want to create a new file? Y/N: ");
            if(!UserInput.YN(bf)){
                System.out.println("New File Name: ");
                file = bf.readLine();
            }else{
                return new File(file);
            }
        }
        return new File(file);
    }

    public static String userInput(BufferedReader bf) throws IOException{
        return bf.readLine();
    }

    private static boolean YN(BufferedReader bf) throws IOException{ 
        while(true){
            String a = bf.readLine();
            if(a.equalsIgnoreCase("Y")){
                return true;
            }else if(a.equalsIgnoreCase("N")){
                return false;
            }else{
                System.out.println("What did you say?");
            }
        }
    }
}