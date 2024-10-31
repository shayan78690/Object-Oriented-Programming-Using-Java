abstract class Aeroplane
{
    abstract public void takeoff();
    abstract public void fly();

    public void landing()
    {
        System.out.println("Aeroplane is Landing");
    }
}

class CargoPlane extends Aeroplane
{
    public void takeoff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies fast");
    }

    public void alert()
    {
        System.out.println("Alert");
    }

}

class PassengerPlane extends Aeroplane
{
    public void takeoff()
    {
        System.out.println("PassengerPlane requires Medium runway");
    }
    public void fly() 
    {
        System.out.println("PassengerPlane flies medium");
    }
    
}

class FighterPlane extends Aeroplane
{
    public void takeoff()
    {
        System.out.println("FighterPlane requires More runway");
    }
    public void fly() 
    {
        System.out.println("FighterPlane flies fast");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Aeroplane ref1 = new CargoPlane();
        ref1.takeoff();
        ref1.fly();
        ref1.landing();
        ((CargoPlane) ref1).alert(); //Error

        Aeroplane ref2 = new PassengerPlane();
        ref2.takeoff();
        ref2.fly();
        ref2.landing();

        Aeroplane ref3 = new FighterPlane();
        ref3.takeoff();
        ref3.fly();
        ref3.landing();

    }
}


