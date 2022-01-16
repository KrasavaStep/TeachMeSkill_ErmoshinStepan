package lesson4;

/***
 * Пользуясь Debug режимом я обнаружил, что в функции "getMinFromFour"
 * не используется передаваемый параметр "с" и два раза используется "b"
 * из-за чего, при исследовании значений, в переменную "firstPairResult" и
 * переменную "secondPairResult" заносился результат "11", поэтому при
 * последнем исследовании (строка 23) в метод "getMinFromTwo" производилась передача двух
 * одинаковых значений "11" и "11" и метод использовал ветку "else" и возвращал значение "11".
 * C точки зрения функционирования программа работала правильно и находила минимальное значение, но только
 * из 3-х чисел, т.к. "с" не использовалось.
 */


public class Task2 {
    public static void main(String[] args) {
        int minFromFour = getMinFromFour(14, 11, 10, 15);
        System.out.println(minFromFour);
    }

    public static int getMinFromFour(int a, int b, int c, int d) {
        int firstPairResult = getMinFromTwo(a, b);
        int secondPairResult = getMinFromTwo(d, c);

        return getMinFromTwo(firstPairResult, secondPairResult);
    }

    public static int getMinFromTwo(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
