
import java.util.Scanner;

public class MainEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("non-negative integer: ");
        int n = scanner.nextInt();
        int num=5;

        if (n < 0) {
            System.out.println(" negative numbers.");
        } else {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + num + " is: " + fact);
        }

        scanner.close();
    }
}
