package lesson3;

import java.util.Objects;

public class Cpu {

    int clockFrequency;
    int coreCount;
    int cahseSize;

    public Cpu(int clockFrequency, int coreCount, int cahseSize){
        this.clockFrequency = clockFrequency;
        this.coreCount = coreCount;
        this.cahseSize = cahseSize;
    }

    public Cpu(){
        this.cahseSize = 0;
        this.coreCount = 0;
        this.clockFrequency = 0;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "clockFrequency=" + clockFrequency +
                ", coreCount=" + coreCount +
                ", cahseSize=" + cahseSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cpu cpu = (Cpu) o;
        return clockFrequency == cpu.clockFrequency && coreCount == cpu.coreCount && cahseSize == cpu.cahseSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clockFrequency, coreCount, cahseSize);
    }
}
