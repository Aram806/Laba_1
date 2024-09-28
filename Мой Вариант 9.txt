import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Запрашиваем у пользователя ввод числа
System.out.print("Введите число: ");
int number = scanner.nextInt();

// Проверяешь делимость на 3, 5 и 7
if (number % 3 == 0) {
System.out.println(number + " делится на 3.");
} else {
System.out.println(number + " не делится на 3.");
}

if (number % 5 == 0) {
System.out.println(number + " делится на 5.");
} else {
System.out.println(number + " не делится на 5.");
}

if (number % 7 == 0) {
System.out.println(number + " делится на 7.");
} else {
System.out.println(number + " не делится на 7.");
}

scanner.close();
}
}



Сократили код


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Запрашиваем у пользователя ввод числа
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        
        // Массив делителей
        int[] divisors = {3, 5, 7};

        // Проверка делимости
        for (int divisor : divisors) {
            System.out.println(number + (number % divisor == 0 ? " делится на " : " не делится на ") + divisor + ".");
        }

        scanner.close();
    }
}
