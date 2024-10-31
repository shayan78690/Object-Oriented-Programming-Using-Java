class Calc 
{
    // public int add(int n1, int n2) {
    //     int result = n1 + n2;
    //     return result;
    // }
    // public int add(int n1, int n2, int n3) {
    //     int result = n1 + n2 + n3;
    //     return result;
    // }
    // public double add(double n1, double n2) {
    //     double result = n1 + n2;
    //     return result;
    // }
    // public void show(byte num) {
    //     System.out.println("byte" + num);
    // }
    public void show(short num) {
        System.out.println("short" + num);
    }
    public void show(char num) {
        System.out.println("char" + num);
    }
    public void show(int num) {
        System.out.println("int" + num);
    }
    public void show(double num) {
        System.out.println("double" + num);
    }
}

public class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        byte b = 5;
        obj.show(b);
        
    }
}
