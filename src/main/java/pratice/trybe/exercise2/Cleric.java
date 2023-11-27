package pratice.trybe.exercise2;

public class Cleric extends PlayableCharacter{
    private String magic;

    public String getMagic() {
        return magic;
    }
    public void heal() {
        System.out.println("O clerigo cura, this but a scratch ");
    }
    //Overload do método anterior, adicionando um parametro a
    // implementação pode rodar quando passar um parametro
    public void heal(String potion) {
        System.out.println("O clerigo usa uma poção de cura"+ potion);
    }
    // mais um exemplo de OVERLOAD mais parametros execução diferente
    public void heal(String spell, int power) {
        System.out.println("O clerico esta usando o feitiço"
        + spell + " com " + power + " poder de magia");
    }
    public void heal(int godpower) {
        System.out.println("a santa usa godpower para cura" + godpower);
    }
    public void setMagic(String magic) {
        this.magic = magic;
    }
}
