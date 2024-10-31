class Aeroplane
{
    public void takeoff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is Flying");
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
    public void carryGoods()
    {
        System.out.println("CargoPlane carries goods");
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
    public void carryPassenger()
    {
        System.out.println("PassengerPlane carries passengers");
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

class Airport
{
    public void poly(Aeroplane ref)
    {
        ref.takeoff();
        ref.fly();
        System.out.println("------------------------------------------------");
    }
}

public class MoreOnPoly {
    public static void main(String[] args) {
        CargoPlane c = new CargoPlane();
        PassengerPlane p = new PassengerPlane();
        FighterPlane f = new FighterPlane();


        Airport a = new Airport();
        a.poly(c);
        a.poly(p);
        a.poly(f);
        // c.takeoff();
        // c.fly();

        // p.takeoff();
        // p.fly();

        // f.takeoff();
        // f.fly();
    }
}

