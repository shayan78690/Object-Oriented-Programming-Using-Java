public class SticBlokVsJavABlk {

    static int age;

    static{
        System.out.println("Static Block");
        age = 18;
    }

    static void disp() 
    {
        System.out.println("Static Display Method");
        System.out.println(age);
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        disp();
    }
}
