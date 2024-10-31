class Student{
    static int a;
    static int b;

    int m;
    int n;

    static 
    {
        System.out.println("Control in Static Block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("Control in Non Static Block");
        m = 5;
        n = 8;
    }

    static void display1() {
        System.out.println(a);
        System.out.println(b);
    }

    void display2() {
        System.out.println(m);
        System.out.println(n);
    }
}

public class SticAndNonSticMemOfCls {
    public static void main(String[] args) {
        Student s = new Student();
        Student.display1();
        s.display2();
    }
}
