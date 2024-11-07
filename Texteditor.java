import java.io.file;
import java.io.IOException;
public class Texteditor{
       public static void main(String args[]){
        System.out.print("hello world");
        try{
            File text = new File("filename.txt");
            if (text.createNewFile()) {

            } else {
            System.out.println("File already created");
        } catch (IOException e){
            System.out.println("error ocurred, BOZO");
            e.printStackTrace();

        }

    

        }
    }
}