package exception;

public class EcecptinBasicDemo {
    public static void main(String[] args) {
        String a="abc";
        int num = Integer.parseInt(a);
        System.out.println(num);
    }
    catch (NumberFormatException e) {
        System.out.println("Error: Invalid number format.");
    }
   
}


