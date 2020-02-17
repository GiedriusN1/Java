public class TryCatch {
  public static void main(String[] Strings)
  {
      double fahrenheit;
	  double celsius;
	  
	  System.out.print("Input a degree in Fahrenheit: ");
	  
	  fahrenheit = Double.valueOf(System.console().readLine());
	  
	  
	  celsius = (( 5 *(fahrenheit - 32.0)) / 9.0);
	  
	  System.out.println(fahrenheit + " degree Fahrenheit equal to " + celsius + " in Celcius");
  }
}