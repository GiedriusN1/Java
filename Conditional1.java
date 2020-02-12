public class Conditional1
{
   public static void main(String[] args)
   {
	   int a;
	   String sk = "";
	   
	   System.out.println("Enter number ");
	   a = Integer.valueOf(System.console().readLine());
	   
	   if (a > 0) 
	      {
		  sk = "positive"; 
	      } 
	      else if (a < 0)
	      {
		  sk = "negative";
	      } 
	      else 
	      {
		  sk = "zero";
		  } 

	    System.out.printf("Number ");
		System.out.print(a);
		System.out.printf(" is ");
		System.out.println(sk);
	  
   }
}   