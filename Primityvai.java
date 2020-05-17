// pamoka 6 naujas destytojas
// sachmatu lenta su grudeliais

public class Primityvai {   // pavadinimas turi sutapti su failo pavadinimu ir rasomas is Didiosios
public static void main(String[] args) {

int x = 100; // primityvas. turi tureti butinai reiksme, "nieko" == 0 arba False jei tai butu bolean
Integer y = 200; // objektas is didziosios rasomas. Gali tureti reiksme Null, tai pagrindinis skirtumas.
// kitas svarbus skirtumas kas Integer ir kiti standartiniai objektai yra nemutuojami, pakeitus reikia daryti nauja priskyrima
// nes keiciant  sukuriama kopija nauju adresu  

m(x);
System.out.println(x); // spausdinam 100, nes iksas metode "m" nesusijes su situo iksu. Nes kviesdami 
}



static int m(int x) { 
    // lygtai x = 100, grazina ta 200, bet nera jokio priskyrimo 9 eiluteje, veiktu jei butu x = m(x)
	// vyksta kopijavimas, gali buti naudojamas ne x o kitas kintamojo pavadinimas
x = 200;
return x;
}


class KlaseA {
	int kintamasis1;

}

}




