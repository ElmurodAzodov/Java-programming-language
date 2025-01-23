import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinchi sonni kiriting: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Ikkinchi sonni kiriting: ");
        double secondNumber = scanner.nextDouble();

        // Natijani hisoblash
        double result = firstNumber + secondNumber;

        System.out.println("Natija: " + result);

        scanner.close();
    }
}
