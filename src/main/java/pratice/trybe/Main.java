package pratice.trybe;

import pratice.trybe.exercise2.Barbarian;
import pratice.trybe.exercise2.Cleric;
import pratice.trybe.exercise2.Warrior;

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
        Cleric jeanneDarc = new Cleric();
        jeanneDarc.heal();
        //exemplo de overload o mesmo metodo com um parametro tem implementação diferente
        jeanneDarc.heal("Poção suco de laranja");
        jeanneDarc.heal("Milagre da santa", 50);
        jeanneDarc.heal(25);
    }
}