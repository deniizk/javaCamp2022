public class Main {
    public static void main(String[] args) {

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";

        for (int k = 0; k < ogrenciler.length; k++) {
            System.out.println(ogrenciler[k]);
        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}