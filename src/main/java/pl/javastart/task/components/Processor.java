package pl.javastart.task.components;

import pl.javastart.task.Overclockable;

import pl.javastart.task.exceptions.CpuOverheatingException;

public class Processor extends Component implements Overclockable {

    public Processor(String model, String manufacturer, String serialNo, int timing) {
        super(model, manufacturer, serialNo, timing);
        setTemperature(55);
    }

    private void checkCpuTemperature() {
        if (getTemperature() >= MAX_TEMPERATURE) {
            throw new CpuOverheatingException("The CPU temperature is too high, max value is " + MAX_TEMPERATURE);
        }
    }

    @Override
    public void overclock(int mhz) {
        checkCpuTemperature();
        setTiming(getTiming() + mhz);
        setTemperature(getTemperature() + ((mhz / TIMING_OVERLOCK) * CPU_TEMPERATURE_OVERLOCK));
        checkCpuTemperature();
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
