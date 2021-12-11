package lesson3;

import java.util.Objects;

class Hdd {
    String type;
    int capacity;
    String brand;

    public Hdd(String type, int capacity, String brand) {
        this.type = type;
        this.capacity = capacity;
        this.brand = brand;
    }

    public Hdd(String type, String brand){
        this.type = type;
        this.brand = brand;
        this.capacity = 0;
    }


    @Override
    public String toString() {
        return "Hdd{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hdd hdd = (Hdd) o;
        return capacity == hdd.capacity && Objects.equals(type, hdd.type) && Objects.equals(brand, hdd.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, brand);
    }
}
