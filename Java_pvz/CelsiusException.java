public class CelsiusException {
  public static void main(String[] Strings)
  {
      double fahrenheit;
	  double celsius;
	  
	  System.out.print("Input a degree in Fahrenheit: ");
	  
	  try {
	  fahrenheit = Double.valueOf(System.console().readLine());
	  celsius = (( 5 *(fahrenheit - 32.0)) / 9.0);
	  
	  System.out.println(fahrenheit + " degree Fahrenheit equal to " + celsius + " in Celcius");
      }
	  catch (Exception e) {
		   System.out.println("Ivesta netinkma reiksme"); 
	  }
 }
}