import java.util.Scanner;


public class OnedArray {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.print("emter a numer"+ " " );
         int sci= sc.nextInt();
          int[] marks = new int[sci];
         
        System.out.print("Enter the numbers");
        for(int i=0;i<sci;i++){
            marks[i] =sc.nextInt();
    
        }

        System.out.print("Numbers are : " + " ");

        for(int i=0; i<sci; i++){
         System.out.print(marks[i]+ " ");
       
           
          }
}
}