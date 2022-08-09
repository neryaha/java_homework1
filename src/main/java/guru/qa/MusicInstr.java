package guru.qa;

public class MusicInstr {

    String name;

    public MusicInstr(String name) {
        this.name = name;
    }
    void play() {
        switch (name) {
            case  ("гитара"):
                System.out.println("брынь-брынь");
                break;
            case ("барабан"):
                System.out.println("бом-бом");
                break;
            case ("труба"):
                System.out.println("бу-бу-бу");
                break;
            default:
                System.out.println("непонятно");
                break;
        }
    }

    void sayName() {
        System.out.println("это " + name);
    }

    void sayType() {
        System.out.println("тип: ");
        switch (name) {
            case  ("гитара"):
                System.out.println("струнные");
                break;
            case ("барабан"):
                System.out.println("ударные");
                break;
            case ("труба"):
                System.out.println("духовые");
                break;
            default:
                System.out.println("непонятно");
                break;
        }
    }
}
