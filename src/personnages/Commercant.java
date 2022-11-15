package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	public void seFaireExtorquer() {
		perdreArgent(getArgent());
		parler("J'ai tout perdu le monde est trop injuste !");
	}
	public void recevoireArgent(int montant) {
		parler(montant + " sous, je te remercie généreux donateur!");
		gagnerArgent(montant);
	}
}
