package personnages;

import personnages.Chef;
import personnages.Romain;

public class Village{
    private String nom;
    private Chef chef;
    private int nbVillageois = 0;
    private String[] villageois;
    
    public Village(String nom, int nbVillageoisMaximum){
        this.nom = nom;
        for (int i=0; i<nbVillageoisMaximum; i++) {
        	villageois[i] = "Villageois";
        }
    }

    public void setChef(Chef chef){
        this.chef = chef;
    }

    public String getNom(){
        return this.nom;
    }
}