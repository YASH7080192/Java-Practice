import java.util.Scanner;
public class Inp{ 
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.print("entar a number = ");
       int a =sc.nextInt(); 
          System.out.print("enter the scand number = "); 
           int b =sc.nextInt();
       if (a>b)
            System.out.println("a is largest");
      else
            System.out.println("b is largest");
        System.out.println(a*b);
           sc.close(); 
    } 


}
