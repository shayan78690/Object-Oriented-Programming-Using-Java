class Demo 
{
    static void display1() 
    {
        System.out.println("Static Method");
    }

    void display2()
    {
        System.out.println("Non Static Method");
    }
}

public class SticMethVsNonSticMeth {
    public static void main(String[] args) {
        Demo.display1();

        Demo d = new Demo();
        d.display2();
    }
}
