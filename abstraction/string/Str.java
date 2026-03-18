package abstraction.string;

import java.util.Scanner;

public class Str {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        String n;
        System.out.println("enter your name");
        n=sc.nextLine();

      for(int i=0 ;i<n.length();i++){
        System.out.println(i);
      }
    }
    
}
