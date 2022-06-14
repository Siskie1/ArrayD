package testpkg;

public class ArrayEx3 {
    public static void main (String args[])
    {
        String name[][] = new String[3][3];

        name[0][0] = "Ayanda";
        name[1][0] = "Aphiwe";
        name[2][0] = "Ntando";
        name[0][1] = "Zipho";
        name[1][1] = "Inshallah";
        name[2][1] = "Sfezile";
        name[0][2] = "Sbongile";
        name[1][2] = "Lethu";
        name[2][2] = "Simu";

        for (int r=0;r< name.length;r++) {

            for (int c = 0; c < name[r].length; c++)
            {
                System.out.println(name[r][c]);
            }
        }

    }

}
