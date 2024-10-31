public class InstanceVsLocalVar {
    int a = 2;
    String name = "John"; //Instance Variables
    public static void main(String[] args) {
        int num = 10;
        InstanceVsLocalVar obj = new InstanceVsLocalVar(); //Local Variables //Reference Variable
        InstanceVsLocalVar obj1 = new InstanceVsLocalVar();

        obj.name = "Shayan";

        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(obj1.a);
        System.out.println(obj1.name);
    }    
}
