package lesson5;

/**
 * Создать калькулятор, который может складывать арабские числа,
 * римские числа и арабские с римскими числами. (1 + 1; 1 + VI; VI + III)
 */

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator("1","x");
        System.out.println(calc.plus());
    }
}
