import java.util.*;

class Farmer 
{
    int pa;
    float td;
    static float ri; //Because it is common for all farmers
    float si;


    static{
        ri = 4.5f;
    }

    void input () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        pa = sc.nextInt();
        System.out.println("Enter Time Required: ");
        td = sc.nextFloat();


    }

    void calculate() {
        si = (pa*td*ri)/100f;
    }

    void  disp() {
        System.out.println("The SI is " + si);
    }
}

public class LoanApplication {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();

        f1.input();
        f1.calculate();
        f1.disp();


        f2.input();
        f2.calculate();
        f2.disp();
    }
}
