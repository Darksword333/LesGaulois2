package personnages;


public class Chef {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	
	public Chef(String nom, int force, int effetPotion, Village village) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
		this.village = village;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParoles() + " «  " + texte + " »");
	}

	private String prendreParoles() {
		return "Le chef " + getNom() + "du village " + village.getNom() + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la mâchoire de " +  romain.getNom());
		romain.recevoirCoup(force/3);
	}

}