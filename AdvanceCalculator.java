import java.util.Scanner;

public class AdvanceCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number : ");
        int a = sc.nextInt();

        System.out.println("Enter The Second Number : ");
        int b = sc.nextInt();

        System.out.println("\nChoose The Operation: ");
        System.out.println("1. Addition");
        System.out.println("2. subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.println("Enter the Choice : ");
        int choice = sc.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Result : " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result : " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result : " + result);
                break;
            case 4:
                result = a / b;
                System.out.println("Result : " + result);
                break;
            case 5:
                result = a % b;
                System.out.println("Result : " + result);
                break;

            default:
                System.out.println("Invalid Integer");
                break;
        }

        sc.close();
    }
}
