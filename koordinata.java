import java.util.Scanner;

public class koordinata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("X koordinatasini kiriting: ");
        double x = scanner.nextDouble();

        System.out.print("Y koordinatasini kiriting: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Nuqta I chorakka tegishli.");
        } else {
            System.out.println("Nuqta I chorakka tegishli emas.");
        }

        scanner.close();
    }
}
