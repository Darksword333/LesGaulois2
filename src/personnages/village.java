package personnages;

public class Village{
    private String nom;
    private Chef chef;
    private int nbVillageois = 0;
    private Gaulois[] villageois;
    
    public Village(String nom, int nbVillageoisMaximum){
        this.nom = nom;
        villageois = new Gaulois[nbVillageoisMaximum];
        for (int i=0; i<nbVillageoisMaximum; i++) {
        	villageois[i] = null;
        }
    }
    public void ajouterVillageois(Gaulois gaulois){
        villageois[nbVillageois] = gaulois;
        nbVillageois++;
    }
    public Gaulois trouverHabitant(int numVillageois){
        return villageois[numVillageois];
    }

    public void setChef(Chef chef){
        this.chef = chef;
    }

    public String getNom(){
        return this.nom;
    }
    
    public static void main(String[] args) {
        Village irreductible = new Village("Village des irréductibles", 30);
        //Gaulois gaulois = Village.trouverHabitant(30);
        //On obtient l'exception précédente car le tableau villageois est vide
        Chef abraracourcix = new Chef("Abraracourcix", 6, 2, irreductible);
        irreductible.setChef(abraracourcix);
        Gaulois asterix = new Gaulois("Astérix", 8);
        irreductible.ajouterVillageois(asterix);
        Gaulois gaulois = irreductible.trouverHabitant(1);
        System.out.println(gaulois);
    }
}