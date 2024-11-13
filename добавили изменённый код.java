import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Запрашиваем у пользователя ввод числа
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        // Проверяем делимость
        checkDivisibility(number);
        scanner.close();
    }
    private static void checkDivisibility(int number) {
        checkAndPrint(number, 3);
        checkAndPrint(number, 5);
        checkAndPrint(number, 7);
    }
    private static void checkAndPrint(int number, int divisor) {
        if (number % divisor == 0) {
            System.out.println(number + " делится на " + divisor + ".");
        } else {
            System.out.println(number + " не делится на " + divisor + ".");
        }
    }
}
