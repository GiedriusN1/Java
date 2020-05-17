/*
2. Pasaulis
    duomenys/klases kintamieji:
        - zmoniu sarasas

    veiksmai/metodai:
        - sendiname zmones - padidina kiekvieno zmogaus amziu metais
        - zmones mirsta
            - kai amzius < 20, mirties tikimybe 0.1%
            - kai amzius < 30, mirties tikimybe 0.5%
            - kai amzius < 50, mirties tikimybe 10%
            - kai amzius < 60, mirties tikimybe 20%
            - >= 60, mirties tikimybe 30%
        - zmones gimsta
            - populiacija > 18 iki < 40, tikimybe 10%
        - kiek yra zmoniu
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pasaulis_old {
    public static void main(String[] args) {
        int a = 1; //                        pradinis amzius
        int b = 2; //                        pradinis zmoniu skaicius
        var ciklas = new Ciklas();
        ciklas.pridetiZmogu(a, b);
        ciklas.sendintiZmogu();
        
    }
}

class Ciklas {
    static List<Integer> zmones = new ArrayList<>();
    static List<Integer> sarasas = new ArrayList<>();  // sukuriam marinamu lista
    public static void pridetiZmogu( int a, int b) {
        for (int i = 0; i < b; i++) {
            zmones.add(a);
        }
    }

      void sendintiZmogu() {
        boolean mirtis = true;
        int size = 0;
        int gime = 0;

        for (int i = 1; i <= 300; i++) { ///   sukam metus 88888888888888888888888888888888888 
        	List<Integer> sarasas = new ArrayList<>();  // sukuriam marinamu lista
            for (int j = 0; j < zmones.size(); j++) { // einal per zmoniu lista
                int senaReiksme = zmones.get(j);
                int naujaReiksme = senaReiksme + 1;
                zmones.set(j, naujaReiksme);

                //  gimdom zmones
                if (senaReiksme > 18 && senaReiksme < 40) {
                    if (Math.random() < 0.1) {
                        zmones.add(0);
                        gime++;
                    }
                }

                if (senaReiksme > 60) {
                    if (Math.random() < 0.3) {
                        sarasas.add(zmones.get(j));
                    }

                } else if (senaReiksme > 50) {
                    if (Math.random() < 0.2) {
                        sarasas.add(zmones.get(j));
                    }

                } else if (senaReiksme > 30) {
                    if (Math.random() < 0.1) { 
                        sarasas.add(zmones.get(j));
                    }

                } else if (senaReiksme > 20) {
                    if (Math.random() < 0.05) { 
                        sarasas.add(zmones.get(j));
                    }

                } else {
                    if (Math.random() < 0.001) { 
                        sarasas.add(zmones.get(j));
                    }
                }
            }

           // zmones.removeAll(sarasas); /// bet naikina ne pirma, o visus vienodus &&&&&&&&&&&&&&&&&&&&&&&&&&&

            int sar = sarasas.size();
            for (int k = 0; k < sar; k++) {
                int zm = zmones.size();
                for (int n = 0; n < zm; n++) {
                    if (sarasas.get(k) == zmones.get(n)) {
                        zmones.remove(n);
                        break;
                    }
                }
            }
           

            System.out.println(i + " Gime " + gime + " Zmoniu skaicius: " + zmones.size() + " " + zmones);
            System.out.println("   Mire: " + sarasas.size() + " " + sarasas);
            gime = 0;

        }
    }

}


