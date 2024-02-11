package pl.javastart.task.exceptions;

public class CpuOverheatingException extends RuntimeException {
    public CpuOverheatingException(String message) {
        super(message);
    }
}
