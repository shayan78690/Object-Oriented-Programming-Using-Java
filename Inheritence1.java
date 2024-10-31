class Human 
{
    int age;

    void sleep()
{
    age = 18;
    System.out.println("Human Needs Good Sleep");
    System.out.println(age);
}
}

class Student extends Human{

}

public class Inheritence1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.sleep();
    }
}
