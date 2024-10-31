class Demo 
{
    private int a;
    private int b;

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class MoreConstructor {
    public static void main(String[] args) {
        // Demo d = new Demo(); //Default Constructor by Java Compiler
        // d.display();

        Demo d1 = new Demo(2, 5);
        d1.display();

    }
}
