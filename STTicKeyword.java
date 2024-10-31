public class STTicKeyword {

    static int a;

    static 
    {
        a = 10;
        System.out.println("Static Block");
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
