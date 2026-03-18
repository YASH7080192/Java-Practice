// package exception;
// public class Exc1{
// public static void main(String[] args){

//     try {

    
//     int x=10/0;
//     System.out.println(x);
//     }


// catch(ArithmeticException ob) {
//     System.out.println("Error: Division by zero is not allowed.");


// }
// finally{
//     System.out.println("Finally block executed.");
// }
// System.out.println("Program done.");{
// }
// }
// }

// wap to assign a null string value to string object and convert to uppercase without showing error

public class Exc2 {
    public static void main(String[] args) {
        String str = null;
        try {
            str = str.toUpperCase();

        } 
        catch (NullPointerException e) {
            System.out.println("Error: String is null.");
        }
        finally{
            System.out.println("Finally block executed.");
        }
        System.out.println(str);
    }
}