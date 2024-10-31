class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(age);
        System.out.println(name);
    }
}

public class SetterGetter {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();

        s.setAge(21);
        s.setName("Shayan");
        int student1Age = s.getAge();
        String student1Name = s.getName();
        System.out.println(student1Age);
        System.out.println(student1Name);

        s1.setAge(22);
        s1.setName("Sudhir");


        
    }
}
