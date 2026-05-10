package fileHandling;
import java.io.*;

public class Write {

    public static void main(String[] args) {
        try{
            FileWriter p = new FileWriter("ok.txt");
    

                p.write("name=yash");
                p.write("age= 25");

        
                    p.close();



    }catch (IOException e) {
        System.out.println(e);
        }

    }

}