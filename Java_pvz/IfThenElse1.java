public class IfThenElse1
{
   public static void main(String[] args)
   {
	   
	   int a;
	   int b;
	   char result = '>';
	   
	   System.out.println("Iveskite a");
	   a = Integer.valueOf(System.console().readLine());
	   System.out.println("Iveskite b");
	   b = Integer.valueOf(System.console().readLine());
	   
	   if (a > b) {
		   result = '>';
	   } else if  (a < b) {
           result = '<';
       } else if  (a ==	b)  {
           result = '=';
       }

//    System.out.println("10");
      System.out.println("a " + result + " b");
//    System.out.println(result);

   }
}   