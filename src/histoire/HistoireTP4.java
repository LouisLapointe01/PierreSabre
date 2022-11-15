package histoire;
import personnages.*;
public class HistoireTP4 {

	public static void main(String[] args) {
		System.out.println("\n\nTEST Humain : \n");
		Humain humain = new Humain("Prof","kombucha",54);
		humain.direBonjour();
		humain.acheter("boisson", 12);
		humain.boire();
		humain.acheter("kimono", 50);
		System.out.println("\n\nTEST Commercant : \n");
		Commercant commercant = new Commercant("Carefulu",100);
		commercant.direBonjour();
		commercant.seFaireExtorquer();
		commercant.recevoireArgent(15);
		commercant.boire();
		
	}

}
