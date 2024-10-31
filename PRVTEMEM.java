class Student 
{
    private int age;
    private String name;

    public void set1(int age) {
        age = age;
    }
    public void set2() {
        name = "Shayan";
    }

    public void show() {
        System.out.println(age);
        System.out.println(name);
    }
}

public class PRVTEMEM {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();

        s.set1(21);
        s.show();

        s1.set1(22);
        s1.show();
        

    }
}










// private int age;
// private String name;
// public void setData1(int a) {
//     age = a;
// }
// public void setData2() {
//     name = "Shayan";
// }

// public void show() {
//     System.out.println(age);
//     System.out.println(name);
// }




// Student s = new Student();
// Student s1 = new Student();

// s.setData1(21);
// s.show();

// s1.setData1(22);
// s1.show();