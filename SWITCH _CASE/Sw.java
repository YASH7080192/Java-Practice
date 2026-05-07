import java.util.Scanner;


public class Sw {
    

    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);

        // User se input
        System.out.println("Enter day number:");

        int day = sc.nextInt();

        // Switch statement
        switch(day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
        }

        sc.close();
    }
