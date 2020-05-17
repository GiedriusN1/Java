import java.io.IOException;

public class Life {


    public static void main(String[] args) throws InterruptedException {

        int plotis = 20; // lauko plotis
        int aukstis = 40; // lauko aukstis

        /* // sukuriam lauka paprastuoju budu.
        int[][] laukas =
                       {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0}
                }; */
        // sukuriam masyva is randominiu 0 ir 1
        int[][] laukas = new int[plotis][aukstis];
        for (int i = 0; i < plotis; i++) {
            for (int j = 0; j < aukstis; j++) {
                laukas[i][j] = (int) Math.round(Math.random());
            }
        }


        // trinam ekrano turini
        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.println();
        // Bandom atvaizduoti
        //  System.out.println("Pradine padetis");
        for (int i = 0; i < plotis; i++) {
            for (int j = 0; j < aukstis; j++) {
                if (laukas[i][j] == 0)
                    System.out.print(" . ");
                else
                    System.out.print(" @ ");
            }
            System.out.println();
        }
      //  System.out.println("Paspauskite Enter");

        kuriamNaujaLauka(laukas, plotis, aukstis);

    } ///////////////////////cia baigiasi main



           // Metodas turetu sukurti ir atvaizduoti nauja busena
          //  static void kuriamNaujaLauka ( int laukas[][], int plotis, int aukstis){
          public static void kuriamNaujaLauka ( int laukas[][], int plotis, int aukstis) throws InterruptedException {
              int ciklu = 100;
              for (int ciklas = 0; ciklas < ciklu; ciklas++) {

               /* // laukiam Enter
                try {
                    System.in.read();
                } catch (IOException e) {
                  //  e.printStackTrace();
                } */
               Thread.sleep(300); // 0.3 sekundes pauze

                // trinam ekrano turini
                System.out.print("\033[H\033[2J");
                System.out.flush();

                int[][] naujasLaukas = new int[plotis][aukstis];

                // einam per celes
                for (int p = 1; p < plotis - 1; p++) {
                    for (int a = 1; a < aukstis - 1; a++) {
                        // ziurim kiek kaimynu yra gyvi
                        int gyviKaimynai = 0;
                        for (int i = -1; i <= 1; i++)
                            for (int j = -1; j <= 1; j++)
                                gyviKaimynai += laukas[p + i][a + j];

                        // is skaiciaus atimam pacia cele
                        gyviKaimynai -= laukas[p][a];

                        // gimdom ir naikinam

                        // jei gyva cele turi <2 kaimynu ji mirsta
                        if ((laukas[p][a] == 1) && (gyviKaimynai < 2))
                            naujasLaukas[p][a] = 0;

                            // jei kaimynu virs 3, gyva cele mirsta
                        else if ((laukas[p][a] == 1) && (gyviKaimynai > 3))
                            naujasLaukas[p][a] = 0;

                            // 0 virsta 1, jei prie tuscios vietos yra 3 kaimynai
                        else if ((laukas[p][a] == 0) && (gyviKaimynai == 3))
                            naujasLaukas[p][a] = 1;

                            // kitais atvejais nesikeicia niekas
                        else
                            naujasLaukas[p][a] = laukas[p][a];
                    }
                }


                for (int i = 0; i < plotis; i++) {
                    for (int j = 0; j < aukstis; j++) {
                        if (naujasLaukas[i][j] == 0)
                            System.out.print(" . ");
                        else
                            System.out.print(" @ ");
                    }
                    System.out.println();
                   // nukopijuojam nauja lauka i masyva laukas kad jis butu pradinis kitam zingsniui,
                    System.arraycopy(naujasLaukas, 0, laukas, 0, plotis);



                }
            }
        }
    }

