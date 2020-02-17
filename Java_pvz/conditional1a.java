public class conditional1 {
  public static void main(String[] args) {
  
  int nr;
  str skaicius;
	System.out.print("Enter number: ");
	int nr = Integer.parseInt(System.console().readLine());
  
  if (nr > 0) {
  skaicius = "positive";
  }  else if (nr == 0) {
  skaicius = "zero";
  } else {
  skaicius = "negative";
  }
  
  
  	System.out.println("Number is " + skaicius );
	
 }
}
