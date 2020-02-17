public class uzduotis_Args

{
	public static void main(String[] args) {
	//	System.out.print("Enter your name: ");
	//	String name = System.console().readLine();
	//	System.out.print("Enter your lastname: ");
	//	String lastname = System.console().readLine();
	
	String name = "";
	String lastname = "";
	final String usageMessage = "Usage:\" Java uzduotis_Args \" + name and surname (as arguments)";
	
	if (args.length > 1) {
        name = args[0];
		lastname = args[1];
		System.out.println("Hello " + name + " " + lastname);
	} else {
		System.out.println(usageMessage);
	    System.exit(0);
	}
    }
}