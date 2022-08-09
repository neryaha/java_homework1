package guru.qa;

public class MusicInstr {

    String name;

    public MusicInstr(String name) {
        this.name = name;
    }
    void play() {
        if (name == "guitar") {
            System.out.println("брынь-брынь");
        } else {
            System.out.println("непонятно");
        }
    }

    void sayName() {
        System.out.println("Это " + name);
    }

    void sayType() {

    }
}
