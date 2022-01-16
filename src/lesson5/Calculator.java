package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Сделать класс калькулятор, который складывает римские числа с арабскими, арабские с арабскими, римские с римскими
 */

public class Calculator{

    static String digit1;
    static String digit2;
    private static int newDigit1;
    private static int newDigit2;
    private static boolean isDigit1ARomanian = false;
    private static boolean isDigit2Romanian = false;
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

    final static Map<String, Integer> ARABIC_DIGITS = new HashMap<>();
    static {
        ARABIC_DIGITS.put("0", 0);
        ARABIC_DIGITS.put("I", 1);
        ARABIC_DIGITS.put("IV", 4);
        ARABIC_DIGITS.put("V", 5);
        ARABIC_DIGITS.put("IX", 9);
        ARABIC_DIGITS.put("X", 10);
        ARABIC_DIGITS.put("XL", 40);
        ARABIC_DIGITS.put("L", 50);
        ARABIC_DIGITS.put("XC", 90);
        ARABIC_DIGITS.put("C", 100);
    }

    public Calculator(String digit1, String digit2) {
        this.digit1 = digit1;
        this.digit2 = digit2;
        numberTranslation();
    }

    private static StringBuilder fromArabicToRomanian(int number){
        int buffer = number;
        StringBuilder result = new StringBuilder();

        if (number >= 0)
            do {
                if (ROMANIAN_DIGITS.containsKey(buffer))
                {
                    result.append(ROMANIAN_DIGITS.get(buffer));
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

    private static int fromRomanianToArabic(String number){
        int result = 0;
        ArrayList<String> allDigits = new ArrayList<>();
        String[] splitDigit = number.split("(?<=\\G.{2})");

        for (String pair: splitDigit) {
            if (ROMANIAN_DIGITS.containsValue(pair)){
                allDigits.add(pair);
            }
            else{
                if (pair.length() == 2) {
                    allDigits.add(String.valueOf(pair.charAt(0)));
                    allDigits.add(String.valueOf(pair.charAt(1)));
                }
                else {
                    allDigits.add(String.valueOf(pair.charAt(0)));
                }
            }
        }

        for (String digit : allDigits) {
            result += ARABIC_DIGITS.get(digit);
        }

        return result;
    }

    private static void numberTranslation(){

        try {
            newDigit1 = Integer.parseInt(digit1);
        } catch (NumberFormatException e){
            isDigit1ARomanian = true;
            newDigit1 = fromRomanianToArabic(digit1.toUpperCase());
        }

        try {
            newDigit2 = Integer.parseInt(digit2);
        } catch (NumberFormatException e) {
            isDigit2Romanian = true;
            newDigit2 = fromRomanianToArabic(digit2.toUpperCase());
        }
    }

    public StringBuilder plus() {
        int result;

        result = newDigit1 + newDigit2;
        if (isDigit1ARomanian || isDigit2Romanian){

            return fromArabicToRomanian(result);
        }
        else {
            return new StringBuilder(Integer.toString(result));
        }
    }
}
