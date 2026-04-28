package Recursion;

public class Add {
    public static void Adds(int i, int b, int sum) 
    {
if(i==b){
        sum += i;
        System.out.println(sum);
        return; 
    }
  sum += i;
    Adds(i+1, b, sum);

    }
   public static void main(String[] args) {
   Adds(1,6,0);
         
    }
}
