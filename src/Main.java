import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            if (isPrime(n)) {
                System.out.println("prime");
            } else {
                System.out.println("composite");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите целое число.");
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt (n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

