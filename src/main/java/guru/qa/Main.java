package guru.qa;

public class Main {
    public static void main(String[] args) {
        MusicInstr guitar = new MusicInstr("труба");
        guitar.sayName();
        guitar.play();
        guitar.sayType();
    }
}