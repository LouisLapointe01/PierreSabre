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
		System.out.println("\n\nTEST Yakuza : \n");
		Yakuza yakuza = new Yakuza("Harukichi",120,"Whisky","Yamaguchi",50);
		yakuza.direBonjour();
		yakuza.parler("Tiens, tiens ne sarait-il pas un fiable marchant qui passe par là ?");
		yakuza.extorquer(commercant);
		
		
	}

}
