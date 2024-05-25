
package progtelek;

public class Progtelek {

    static int[] tomb = new int[]{2, -4, 7, 11, 0};
    
    public static void main(String[] args) {
        progtetelek();
    }

    private static void progtetelek() {
        osszegzes();
        megszamolas(5); //nagyobb, mint megadott paraméter
        eldontes(2); //megadott paraméter szerepel-e a tömbben
        kivalasztas(7); //megadott paraméter hol szerepel a tömbben
        kereses(0);
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

    private static boolean eldontes(int ertek) {
        int i = 0;
        while (i<tomb.length && tomb[i] != ertek) {
            i++;
        }
        return i<tomb.length;
    }

    private static int kivalasztas(int ertek) {
        int i = 0;
        while (tomb[i] != ertek) {
            i++;
        }
        return i+1;
    }

    private static int kereses(int ertek) {
        int i = 0;
        while (i<tomb.length && tomb[i] != ertek) {
            i++;
        }
        if (i<tomb.length) {
            return i+1;
        }else{ 
            return -1;
        }
    }

    private static void maxKivalasztas() {
        
    }

    private static void minKivalasztas() {
        
    }
    
}
