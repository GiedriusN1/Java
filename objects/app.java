import application.finder.*;

class app {    
/// nerasom nei public nei private, sita klase niekur daugiau nenaudosime

   public static void main(String[] args) {    

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {100, 200, 300, 400, 500, 99}
            };
        ArrayFinder mx = new ArrayFinder(); // susikurem rodykle i klase (jos kopija) nes naudojam ArrayFinder dynamic
        int rowIndex = ArrayFinder.find(matrix, 99); // kreipiames i kita klase ir joje esanti metoda
        System.out.println(rowIndex);
		
 
    }    
}