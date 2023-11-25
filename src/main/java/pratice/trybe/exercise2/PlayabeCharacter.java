package pratice.trybe.exercise2;

public class PlayabeCharacter {
    private String name;
    private String race;

    public String getName() {
        return name;
    }
    public String getRace() {
        return race;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public String getInfo(){
        return "Nome: " + this.name + ", Raça: " + this.race;
    }
}
