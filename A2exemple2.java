import java.util.Scanner;

public class A2exemple2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row and column: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] num = new int[a][b];

        // input
        System.out.println("Enter array elements:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter value to search: ");
        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (num[i][j] == x) {
                    System.out.println("Value found at index: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
