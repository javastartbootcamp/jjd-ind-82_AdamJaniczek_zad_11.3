package pl.javastart.task.components;

import pl.javastart.task.Overclockable;
import pl.javastart.task.exceptions.MemoryOverheatingException;

public class Memory extends Component implements Overclockable {
    private int capacity;

    public Memory(String model, String manufacturer, String serialNo, int timing, int capacity) {
        super(model, manufacturer, serialNo, timing);
        this.capacity = capacity;
    }

    private void checkMemoryTemperature(int temp) {
        if (temperature + temp >= MAX_TEMPERATURE) {
            throw new MemoryOverheatingException("The Memory temperature is too high, max value is " + MAX_TEMPERATURE);
        }
    }

    @Override
    public void overclock(int mhz) {
        int overlocedTemperature = (mhz / TIMING_OVERLOCK) * MEMORY_TEMPERATURE_OVERLOCK;
        checkMemoryTemperature(overlocedTemperature);
        timing += mhz;
        temperature += overlocedTemperature;
        System.out.println("Pomyślnie podkręcono pamięć RAM o " + mhz + " MHz, aktualna temperatura " + getTemperature());
    }

    @Override
    public String toString() {
        return "Memory{" +
                "model='" + getModel() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", serialNo='" + getSerialNo() + '\'' +
                ", timing='" + getTiming() + '\'' +
                ", temperature='" + getTemperature() + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
