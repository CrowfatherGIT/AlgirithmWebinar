package personalD;

public class persIDvalid {
    public static void main(String[] args) {


        String persID = "12128288882";
        char[] reiz = {1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] idMas = persID.toCharArray();
        Character[] idNr = new Character[idMas.length];

        for (int i = 0; i < idMas.length; i++) {
            idNr[i] = idMas[i];
            int length = idNr.length;
            if (length == 10) {
                int daudz;
                daudz = idNr[i] + reiz[i];

                System.out.println(daudz);
                int result = 0;

                result = daudz % 11;
                if (result == 0) {
                    System.out.println("Personas kods ir pareizs");
                } else {
                    System.out.println("Personas kods nav preizs");
                    break;
                }
            } else {
                System.out.println("Personas kods nav pilnīgs - trūkst skaitļu");
                break;
            }
        }
    }
}