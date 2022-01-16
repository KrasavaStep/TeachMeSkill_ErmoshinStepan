package lesson4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.printf("Номер группы: %d",checkGroup(age));
    }

    private static int checkGroup(int person_age){

       if (person_age >= 7 && person_age <= 13) return 1;
       else if (person_age >= 14 && person_age <= 17) return 2;
       else if (person_age >= 18 && person_age <= 65) return 3;
       else return -1;
    }
}
