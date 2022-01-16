package computer;

import java.util.Objects;

public class Hdd implements ComputerMethods{

    String type;
    int capacity;
    String brand;

    public Hdd() {

    }

    @Override
    public String toString() {
        return "Hdd{" +
                "тип='" + type + '\'' +
                ", вместимость=" + capacity +
                ", брэнд='" + brand + '\'' +
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

    @Override
    public void configure() {
        type = setType();
        capacity = 500 + (int) Math.round( Math.random() * 2000);
        brand = setBrand();
    }

    private String setType(){

        if ((int) Math.round( Math.random()) == 1) {
            return "SSD";
        }
        else {
            return "HDD";
        }
    }

    private String setBrand(){
        int randomNumberForChoice;
        String[] listOfBrands = {"ASUS", "HyperPC", "Kingston", "Other"};

        randomNumberForChoice = (int) Math.round( Math.random() * 4);
        return listOfBrands[randomNumberForChoice];
    }
}
