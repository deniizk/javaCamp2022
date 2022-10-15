public class Main {
    public static void main(String[] args) {
        int x = 220;
        int y = 284;
        int toplamx = 0;
        int toplamy = 0;

        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                toplamx = toplamx + i;
            }
        }
        for (int j = 1; j < y; j++) {
            if (y % j == 0) {
                toplamy = toplamy + j;
            }
        }
        if (x == toplamy && y == toplamx) {
            System.out.println("Bu iki sayı arkadaştır");
        } else {
            System.out.println("Bu iki sayı arkadaş değildir");
        }
    }
}