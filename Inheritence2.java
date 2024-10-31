class Human1
{
    private String name;
    int age;

    Human1() 
    {
        System.out.println("Constructor is Called");
    }

    void sleep()
{
    age = 18;
    System.out.println("Human Needs Good Sleep");
    System.out.println(age);
}

}


class Student1 extends Human1{

    //By default there is super()
    //super()
    void display()
    {
        System.out.println("The Age is " + age);
        // System.out.println("The Name is " + name);  //We cannot access the private members of parent class
    }
}
public class Inheritence2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.sleep();
        s1.display();
    }
}
