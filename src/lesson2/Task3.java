package lesson2;

import java.util.Scanner;

/**
 * ввести с клавиатуры 2 числа (Scanner)  и присвоить их двум переменнм (weght, hight).
 * Нарисовать фигуру из буквы О размером weght x hight.
 * 5x5
 * ООООО
 * ООООО
 * ООООО
 * ООООО
 * ООООО
 */

public class Task3 {

    public static void main(String[] args) {
        String str = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("width: ");
        int width = scanner.nextInt();
        System.out.print("height: ");
        int height = scanner.nextInt();

        for (int i = 0; i < width; i++) {
            str += "0";
        }

        for (int i = 0; i < height; i++) {
            System.out.println(str);
        }
    }
}
