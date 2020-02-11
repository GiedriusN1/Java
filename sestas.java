class sestas {
  public static void main(String[] args) {
	System.out.print("Enter first number: ");
	int nr1 = Integer.parseInt(System.console().readLine());
	System.out.print("Enter second number: ");
	int nr2 = Integer.parseInt(System.console().readLine());
	
	System.out.println(nr1 + " + " + nr2 + " = " + (nr1 + nr2));
	System.out.println(nr1 + " - " + nr2 + " = " + (nr1 - nr2));
	System.out.println(nr1 + " * " + nr2 + " = " + (nr1 * nr2));
	System.out.println(nr1 + " / " + nr2 + " = " + (nr1 / nr2));
	System.out.println(nr1 + " mod " + nr2 + " = " + (nr1 % nr2));
	
 }
}