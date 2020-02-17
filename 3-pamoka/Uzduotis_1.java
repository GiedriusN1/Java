public class Uzduotis_1
{
   public static void main(String[] args)
   {
      int[] sequention = {1, 2, 3, 4, 999, 6, 7, 8, 9, 10};
      int i = 0;
      int j = 0;
      int didejantis = 0;
      int mazejantis = 0;
		   
	   for (i = 0; i < sequention.length -1; i++) { 
		  //atimam 1 kad paskutinio netikrintu nes nebus su kuo lyginti
		  /* System.out.println((sequention[i])+1); // kontrolei */
		  /* System.out.println(sequention[i +1]);	 // kontrolei */   
		  if (((sequention[i])+1) == sequention[i +1]){ // ziurim ar kitas elementas didesnis vienetu uz einamaji
			 didejantis = didejantis +1; //////// ?????? ????? kazkodel neveikia didejantis++
		  /*  System.out.println("didejantis reiksme " + didejantis); // kontrolei */
		  } else {
			  mazejantis = mazejantis +1;
		   /* System.out.println("mazejantis reiksme " + mazejantis); // kontrolei */
		  }
		    if (didejantis == 1 && mazejantis == 1) {
              break;
            }
	   }
	   System.out.println(); // man graziau kai yra tarpas pries outputa
	   if (mazejantis == 0) {  // jei nebuvo atvejo kad kitas elementas butu kitoks negu vienetu didesnis
		      System.out.println("Masyvas yra didejanti seka.");
	   } else if (didejantis == 0) { // jei nebuvo atvejo kad kitas elementas butu kitoks negu vienetu mazesnis
		      System.out.println("Masyvas yra mazejanti seka.");
	   } else {  // jei buvo ir didesniu ir mazesniu atveju, tai bus misrus masyvas
	          System.out.println("Masyvas yra misrus.");
	   }
	   
	   // spausdinam masyvo elementus atvirkstine tvarka
	   System.out.println(); // man graziau kai yra tarpas pries outputa
	   System.out.println("Išvedame (output) masyvo elementus atvirkštine tvarka");
		for (i = 0; i < sequention.length; i++) {
		j = (sequention.length -i -1); 
		  if (i < sequention.length -1) {
		System.out.print(sequention[j] + ", ");
		}
	 }	  
	 System.out.println(sequention[j]); // paskutini spausdinam be kablelio	 
	 
	 // ieskom index elemento, kurio reiksme yra 5 
	 // yra bent 14 būdų tai padaryti:
	 // https://www.techiedelight.com/find-index-element-array-java/
	 
		boolean nera = false;
	 	for (i = 0; i < sequention.length; i++) {
		if (sequention[i] == 5){
			System.out.println();
			System.out.println("Masyvo elemento, kurio reikšmė 5, indeksas yra " + i);
			//return -1;
	       } else { //// jei nera "5", kintamajam "nera" priskiriam 1 
			nera = true;
		   }
		
		}
		if (nera == true) {
			System.out.println();
			System.out.println("Masyve nėra elemento, kurio reikšmė lygi 5.");	
		}
		
		// isvedam kas antra masyvo reiksme 
		System.out.println();
		System.out.println("Išvedame (output) kas antrą masyvo elemento reikšmę");
		for (i = 0; i < sequention.length - 2; i += 2) {
			System.out.print(sequention[i] + ", ");
		}
		 System.out.println(sequention[i]); /// paskutini elementa spausdinam be kablelio
		
  }
}
