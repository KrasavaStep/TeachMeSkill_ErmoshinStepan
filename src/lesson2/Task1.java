package lesson2;

public class Task1 {
    public static void main(String[] args) {
        int first_number = 3;
        short second_number = 6;
        byte third_number = 21;

        int max, min, avg;

        max = Math.max(first_number, Math.max(second_number, third_number));
        min = Math.min(first_number, Math.min(second_number, third_number));

        if (first_number > min && first_number < max)
            avg = first_number;
        else if (second_number > min && second_number < max)
            avg = second_number;
        else avg = third_number;

        System.out.println("Maximum: " + max +
                "\nMinimum: " + min +
                "\nAverage: " + avg);
    }
}
