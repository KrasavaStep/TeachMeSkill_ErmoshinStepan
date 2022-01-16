package lesson2;

/**
 * создать 10 переменных, 5 проинициализоровать сразу, 5 в ходе выполнения программы,
 * причем вторые 5 иниц из первых 5. (*, /, -, %), также использовать все числовые типы
 */

public class Task2 {

    public static void main(String[] args) {
        int first = 3;
        short second = 7;
        byte third = 5;
        float fourth = 17f;
        double fifth = 66;
        float sixth;
        int seventh;
        double eighth;
        int ninth;
        long tenth;

        sixth = second * fourth;
        seventh = first / third;
        eighth = fifth % second;
        ninth = third - second;
        tenth = first + second;

        System.out.println(sixth + "\n" + seventh + "\n" + eighth + "\n" + ninth + "\n" + tenth );
    }
}
