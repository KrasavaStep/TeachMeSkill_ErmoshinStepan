package lesson3;

import java.util.Scanner;

public class Main{
    static boolean on = false;
    public static void main(String[] args) {
        boolean stop = true;
//        String conf = "";
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer();

        while (stop){
            System.out.print("1. Собрать ПК\n2. Включить ПК\n3. Выключить ПК\n4. Сравнить ПК\n5. Завершит программу\n");
            int num = scanner.nextInt();

            switch (num){
                case (1):
                    computer = createPC();
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
                    System.out.println("Сравниваются созданый ПК и новый ПК");

                    if (computer.cost != 0) {
                        System.out.println("Новый ПК: ");
                        Computer computers = createPC();
                        System.out.println("Компьютеры равны ?: "+computer.equals(computers));
                        System.out.println(computers);
                        System.out.println(computer);
                    }
                    else {
                        System.out.println("Старого ПК нет, создайте два новых для сравнения: ");
                        System.out.println("Новый ПК №1: ");
                        Computer computer1 = createPC();
                        System.out.println("Новый ПК №2: ");
                        Computer computer2 = createPC();

                        System.out.println("Компьютеры равны?: "+computer1.equals(computer2));
                        System.out.println(computer1);
                        System.out.println(computer2);
                    }

                case (5):
                    stop = false;
                    break;
                default:
                    System.out.println("Попробуйте ещё раз");
                    break;
            }
        }
    }

    private static Computer createPC(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип компьтера, цену, брэнд и модель через запятую: ");
        String conf = scanner.next();
        String[] elements = conf.split(",");
        double maxWorkingCount = 5 + Math.random() * 20;
        Computer computer = new Computer(elements[0], Double.parseDouble(elements[1]),elements[2], elements[3], Math.round(maxWorkingCount) );

        return computer;
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
