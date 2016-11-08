import java.util.Scanner;
import java.lang.System;



public class Main {
	
	public static Scanner saisie = new Scanner(System.in);
	
	public static void main(String[] args) {
				
	/*	System.out.println("Saisir votre nom de famille : ");
		String nom = saisie.nextLine();

		System.out.println("Saisir votre prénom : ");
		String prenom = saisie.nextLine();
		
		System.out.println("Saisir votre âge : ");
		Integer age = saisie.nextInt();

		System.out.println("Quel est votre sexe ? (f/f/M/m)");
		Boolean feminin=(saisie.nextLine()=="F"||saisie.nextLine() =="f") ? true : false;
	*/	
		Adresse adr = new Adresse(30, "Jullien","70000","Maville");
		
	//	Personne pers = new Personne(nom, prenom, age, feminin, adr);
//		pers.setAdrpers(adr);
	//	System.out.println(pers);
		
	//	adr.affichAdr();

	//	pers.declineTonIdentite();
		
		Adresse adrrefugie = new Adresse();
		
		DemandAsile refugie = new DemandAsile("JBON", "JEAN", 30, false, adrrefugie);
		System.out.println(refugie);
		adrrefugie = adr;
		refugie.demanderAsile(adrrefugie);
		System.out.println(refugie);
		adrrefugie.setNumRue(13);
		adrrefugie.setRue("Grandrue");
		refugie.demenage(adrrefugie);
		System.out.println(refugie);
		
		
	/*	System.out.println("Saisir votre nom de famille : ");
		String nomfamille = saisie.nextLine();
		pers.setNomFamille(nomfamille);

		System.out.println("Saisir votre âge : ");
		age = saisie.nextInt();
		pers.setAge(age);
		pers.feteTonAnniversaire();
		
		pers.demenage("maville");*/
	}

}
