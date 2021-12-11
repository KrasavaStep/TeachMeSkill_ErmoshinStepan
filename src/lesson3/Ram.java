package lesson3;

import java.util.Objects;

public class Ram {

    int capacity;
    String type;

    public Ram(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public Ram(String type){
        this.type = type;
        this.capacity = 0;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
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
}
