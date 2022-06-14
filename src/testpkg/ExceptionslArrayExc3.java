package testpkg;

public class ExceptionslArrayExc3 {
    public static void main (String args [])
    {
        String course[] = new String[5];

        course[0]= "Course";
        course[1]= "Java training for testers";
        course[2]= "Certified Lead Pen Test";
        course[3]= "ISTQB CTFL";
        course[4]= "DevOps Foundation";

        try {

            for (int j=0; j<6; j++)
            {
                System.out.println(course[j]);
            }
        }

        catch (Exception f)
        {
            System.out.println("Exception" + " " + f);
        }
    }

}
