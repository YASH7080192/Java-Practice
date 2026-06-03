package fileHandling;

import java.io.FileReader;
import java.io.IOException;


public class Read {
    public static void main(String[] args) {
        
    try{
        FileReader fi = new FileReader("ok.txt");
        int i; 
        while((i=fi.read())!=-1){
            System.out.println(((char)i));
        }
        fi.close();
    }catch(IOException e){
        System.out.println("An error occurred while reading the file.");
    }
    }
}
