public class Uzduotis_1
{
   public static void main(String[] args)
   {
	   int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
	   int i = 0;
	   int j = 0;
       int didejantis = 0;
       int mazejantis = 0;
		   
	   for (i = 0; i < numbers.length -1; i++) { //atimam 1 kad paskutinio netikrintu nes nebus su kuo
		  /* System.out.println((numbers[i])+1); // kontrolei */
		  /* System.out.println(numbers[i +1]);	 // kontrolei */   
		  if (((numbers[i])+1) == numbers[i +1]){ // ziurim ar kitas elementas didesnis vienetu uz einamaji
			 didejantis = didejantis +1; /// ?????? ????? kazkodel neveikia didejantis++
		  /*  System.out.println("didejantis reiksme " + didejantis); // kontrolei */
		  } else {
			  mazejantis = mazejantis +1;
		   /* System.out.println("mazejantis reiksme " + mazejantis); // kontrolei */
		  }
	   }
	   
	   if (mazejantis == 0) {  // jei nebuvo atvejo kad kitas elementas butu kitoks negu vienetu didesnis
		      System.out.println("Masyvas yra didejanti seka");
	   } else if (didejantis == 0) { // jei nebuvo atvejo kad kitas elementas butu kitoks negu vienetu mazesnis
		      System.out.println("Masyvas yra mazejanti seka");
	   } else {  // jei buvo ir didesniu ir mazesniu atveju, tai bus misrus masyvas
	          System.out.println("Masyvas yra misrus");
	   }
	   
	   // spausdinam masyvo elementus atvirkstine tvarka
	   
		for (i = 0; i < numbers.length; i++) {
		j = (numbers.length -i -1); 
		  if (i < numbers.length -1) {
		System.out.print(numbers[j] + ", ");
		}
	 }	  
	 System.out.print(numbers[j]); // paskutini spausdinam be kablelio	 
  }
}
