package pl.javastart.task.components;

import pl.javastart.task.Overclockable;

import pl.javastart.task.exceptions.CpuOverheatingException;

public class Processor extends Component implements Overclockable {

    public Processor(String model, String manufacturer, String serialNo, int timing) {
        super(model, manufacturer, serialNo, timing);
        temperature = 55;
    }

    private void checkCpuTemperature(int temp) {
        if (temperature + temp >= MAX_TEMPERATURE) {
            throw new CpuOverheatingException("The CPU temperature is too high, max value is " + MAX_TEMPERATURE);
        }
    }

    @Override
    public void overclock(int mhz) {
        int overlocedTemperature = (mhz / TIMING_OVERLOCK) * MEMORY_TEMPERATURE_OVERLOCK;
        checkCpuTemperature(overlocedTemperature);
        timing += mhz;
        temperature += overlocedTemperature;
        System.out.println("Pomyślnie podkręcono CPU o " + mhz + " MHz, aktualna temperatura wynosi " + getTemperature());
    }

    @Override
    public String toString() {
        return "Procesor{" +
                "model='" + getModel() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", serialNo='" + getSerialNo() + '\'' +
                ", timing=" + getTiming() +
                ", temperature=" + getTemperature() +
                '}';
    }
}
