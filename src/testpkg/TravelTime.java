package testpkg;

public class TravelTime {
    public static void main (String [] args)
    {
       int duration = 355;
       int hours;
       int minutes;

       hours = duration/60;
       minutes = duration%60;

       System.out.println("It takes " + hours + "hours" + " " + minutes + " " + "minute");
    }
}
