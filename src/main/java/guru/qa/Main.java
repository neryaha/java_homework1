package guru.qa;

public class Main {
    public static void main(String[] args) {
        MusicInstr guitar = new MusicInstr("guitar");
        guitar.play();
        guitar.sayName();
        guitar.sayType();
    }
}