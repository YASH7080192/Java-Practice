package abstraction.string;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("java");

        sb.append(" programming");
        sb.insert(0, "welcome to ");
        sb.replace(11, 22, "OOP");

        System.out.println(sb.toString());
    }
}
