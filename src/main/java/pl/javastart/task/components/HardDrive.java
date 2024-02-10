package pl.javastart.task.components;

import pl.javastart.task.exceptions.FunctionUnavailableException;

public class HardDrive extends Component {
    private int capacity;
    private HardDiskType hardDiskType;

    public HardDrive(String model, String manufacturer, String serialNo, int capacity, HardDiskType hardDiskType) {
        super(model, manufacturer, serialNo);
        this.capacity = capacity;
        this.hardDiskType = hardDiskType;
    }

    public HardDiskType getHardDiskType() {
        return hardDiskType;
    }

    public void setHardDiskType(HardDiskType hardDiskType) {
        this.hardDiskType = hardDiskType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void setTiming(int timing) {
        throw new FunctionUnavailableException("The timing boost function is not available in hard drive");
    }

    @Override
    public int getTiming() {
        throw new FunctionUnavailableException("The timing boost function is not available in hard drive");
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "model='" + getModel() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", serialNo='" + getSerialNo() + '\'' +
                "capacity=" + capacity +
                ", hardDiskType=" + hardDiskType +
                '}';
    }
}
