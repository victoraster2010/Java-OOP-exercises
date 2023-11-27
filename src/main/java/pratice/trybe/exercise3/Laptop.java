package pratice.trybe.exercise3;

public class Laptop extends ComputerDevice implements Chargeable{
    private double size;
    public Laptop(String brand, double storageCapacity, double size) {
        super(brand, storageCapacity);

        this.size = size;
    }

    @Override
    public void charge() {
        System.out.println("carregando");
    }

    @Override
    public int getBatteryLevel() {
        return 85;
    }

    @Override 
    public void bootUp() {
        System.out.println("Inicializando laptop de tela: " + size);
    }
}
