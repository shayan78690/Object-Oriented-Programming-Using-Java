class Animal {
    public void eat() {
        System.out.println("Animal eats EveryDay");
    }

    public void age() {
        System.out.println("Ages are Different");
    }
}

class Tiger extends Animal {
    public void eat() {
        System.out.println("Tiger Hunts and Eats");
    }

    public void age() {
        System.out.println("Tiger Age is High");
    }
}
public class RulesOveride {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
}
