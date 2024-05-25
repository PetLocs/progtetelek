
package main;

public class Progtelek {

    public static int[] tomb = new int[]{2, -4, 7, 11, 0};
    private static int a, b, c, d;
    
    public static void main(String[] args) {
        progtetelek();
    }

    private static void progtetelek() {
        a = 5;
        b = 2;
        c = 7;
        d = 0;
        osszegzes();
        megszamolas(a); //nagyobb, mint megadott paraméter
        eldontes(b); //megadott paraméter szerepel-e a tömbben
        kivalasztas(c); //megadott paraméter hol szerepel a tömbben
        kereses(d); //megadott paraméter hol szerepel a tömbben indexxel
        maxKivalasztas();
        minKivalasztas();
        konzolraIr();
    }
    
    private static void konzolraIr() {
        System.out.println("Programozási tételek:");
        String tombSzoveg = "";
        for (int elem : tomb) {
            tombSzoveg += "%d ".formatted(elem);
        }
        System.out.print("A tömb elemei: [ " + tombSzoveg + "]\n");
        System.out.printf("Tömb összege: %d\n", osszegzes());
        System.out.printf("Nagyobb mint %d: %d db\n", a, megszamolas(a));
        String valasz = eldontes(b) ? "Igen" : "Nem"; 
        System.out.printf("Szerepel-e a(z) %d? %s\n", b, valasz);
        System.out.printf("Hányadik elem a %d? %d-ik\n", c, kivalasztas(c));
        if (kereses(d) != -1) {
            System.out.printf("Mi az indexe a %d-nek? %d\n", d, kereses(d));
        }else{
            System.out.printf("Mi az indexe a %d-nek? %s\n", d, "Nincs ilyen elem a tömbben.");
        }
        System.out.printf("Maximuma: %d\n",maxKivalasztas());
        System.out.printf("Minimuma: %d\n",minKivalasztas());
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
            if (szam < min) {
                min = szam;
            }
        }        
        return min;
    }
    
}
