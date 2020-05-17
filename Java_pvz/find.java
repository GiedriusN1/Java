public class find {
 
public int find(int[][] matrix, int ieskomas) { ////// cia aprasome metoda (funkcija)
    for (int eil = 0; eil < matrix.length; eil++) { // einam per eilutes
        for (int stulp = 0; stulp < matrix[eil].length; stulp++) { //einam per eilutes elementus
            if (matrix[eil][stulp] == ieskomas) {
				return eil;
				return stulp;
            }
        }
    }
}
	   
	public int find(int[] matrix, int ieskomas) { ////// cia aprasome metoda (funkcija)
	 //	public int find(int ieskomas) {   

	  for (int i = 0; i < matrix.length; i++) { // einam per eilutes
			if (matrix[i] == ieskomas) {
				return i;

			}
		 }

	  }
		  
    public static void main(String[] args) {    //// va cia prasideda pati klase, nes cia main

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {100, 200, 300, 400, 500}
            };
          
        int valueToFind = 300;
        
        WhereValInMatrix mx = new WhereValInMatrix(); // objekta pasidarome is klases apraso
		// kintamojo tipas yta ne int, char ar pan, o pati klase
        
        int index = mx.find(matrix, valueToFind); // rasom mx, nes cia  dynamic 
        index = mx.find(matrix[index], 500);      
        System.out.println(index);    
	// klase var = new klase(); ---- kai naudojam dynamic taip pasiemam nuoroda (rodykle)
	// i atminties vieta, kur saugoma klase ir dirbam su jos kopija
	// o statiniai naudojami kai klase einterpretuojame kaip metodu rinkini, be paveldimumu, be interfeisu
	// static dirba greiciau, nes dirba tiesiogiai su atmintim
	//
	// savo sukaurta biblioteka vadinama PACKAGE
	

    }
}
    