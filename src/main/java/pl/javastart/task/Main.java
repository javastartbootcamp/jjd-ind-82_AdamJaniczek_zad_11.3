package pl.javastart.task;

import pl.javastart.task.components.*;
import pl.javastart.task.exceptions.CpuOverheatingException;
import pl.javastart.task.exceptions.FunctionUnavailableException;
import pl.javastart.task.exceptions.MemoryOverheatingException;

public class Main {

    public static void main(String[] args) {
        try {
            Computer computer = new Computer(
                    new Processor("Core i9-14900K", "Intel", "AZ123", 3000),
                    new Memory("GOODRAM 8G", "GoodRam", "ADG006", 2000, 4096),
                    new HardDrive("SAMSUNG 1TB", "Samsung", "GV05", 1024, HardDiskType.MVME)
            );
            computer.getProcessor().overclock(300);
            System.out.println(computer.getProcessor().toString());
            computer.getMemory().overclock(800);
            System.out.println(computer.getMemory().toString());
            System.out.println(computer.getHardDrive().toString());
            computer.getHardDrive().getTiming();
        } catch (CpuOverheatingException | MemoryOverheatingException | FunctionUnavailableException e) {
            System.err.println(e.getMessage());
        }
    }
}
