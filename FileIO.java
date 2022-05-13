import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\DELL\\IdeaProjects" +
                    "\\File\\Data\\m.txt");
            if (f.exists()){
                System.out.println("Found!");
            }
            Scanner sc = new Scanner(f);
            while (sc.hasNext()){
                int a = sc.nextInt();
                //System.out.println(a);
                
            }
            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
