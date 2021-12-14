package lesson3;

import java.util.Scanner;

public class Main{
    static boolean on = false;
    public static void main(String[] args) {
        boolean stop = true;
        String conf = "";
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer();

        while (stop){
            System.out.print("1. Собрать ПК\n2. Включить ПК\n3. Выключить ПК\n4. Завершит программу\n");
            int num = scanner.nextInt();

            switch (num){
                case (1):
                    System.out.println("Введите тип компьтера, цену, брэнд и модель через запятую: ");
                    conf = scanner.next();
                    String[] elements = conf.split(",");
                    double maxWorkingCount = 5 + Math.random() * 20;
                    computer = new Computer(elements[0], Double.parseDouble(elements[1]),elements[2], elements[3], Math.round(maxWorkingCount) );
                    System.out.println(computer);
                    break;
                case (2):
                    if (on) System.out.println("Компьютер уже работает");
                    else {
                        if (computer.getMaxWorkingCount() > 0) {
                            System.out.println(onComputer(computer));
                        }
                        else System.out.println("Компьютер сгорел :(");
                    }
                    break;
                case (3):
                    if (!on) System.out.println("Компьютер уже выключен");
                    else System.out.println((computer));
                    break;
                case (4):
                    stop = false;
                    break;
                default:
                    System.out.println("Попробуйте ещё раз");
                    break;
            }
        }



    }

    private static String offComputer(Computer computer) {
        String answer;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 0 или 1, если значения совпадут - компьютер выживет :)");
        int num = scan.nextInt();
        if (num != random()) {
            computer.setMaxWorkingCount(0);
            return answer = "Компьютер сгорел при выключении";
        }
        else {
            on = false;
            return answer = "Компьютер выключен";
        }

    }

    private static String onComputer(Computer computer) {
        String answer;
        if (!checkComponents(computer)) {
            computer.setMaxWorkingCount(0);
            return answer = "Один из компонентов пк повреждён, компьютер сломан";
        }
        else {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите 0 или 1, если значения совпадут - компьютер выживет :)");
            int num = scan.nextInt();
            if (num != random()) {
                computer.setMaxWorkingCount(0);
                return answer = "Компьютер сгорел при влючении";
            }
            else {
                on = true;
                return answer = "Компьютер запущен";
            }
        }
    }

    private static boolean checkComponents(Computer computer){
        if (computer.getCpu().cahseSize == 0 || computer.getHdd().capacity == 0 || computer.getRam().capacity == 0) return false;
        else return true;
    }

    public static int random() {
        return 0;
    }

}
