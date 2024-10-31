class Student1{
    private String name;
    private int age;

    public Student1() {
        System.out.println("Default Constructor is Called");
        name = "Rohan";
        age  = 25;
    }

    public Student1(String name) {
        this.name  = "name";
        age = 26;
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class ConstructorOver {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.disp();

        Student1 s2 = new Student1("Shayan");
        s2.disp();

        Student1 s3 = new Student1("Shayan", 21);
        s3.disp();
    }
}
