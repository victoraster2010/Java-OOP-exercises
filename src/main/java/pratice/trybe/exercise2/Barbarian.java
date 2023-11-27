package pratice.trybe.exercise2;

public class Barbarian extends PlayableCharacter {
    @Override
    public void move() {
        System.out.println("O bárbaro pega impulso");
        super.move();
    }
}
