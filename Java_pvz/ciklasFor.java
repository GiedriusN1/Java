public class ciklasFor
{
   public static void main(String[] args)
   {
	   int[] numbers = {1, 2, 3, 4, 5, 99};
	   int[][] rows = {
		   {1, 2, 3, 4},
		   {5, 6, 7, 8}
	   };
	   
	 //  int i = 0;
	 //  while (i < numbers.length) {
	 // cia uzkomentuotas variantas ciklo su operatoriumi WHILE
		   
	   for (int i = 0; i < numbers.length; i++) {
		   
		System.out.println("element #" + i + " is: " + numbers[i]);
		
		//i++ //si eilute reikalinga WHILE ciklui
	   }
	   
	   	for (int i = 0; i < rows.length; i++) {
			for (int ii = 0; ii < rows[i].length; ii++) {
		System.out.println("Row: " + i + ", Col: " + ii + ", value: " + rows[i][ii]);
	   }
	}  
  }
 }