package computer;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.configure();
        System.out.println(computer);

        do {
            computer.turnOn();
            computer.turnOff();
        } while (computer.getMaxWorkingCount() != 0);
    }
}
