class septintasn {
  public static void main(String[] args) {
	System.out.print("Enter number: ");
	int i = 0;
	int nr = Integer.valueOf(System.console().readLine());
	for (i=0; i<10; i++) {
	System.out.println(nr * i);
	}
  }
}