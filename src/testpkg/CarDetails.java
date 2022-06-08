package testpkg;

public class CarDetails {
    public static void main (String[] args)
    {
        CarPack toyota = new CarPack();

        toyota.cModel = "Corolla";
        toyota.gearSize = 6;
        toyota.fType = "diesel";
        toyota.maxSpeed = 340;
        toyota.engSize = 6;

        toyota.DisplayAttr();


    }
}
