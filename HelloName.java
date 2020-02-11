// komentaras trumpas

/* ilgas multiline komentaras
Documents
*/

/* pirmuose skliausteliuose yra programa 
antruose skliausteliuose yra "Programos blokas = metodas"  */

class HelloName
{
	public static void main(String[] args)
	{
		System.out.print("Enter your name: ");
		String name = System.console().readLine();
		System.out.print("Enter your lastname: ");
		String lastname = System.console().readLine();
		System.out.println("Hello " + name + " " + lastname);
	}
}