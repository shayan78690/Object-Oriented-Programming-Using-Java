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

public class RnTimeVsCmplTime {
    public static void main(String[] args) {
        CargoPlane c = new CargoPlane();

        Aeroplane ref;
        ref = c;
        ref.takeoff();
        ref.fly();

        PassengerPlane p = new PassengerPlane();

        ref = p;
        ref.takeoff();
        ref.fly();
    }
}
