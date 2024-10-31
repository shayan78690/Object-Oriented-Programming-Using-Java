class Animal
{
    void sleep()
    {
        System.out.println("Animal is Sleeping");
    }
}

class Tiger extends Animal {

}

public class FinalKyword {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
    }
}
