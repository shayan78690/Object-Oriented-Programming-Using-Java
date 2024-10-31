class Demo1 {
    int a, b;

    public Demo1() {
        System.out.println("Parent Class Constructor");
    }

    
    public Demo1(int x, int y) {
        System.out.println("Parameterized Parent Class Constructor");
        a = x;
        b = y;
    }
}

class Demo2 extends Demo1 {
    int m, n;
    public Demo2() {
        //super() - By default in every constructor
        // super(2, 5);
        this(10, 20);
        System.out.println("Child Class Constructor");
    }

    public Demo2(int x, int y) {
        System.out.println("Parameterized Child Class Constructor");
        m = x;
        n = y;
    }
}

public class ConstructorInheritnce {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        // Demo2 d1 = new Demo2(2, 5);
    }
}
