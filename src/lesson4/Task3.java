package lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Создайте набор пар арабское – римское O, I, V, X, M
 * Напишите метод по переводу арабских чисел от 0 до 100 в римские используя данную мапу.
 */

public class Task3 {

    final static Map<Integer, String> ROMANIAN_DIGITS = new HashMap<>();
    static {
        ROMANIAN_DIGITS.put(0, "O");
        ROMANIAN_DIGITS.put(1, "I");
        ROMANIAN_DIGITS.put(4, "IV");
        ROMANIAN_DIGITS.put(5, "V");
        ROMANIAN_DIGITS.put(9, "IX");
        ROMANIAN_DIGITS.put(10, "X");
        ROMANIAN_DIGITS.put(40, "XL");
        ROMANIAN_DIGITS.put(50, "L");
        ROMANIAN_DIGITS.put(90, "XC");
        ROMANIAN_DIGITS.put(100, "С");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, котрое хотите перевести: ");
        int arabicNumber = scanner.nextInt();
        System.out.printf("Для числа %d римское число - %s",arabicNumber,fromRomanianToArabic(arabicNumber));
    }

//    private static StringBuilder fromRomanianToArabic(int number){
//
//
//        int buffer = number;
//        StringBuilder result = new StringBuilder();
//
//        if (number >= 0)
//            do {
//                if (ROMANIAN_DIGITS.containsKey(buffer))
//                {
//                    result.append(ROMANIAN_DIGITS.get(buffer));
//                    number = number - buffer;
//                    buffer = number;
//                }
//                else
//                    buffer--;
//            }
//            while (number != 0);
//        else result.append("Неизветное значение");
//
//        return result;
//    }


    private static StringBuilder fromRomanianToArabic(int number){
        StringBuilder result = new StringBuilder();

        if (number >= 100){
            result.append(ROMANIAN_DIGITS.get(100));
            number = number - 100;
        }
        if (number >= 90){
            result.append(ROMANIAN_DIGITS.get(90));
            number = number - 90;
        }
        if (number >= 50){
            result.append(ROMANIAN_DIGITS.get(50));
            number = number - 50;
        }
        if (number >= 40){
            result.append(ROMANIAN_DIGITS.get(40));
            number = number - 40;
        }
        if (number >= 10){
            result.append(ROMANIAN_DIGITS.get(10));
            number = number - 10;
        }
        if (number >= 10){
            result.append(ROMANIAN_DIGITS.get(10));
            number = number - 10;
        }
        if (number >= 10){
            result.append(ROMANIAN_DIGITS.get(10));
            number = number - 10;
        }
        if (number >= 9){
            result.append(ROMANIAN_DIGITS.get(9));
            number = number - 9;
        }
        if (number >= 5){
            result.append(ROMANIAN_DIGITS.get(5));
            number = number - 5;
        }
        if (number >= 4){
            result.append(ROMANIAN_DIGITS.get(4));
            number = number - 4;
        }
        if (number >= 3){
            result.append(ROMANIAN_DIGITS.get(1));
            number = number - 1;
        }
        if (number >= 2){
            result.append(ROMANIAN_DIGITS.get(1));
            number = number - 1;
        }
        if (number >= 1){
            result.append(ROMANIAN_DIGITS.get(1));
            number = number - 1;
        }
        if (number == 0 && result.toString().equals("")){
            result.append(ROMANIAN_DIGITS.get(0));
        }
        return result;
    }
}
