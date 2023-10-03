package personnages;


public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParoles() + " � " + texte + " �");
	}

	private String prendreParoles() {
		return "Le romain " + getNom() + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public static void main(String[] args) {
		Romain randominus = new Romain("randominus", 5);
		randominus.parler("Salut !");
		randominus.recevoirCoup(8);
		
	}
}