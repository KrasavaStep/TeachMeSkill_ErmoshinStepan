package computer;

import java.util.Objects;
import java.util.Scanner;

public class Computer implements ComputerMethods{

    private Ram ram = new Ram();
    private Cpu cpu = new Cpu();
    private Hdd hdd = new Hdd();
    String type;
    double cost;
    String brand;
    String model;
    private int maxWorkingCount;
    private Scanner scanner = new Scanner(System.in);

    public Computer() {

    }

    public void setMaxWorkingCount(int maxWorkingCount) {
        this.maxWorkingCount = maxWorkingCount;
    }

    public int getMaxWorkingCount() {
        return maxWorkingCount;
    }

    public void turnOn() {
        int onNumber;

        if (maxWorkingCount > 0){
            onNumber = (int) Math.round(Math.random());
            if (onNumber != inputDigit()){
                setMaxWorkingCount(0);
                System.out.println("Компьютер сгорел при включении");
            }
            else {
                setMaxWorkingCount(maxWorkingCount - 1);
                System.out.println("Компьютер включен. Включений осталось: " + maxWorkingCount);
            }
        }
    }

    public void turnOff() {
        int offNumber;

        if (maxWorkingCount > 0){
            offNumber = (int) Math.round(Math.random());
            if (offNumber != inputDigit()){
                setMaxWorkingCount(0);
                System.out.println("Компьютер сгорел при выключении");
            }
            else {
                setMaxWorkingCount(maxWorkingCount - 1);
                System.out.println("Компьютер включен. Включений осталось: " + maxWorkingCount);
            }
        }
    }

    private int inputDigit(){
        System.out.println("Введите число (0 или 1): ");
        int number = scanner.nextInt();
        return number;
    }

    @Override
    public void configure() {

        System.out.print("Введите тип: ");
        type = scanner.nextLine();
        System.out.print("Введите бренд: ");
        brand = scanner.nextLine();
        System.out.print("Введите модель: ");
        model = scanner.nextLine();
        cost = 100 + Math.round(Math.random() * 1000);
        ram.configure();
        cpu.configure();
        hdd.configure();
        setMaxWorkingCount(createMaxWorkingCount());
    }

    private static int createMaxWorkingCount() {

        return 5 + (int) Math.round(Math.random() * 10);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\nRAM=" + ram +
                "\n, Процессор=" + cpu +
                "\n, Жёсткий диск=" + hdd +
                "\n, Тип='" + type + '\'' +
                "\n, Цена=" + cost +
                "\n, Брэнд='" + brand + '\'' +
                "\n, Модель='" + model + '\'' +
                "\n, Количесвто включений/выключений =" + maxWorkingCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.cost, cost) == 0 && maxWorkingCount == computer.maxWorkingCount && Objects.equals(ram, computer.ram) && Objects.equals(cpu, computer.cpu) && Objects.equals(hdd, computer.hdd) && Objects.equals(type, computer.type) && Objects.equals(brand, computer.brand) && Objects.equals(model, computer.model) && Objects.equals(scanner, computer.scanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, cpu, hdd, type, cost, brand, model, maxWorkingCount, scanner);
    }
}
