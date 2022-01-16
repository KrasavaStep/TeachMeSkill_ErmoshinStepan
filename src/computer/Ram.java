package computer;

import java.util.Objects;
import java.util.Random;

public class Ram implements ComputerMethods {

    int capacity;
    String type;

    public Ram() {

    }

    @Override
    public String toString() {
        return "Ram{" +
                "вместительность=" + capacity +
                ", тип='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ram ram = (Ram) o;
        return capacity == ram.capacity && Objects.equals(type, ram.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, type);
    }

    @Override
    public void configure() {
        capacity = 4000 + (int) Math.round( Math.random() * 32000);
        type = setType().toString();
    }

    private static StringBuilder setType(){
        StringBuilder type = new StringBuilder("RAM ");
        Random random = new Random();

        for (int i = 0; i <= 10; i++) {
            char c = (char)(random.nextInt(26) + 'a');
            type.append(c);
        }
        return type;
    }
}
