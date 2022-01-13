package lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, котрое хотите перевести: ");
        int num = scanner.nextInt();

        System.out.printf("Для числа %d римское число - %s",num,fromRomanianToArabic(num));
    }

    private static StringBuilder fromRomanianToArabic(int number){
        Map<Integer, String> rom_ar = new HashMap<>();
        rom_ar.put(0, "O");
        rom_ar.put(1, "I");
        rom_ar.put(4, "IV");
        rom_ar.put(5, "V");
        rom_ar.put(9, "IX");
        rom_ar.put(10, "X");
        rom_ar.put(50, "L");
        rom_ar.put(90, "XC");
        rom_ar.put(100, "С");

        int buffer = number;
        StringBuilder result = new StringBuilder();

        if (number >= 0)
            do {
                if (rom_ar.containsKey(buffer))
                {
                    result.append(rom_ar.get(buffer));
                    number = number - buffer;
                    buffer = number;
                }
                else
                    buffer--;
            }
            while (number != 0);
        else result.append("Неизветное значение");

        return result;
    }
}
