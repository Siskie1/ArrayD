package testpkg;

public class ArrayExProv {
    public static void main(String[] args) {
        String province[] = new String[7];

        province[0] = "Gauteng";
        province[1] = "Limpopo";
        province[2] = "Mpumalanga";
        province[3] = "Western Cape";
        province[4] = "Eastern Cape";
        province[5] = "Free State";
        province[6] = "KwaZulu Natal";

        for (int r =0; r < province.length; r++) {
            System.out.println(province[r]);
        }

    }
}

