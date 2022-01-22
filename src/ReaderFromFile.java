import java.io.*;
import java.util.ArrayList;

/**
 * Считать из файла числа, умножить их на 10, записать новые числа в файл
 */

public class ReaderFromFile {
    static ArrayList<String> digitsListStr = new ArrayList<>();

    public static void main(String[] args) {

        readFromFile();
        writeToFile(translateIntoDigits());
    }

    public static void readFromFile(){
        File file = new File("src/digits.txt");
        StringBuilder digit = new StringBuilder();

        try (FileReader reader = new FileReader(file)){
            int c;
            while ((c = reader.read()) != -1){
                if ((char)c != ' '){
                    digit.append((char)c);
                }
                else {
                    digitsListStr.add(digit.toString());
                    digit.setLength(0);
                }
            }
            digitsListStr.add(digit.toString());
            digit.setLength(0);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Integer> translateIntoDigits(){
        ArrayList<Integer> digitsListInt = new ArrayList<>();

        for (String digit : digitsListStr) {
            digitsListInt.add(Integer.parseInt(digit) * 10);
        }

        return digitsListInt;
    }

    public static void writeToFile(ArrayList<Integer> digitsList){

        try (FileWriter writer = new FileWriter("src/new_digits.txt", false)){
            for (int digit : digitsList) {
                writer.write(digit + " ");
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
