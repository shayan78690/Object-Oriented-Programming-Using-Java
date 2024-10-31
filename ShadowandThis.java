class Student{
    private int age;
    private String name;

    public void setData1(int age) {
        this.age = age;
    }

    
    public void setData2(String name) {
        this.name  = name;
    }

    public void show() {
        System.out.println(age);
        System.out.println(name);
    }
}

public class ShadowandThis {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();

        s.setData1(21);
        s.setData2("Shayan");
        s.show();

        s1.setData1(22);
        s1.setData2("Sudhir");
        s1.show();
    }
}
