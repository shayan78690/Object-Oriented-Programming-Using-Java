class Aeroplane
{
    public void takeoff()
    {
        System.out.println("Aeroplane is Taking Off");
    }

    public void fly()
    {
        System.out.println("Aeroplane is Flying"); 
    }
}

class CargoPlane extends Aeroplane
{
    public void fly()
    {
        System.out.println("CargoPlane is Flying");
    }

    public void carryGoods()
    {
        System.out.println("CargoPlane carries Goods"); //Specialized Method
    }
}

class PassengerPlane extends Aeroplane
{
    public void fly()
    {
        System.out.println("PassengerPlane is Flying");
    }

    public void carryPsg()
    {
        System.out.println("PassengerPlane carries Passengers"); //Specialized Method
    }
}

public class InheritanceMthd {
    public static void main(String[] args) {
        System.out.println("Hello");
        CargoPlane c = new CargoPlane();
        c.takeoff();
        c.fly();
        c.carryGoods();

        PassengerPlane p = new PassengerPlane();
        p.takeoff();
        p.fly();
        p.carryPsg();
    }
}

/*Takeoff method is inherited method and fly method is overriding method*/