package pratice.trybe.exercise3;

// Atividade sobre classes e metodos abstratos
public abstract class ComputerDevice {
    private String brand;
    private double storageCapacity;

    public ComputerDevice(String brand, double storageCapacity) {
        this.brand = brand;
        this.storageCapacity = storageCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    // Método abstrato deve ser implementado em classes filhas
    public abstract void bootUp();

}
