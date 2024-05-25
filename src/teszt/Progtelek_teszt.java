
package teszt;

import main.Progtelek;

public class Progtelek_teszt {
    
    public static void main(String[] args) {
        progtelekTesztelese();
    }

    private static void progtelekTesztelese() {        
        Progtelek.osszegzes();
        Progtelek.megszamolas(0);
        Progtelek.eldontes(0);
        Progtelek.kivalasztas(0);
        Progtelek.kereses(0);
        Progtelek.maxKivalasztas();
        Progtelek.minKivalasztas();
    }
}
