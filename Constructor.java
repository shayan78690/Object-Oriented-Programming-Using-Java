class Student {
    private int age;
    private String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s = new Student(21, "Shayan");
        String name = s.getName();
        int age = s.getAge();
        System.out.println(name + " is " + age + " years old");
    }
}
