package pratice.trybe.exercise3;

public class Desktop extends ComputerDevice{
    public Desktop(String brand, double storageCapacity) {
        super(brand, storageCapacity);
    }
    @Override
    public void bootUp() {
        System.out.println("Bootando um pc de mesa");
    }
}
