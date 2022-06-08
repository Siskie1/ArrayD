package testpkg;

public class CarPack {
    String cModel;
    String fType;
    int maxSpeed;
    double engSize;
    int gearSize;

    public void DisplayAttr()
    {
        System.out.println("Toyota" + " " + cModel + " " + "is the model of the car " );
        System.out.println("The car has" + " " +gearSize + " " + "gears");
        System.out.println("The car's maximum speed is " + maxSpeed);
        System.out.println("The car uses" + " " + fType + " " + "for fuel");

    }

}
