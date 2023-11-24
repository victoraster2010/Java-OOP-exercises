package pratice.trybe;
/*
 * Classe carro abstrai o objeto do mundo real em um digital
 */
public class Car {
    // propriedade estatica nao e unica para cada objeto mas visivel para classe
    static int contador = 0; // atributo estatico contador se refere a quantas instancias foram criadas
    private String marca; // atributo que define a marca de cada carro instanciado
    private String modelo; // atributo que define modelo
    private int ano; // atributo que define ano
    // constructor, recebe propriedades na instanciaçao de novos objetos
    Car(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        contador++;
    }
    String exibirInformacoes() {
        return "Marca:" +this.marca + ", Modelo:" + this.modelo + ", Ano:" + this.ano;
    }
    // getters e setters como nossas propriedades sao private so sao acessiveis pelos getters e setters
    public int getAno() {
        return ano;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public static int quantidadeDeCarros(){
        return contador;
    }
}
