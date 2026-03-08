package abstraction.string;

public class StringPool {

    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "java";
        String s3 = new String("hello");

        System.out.println(s1 == s2);      // true
        System.out.println(s1 == s3);      // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }
}
