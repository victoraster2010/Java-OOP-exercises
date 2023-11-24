package pratice.trybe;

public class Main {
    public static void main(String[] args) {
        Car toyotaCorolla = new Car("Toyota", "Corolla", 2020);
        System.out.println(toyotaCorolla.exibirInformacoes());
        System.out.println(Car.quantidadeDeCarros());
        Car porsche911 = new Car("Porsche", "911", 1991);
        System.out.println(porsche911.exibirInformacoes());
        System.out.println(Car.quantidadeDeCarros());
    }
}