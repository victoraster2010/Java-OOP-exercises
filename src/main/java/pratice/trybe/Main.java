package pratice.trybe;

import pratice.trybe.exercise3.Chargeable;
import pratice.trybe.exercise3.ComputerDevice;
import pratice.trybe.exercise3.Desktop;
import pratice.trybe.exercise3.Laptop;
public class Main {
    public static void main(String[] args) {
        // Exercicio 1 abaixo, cria um objeto a partir de uma classe explica propriedades e metodos
        // Car toyotaCorolla = new Car("Toyota", "Corolla", 2020);
        // System.out.println(toyotaCorolla.exibirInformacoes());
        // System.out.println(Car.quantidadeDeCarros());
        // Car porsche911 = new Car("Porsche", "911", 1991);
        // System.out.println(porsche911.exibirInformacoes());
        // System.out.println(Car.quantidadeDeCarros());
        //exercicio 2 abaixo cria classes que herdam de uma classe pai implementando herança
        // Cleric jeanneDarc = new Cleric();
        // jeanneDarc.heal();
        //exemplo de overload o mesmo metodo com um parametro tem implementação diferente
        // jeanneDarc.heal("Poção suco de laranja");
        // jeanneDarc.heal("Milagre da santa", 50);
        // jeanneDarc.heal(25);
        // //exercicio 3
        Laptop laptop = new Laptop("Dell", 10000, 15);
        checkDevice(laptop);
        plugDevice(laptop); 
    }
    // metodo que implementa um parametro de classe abstrata qualquer classe filha pode usar essa função
    public static void checkDevice(ComputerDevice device) {
            System.out.println("verificando dispositivo da marca: "+ device.getBrand());
            device.bootUp();
        }
    //médoto que verifica objetos que estão em uma interface
    public static void plugDevice(Chargeable chargeable) {
        System.out.println("a bateria atual é"+ chargeable.getBatteryLevel());
        chargeable.charge();
       }
}