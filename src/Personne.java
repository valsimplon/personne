import java.lang.System;

public class Personne {
	
	private String nomfamille;
	public String prenom;
	private Integer age;
	public Boolean feminin;
	public Adresse adrpers;
	
	@Override
	public String toString() {
		return "Personne [nomfamille=" + nomfamille + ", prenom=" + prenom
				+ ", age=" + age + ", feminin="
				+ feminin + ", adrpers=" + adrpers + "]";
	}

/*	public Personne() {
		System.out.println("je construis une personne vide");
	}
*/
	
	public Personne(String nomfamille_p, String prenom_p, Integer age_p, Boolean feminin_p, Adresse adrpers_p) {

		this.nomfamille = nomfamille_p;
		this.prenom = prenom_p;
		this.age = age_p;
		this.feminin = feminin_p;
		this.adrpers = adrpers_p;
	}
	
	public void declineTonIdentite() {
		System.out.println("je m'appelle " + this.nomfamille + " " + this.prenom);
	}
	
	public void setNomFamille(String nomFamille_p) {
		this.nomfamille = nomFamille_p;
	}
	
	public void setAge(Integer age_p) {
		this.age = age_p;	
	}
	
	public void feteTonAnniversaire() {
		this.age++;
		System.out.println("Joyeux anniversaire pour tes " + this.age.toString()); 
	}
	
	public void demenage(String nouveladr_p) {
		
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Adresse getAdrpers() {
		return adrpers;
	}

	public void setAdrpers(Adresse adrpers) {
		this.adrpers = adrpers;
		System.out.println(adrpers);
	}

}
