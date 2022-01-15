package lesson2;

public class Task4 {
    public static void main(String[] args) {
        int first = 0b101;
        int second = 0b1010;

        int sum = first + second;
        int sub = first - second;
        int div = first / second;
        int percent = first % second;
        int mult = first * second;
        int logic_mult = first & second;
        int logic_sum = first | second;
        int xor = first ^ second;
        int logic_no = ~second;

        System.out.println("sum: " + sum +
                "\nsub: " + sub +
                "\npercent: " + percent +
                "\ndiv: " + div +
                "\nmult: " + mult +
                "\nlogic mult: " + logic_mult +
                "\nlogic sum: " + logic_sum +
                "\nlogic no: " + logic_no +
                "\nxor: " + xor);
    }
}
