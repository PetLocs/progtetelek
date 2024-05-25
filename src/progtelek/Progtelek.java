
package progtelek;

public class Progtelek {

    static int[] tomb = new int[]{2, -4, 7, 11, 0};
    
    public static void main(String[] args) {
        progtetelek();
    }

    private static void progtetelek() {
        osszegzes();
        megszamolas(5); //nagyobb, mint megadott paraméter
        eldontes();
        kivalasztas();
        kereses();
        maxKivalasztas();
        minKivalasztas();
    }

    private static int osszegzes() {
        int sum = 0;
        for (int szam : tomb) {
            sum += szam;
        }
        return sum;
    }

    private static int megszamolas(int ertek) {
        int db = 0;
        for (int szam : tomb) {
            if (szam > ertek) {
                db++;
            }
        }
        return db;
    }

    private static void eldontes() {
        
    }

    private static void kivalasztas() {
        
    }

    private static void kereses() {
        
    }

    private static void maxKivalasztas() {
        
    }

    private static void minKivalasztas() {
        
    }
    
}
