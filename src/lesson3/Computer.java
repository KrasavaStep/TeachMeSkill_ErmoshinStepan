package lesson3;

import java.util.Objects;
import java.util.Scanner;

public class Computer{

    String type;
    double cost;
    String brand;
    String model;
    private long maxWorkingCount;

    public Computer() {
    }


    public Cpu getCpu() {
        return cpu;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setMaxWorkingCount(long maxWorkingCount) {
        this.maxWorkingCount = maxWorkingCount;
    }

    public long getMaxWorkingCount() {
        return maxWorkingCount;
    }

    public Computer(String type, double cost, String brand, String model, long maxWorkingCount) {
        this.type = type;
        this.cost = cost;
        this.brand = brand;
        this.model = model;
        this.maxWorkingCount = maxWorkingCount;
        configureComputer();
    }

    private Cpu cpu;
    private Hdd hdd;
    private Ram ram;

    private void configureComputer(){
        String conf = "";
        Scanner scanner = new Scanner(System.in);

        int num = random();

        System.out.print("Введите через запятую - тип диска (HDD/SSD),объём(пример: 1000),брэнд(пример: ASUS): ");
        conf = scanner.nextLine();
        String[] elements = conf.split(",");
        if (num == 0)
            hdd = new Hdd(elements[0], Integer.parseInt(elements[1]), elements[2]);
        else
            hdd = new Hdd(elements[0],elements[2]);

        System.out.print("Введите через запятую - тип RAM,объём(пример: 1000): ");
        conf = scanner.nextLine();
        elements = conf.split(",");
        if (num == 0)
            ram = new Ram(Integer.parseInt(elements[1]), elements[0]);
        else
            ram = new Ram(elements[0]);

        System.out.print("Введите через запятую - частоту, количество ядер, кэш: ");
        conf = scanner.nextLine();
        elements = conf.split(",");
        if (num == 0)
            cpu = new Cpu(Integer.parseInt(elements[0]), Integer.parseInt(elements[1]), Integer.parseInt(elements[2]));
        else
            cpu = new Cpu();
    }

    @Override
    public String toString() {
        return "Computer:" +
                "\ntype='" + type  +
                "\ncost=" + cost +
                "\nbrand='" + brand  +
                "\nmodel='" + model  +
                "\nmaxWorkingCount=" + maxWorkingCount +
                "\ncpu=" + cpu +
                "\nhdd=" + hdd +
                "\nram=" + ram ;
    }

    private int random() {
        double random = Math.random();
        int number = (int) Math.round(random);
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.cost, cost) == 0 && maxWorkingCount == computer.maxWorkingCount && Objects.equals(type, computer.type) && Objects.equals(brand, computer.brand) && Objects.equals(model, computer.model) && Objects.equals(cpu, computer.cpu) && Objects.equals(hdd, computer.hdd) && Objects.equals(ram, computer.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cost, brand, model, maxWorkingCount, cpu, hdd, ram);
    }
}
