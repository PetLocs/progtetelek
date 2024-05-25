
package main;

public class Progtelek {

    public static int[] tomb = new int[]{2, -4, 7, 11, 0};
    
    public static void main(String[] args) {
        progtetelek();
    }

    private static void progtetelek() {
        osszegzes();
        megszamolas(5); //nagyobb, mint megadott paraméter
        eldontes(2); //megadott paraméter szerepel-e a tömbben
        kivalasztas(7); //megadott paraméter hol szerepel a tömbben
        kereses(0); //megadott paraméter hol szerepel a tömbben indexxel
        maxKivalasztas();
        minKivalasztas();
        konzolraIr();
    }

    public static int osszegzes() {
        int sum = 0;
        for (int szam : tomb) {
            sum += szam;
        }
        return sum;
    }

    public static int megszamolas(int ertek) {
        int db = 0;
        for (int szam : tomb) {
            if (szam > ertek) {
                db++;
            }
        }
        return db;
    }

    public static boolean eldontes(int ertek) {
        int i = 0;
        while (i<tomb.length && tomb[i] != ertek) {
            i++;
        }
        return i<tomb.length;
    }

    public static int kivalasztas(int ertek) {
        int i = 0;
        while (tomb[i] != ertek) {
            i++;
        }
        return i+1;
    }

    public static int kereses(int ertek) {
        int i = 0;
        while (i<tomb.length && tomb[i] != ertek) {
            i++;
        }
        if (i<tomb.length) {
            return i;
        }else{ 
            return -1;
        }
    }

    public static int maxKivalasztas() {
        int max = tomb[0];
        for (int szam : tomb) {
            if (szam > max) {
                max = szam;
            }
        }        
        return max;
    }

    public static int minKivalasztas() {
        int min = tomb[0];
        for (int szam : tomb) {
            if (szam > min) {
                min = szam;
            }
        }        
        return min;
    }

    private static void konzolraIr() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
