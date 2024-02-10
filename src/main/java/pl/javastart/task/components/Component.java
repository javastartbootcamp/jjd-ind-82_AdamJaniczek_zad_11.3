package pl.javastart.task.components;

public abstract class Component {
    public static final int MAX_TEMPERATURE = 95;
    public static final int TIMING_OVERLOCK = 100;
    public static final int CPU_TEMPERATURE_OVERLOCK = 10;
    public static final int MEMORY_TEMPERATURE_OVERLOCK = 15;
    private String model;
    private String manufacturer;
    private String serialNo;
    private int timing;
    private int temperature;

    public Component(String model, String manufacturer, String serialNo, int timing) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.serialNo = serialNo;
        this.timing = timing;
    }

    public Component(String model, String manufacturer, String serialNo) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.serialNo = serialNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
