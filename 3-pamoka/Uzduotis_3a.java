/// kalkuliatorius su blogo Inputo apdorojimo Try / Catch

public class Uzduotis_3a
{
   public static void main(String[] args)
   {
	   float a = 0;
	   float b = 0;
	   // Character op = 'y'; /// nelabai gaunasi su Character tipu, reikia priskyrima padaryti
	   
	   double rez;
	   boolean na;
	   
	   do {
		// na = false; cia is destytojo pavyzdzio, pas mane nenaudojamas
		try {
			  try {
		          System.out.println("\n Iveskite A: "); 
				  a = Integer.valueOf(System.console().readLine());
				  } 
			   catch (Exception e) {
				  System.out.println("Neteisinga A reiksme");
			      }
			  
		  
		  
		  System.out.println("\n Iveskite B: "); 
		  b = Integer.valueOf(System.console().readLine());
		  
		  System.out.println("\n Pasirinkite veiksma (*, / , +, -, %) klaviaturoje: ");
          //op = Character.valueOf(System.console().readLine());
		  String op = System.console().readLine();

          switch (op) {
          case "*": System.out.println("\n" + a + " * " + b + " = " + ( a * b ));
		  break;
          case "/": System.out.println("\n" + a + " / " + b + " = " + ( a / b ));
		  break;
          case "+": System.out.println("\n" + a + " + " + b + " = " + ( a + b ));
		  break;
          case "-": System.out.println("\n" + a + " - " + b + " = " + ( a - b ));
		  break;
		  case "%": System.out.println("\n" + a + " mod " + b + " = " + ( a % b ));
		  break;
          default: System.out.println("\n Pasirinkite viena is nurodytu veiksmu"); }
	    } catch (Exception e) {
	        System.out.println("Neteisinga reiksme");
	    }  
	      System.out.println("\n Ar testi ? Y / N ");
	    } while ((System.console().readLine()).equals("y"));
		 
		 //// bandysim pagauti klaviso Q paspaudima vietoje Y / N tikrinimo
	 
		 
  }  
}
 

