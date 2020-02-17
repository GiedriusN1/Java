public class DoWhileAndInput {
{
   public static void main(String[] args)
   {
	   int a;
	   int b;
	   int sum;
	   
	   do {
		  System.out.println("Enter A: "); 
		  a = Integer.valueOf(System.console().readLine());
		  System.out.println("Enter B: "); 
		  b = Integer.valueOf(System.console().readLine());
		  sum = a + b;
	
		System.out.println("Suma: " + sum);
	    System.out.println("Ar testi ? Y / N ");
	   } while (a != "y");
	}  
  }
 }