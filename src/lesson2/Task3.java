package lesson2;

import java.util.Scanner;
import java.util.SortedMap;

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
