package personnages;

public class Yakuza extends Humain{
	int reputation = 0;
	
	public Yakuza (String nom, int argent,String boisson, String clan,int reputation) {
		super(nom,boisson,argent);
	}
	
	public void extorquer(Commercant commercant) {
		int argentVole = 0;
		gagnerArgent(commercant.getArgent());
		parler(commercant.getNom() + " si tu tiens à la vie donne moi ta bourse ! ");
		argentVole = commercant.getArgent();
		commercant.seFaireExtorquer();
		parler("J'ai piqué "+argentVole+" sous de " + commercant.getNom()+ " ce qui me fait "+ getArgent()+ " sous dans ma poche, Hi ! Hi ! ");
		
	}
	
}
