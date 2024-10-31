class Student
{
    private int age;
    private String name;

    public void setData() {
        age  = 21;
        name = "Shayan";
    }

    public void show() {
        System.out.println(age + " " + name);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        // s.age = 21;
        // s.name = "Shayan";
        // System.out.println(s.name);
        // System.out.println(s.age);
        // s.show();

        s.setData();
        s.show();
    }
}
