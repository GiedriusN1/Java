public class Uzduotis_2a
{
 public int find(int[][] matrix, int ieskomas) {
    int eil = 0;   
    int stulp = 0;
	for (eil = 0; eil < matrix.length; eil++) { // einam per eilutes
	      for (stulp = 0; stulp < matrix[eil].length; stulp++) { //einam per eilutes elementus
			if (matrix[eil][stulp] == ieskomas) {
                System.out.println("\n ieskoma reiksme yra " + eil + " eiluteje");
				return eil;
			}
		}
    }
    return eil;

  }


public static void main(String[] args)
   {
    int[][] matrix = {
	{1, 2, 3, 4, 5},
	{10, 20, 30, 40, 50},
	{100, 200, 300, 400, 500}
    };
	
	int eil = 0;
	int stulp = 0;
	int eilSuma = 0;
	int eilSumuSuma = 0;
	int stulpSuma = 0;
	int stulpSumuSuma = 0;
	int ieskomas = 300;
    int[] indeksas = {0, 0};
    Uzduotis_2a mx =  new Uzduotis_2a(); // 
    
   int index = mx.find(matrix, ieskomas); // oblekta priskiriam kintamajam

	for (eil = 0; eil < matrix.length; eil++) { // einam per eilutes
	    eilSuma = 0; /// nunulinam eilutes elementu suma, kitaip sudes antra prie pirmos ir t.t.
        for (stulp = 0; stulp < matrix[eil].length; stulp++) { //einam per eilutes elementus
			eilSuma += matrix[eil][stulp]; // sumuojam eilutes elementus
		}
		System.out.println("Eilutės " + eil + " elementų suma: " + eilSuma);
		eilSumuSuma = eilSumuSuma + eilSuma;
	}
	System.out.println("Visų eilucių elementų suma yra lygi: " + eilSumuSuma);
	System.out.println();
	

    // Einam per stulpelius
    // laikom kad eiluciu ilgiai vienodi
    for (stulp = 0; stulp < matrix[0].length; stulp++) {
		stulpSuma = 0;
         for (eil = 0; eil < matrix.length; eil++) {
            stulpSuma += matrix[eil][stulp];
        }
        System.out.println("Stulpelio " + stulp + " elementų suma: " + stulpSuma);
		stulpSumuSuma = stulpSumuSuma + stulpSuma;
    }
    System.out.println("Visų stulpelių elementų suma yra lygi: " + stulpSumuSuma);
	
//	System.out.println(); // spausdinam elemento kurio reiksme 300, indeksa
//	System.out.println("Elemento kurio reiksme 300, indeksas yra: [" + indeksas[0] + "][" + indeksas[1] + "]");
	
  }
}
