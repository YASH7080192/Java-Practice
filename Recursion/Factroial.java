package Recursion;

public class Factroial {
    public static int factroialCalculate(int n){
        if(n==1 || n==0) {
           return 1;
        
    }
        int a = factroialCalculate(n-1);
        int b = n * a ;
        return b;
}
public static void main(String[] args){
    int m = factroialCalculate(4);

    System.out.println(m);
        
    }
    

}