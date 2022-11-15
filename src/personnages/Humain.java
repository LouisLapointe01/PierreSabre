package personnages;

public class Humain {
private String nom;
private String boisson;
private int argent;

	public Humain(String nom,String boisson,int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	public int getArgent() {
		return argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(nom+": "+texte);
		
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du "+ boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boisson+"! Gloups !");
	}
	
	public void acheter(String bien, int prix){
		if (prix <= argent) {
		parler("j'ai "+ argent + " sous en poche, je vais pouvoir m'offrir un "+bien+" à "+prix+" sous.");
		argent = argent - prix;
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un "+ bien + " à "+ prix);
		}
		
	}
	
	public void gagnerArgent(int sommeaGagner) {
		argent = argent + sommeaGagner;
	}
	
	public void perdreArgent(int sommeAPerdre) {
		argent = argent - sommeAPerdre;
	}
}
