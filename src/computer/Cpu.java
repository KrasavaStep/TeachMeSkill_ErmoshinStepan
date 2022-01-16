package computer;

import java.util.Objects;

public class Cpu implements ComputerMethods{

    int clockFrequency;
    int coreCount;
    int cashSize;

    public Cpu() {

    }

    @Override
    public String toString() {
        return "Cpu{" +
                "Тактовая частота=" + clockFrequency +
                ", количесвто ядер=" + coreCount +
                ", кэш=" + cashSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cpu cpu = (Cpu) o;
        return clockFrequency == cpu.clockFrequency && coreCount == cpu.coreCount && cashSize == cpu.cashSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clockFrequency, coreCount, cashSize);
    }

    @Override
    public void configure() {
        clockFrequency = 2 + (int) Math.round(Math.random() * 4);
        coreCount = 2 + (int) Math.round(Math.random() * 10);
        cashSize = 100 + (int) Math.round(Math.random() * 1000);
    }
}
