import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Locale;

public class DemandAsile extends Personne {
	
	//private String dateLimiteAutorisation;
	SimpleDateFormat datformat = null;
	private Date dateLimiteAutorisation;
	private Boolean regularise;

	public DemandAsile(String nomfamille, String prenom, Integer age, Boolean feminin, Adresse adrpers) {
		super(nomfamille, prenom, age, feminin, adrpers);
		this.regularise = false;
		dateLimiteAutorisation = new Date();
		datformat = new SimpleDateFormat("dd-MM-yy");
		
		//this.dateLimiteAutorisation = "aujourd'hui";
	}

	@Override
	public String toString() {
		return "DemandAsile [dateLimiteAutorisation=" + datformat.format(dateLimiteAutorisation)
				+ ", regularise=" + regularise + ", prenom=" + prenom
				+  ", feminin=" + feminin
				+ ", adrpers=" + adrpers + "]";
	}

	public String getDateLimiteAutorisation() {
		return datformat.format(dateLimiteAutorisation);
	}

	public void setDateLimiteAutorisation(String dateLimiteAutorisation) {
		this.dateLimiteAutorisation = new Date();
	}

	public void demanderAsile(Adresse adrasile) {
		this.regularise = true;
		System.out.println("Je demande l'asile pour l'adresse " + adrasile);
	}

	public Boolean getRegularise() {
		return regularise;
	}

	public void setRegularise(Boolean regularise) {
		this.regularise = regularise;
	}
	
	public void affichDemandAsile() {
		System.out.println("Refugie : ");
		this.declineTonIdentite();
		System.out.println(this.regularise + " " + this.dateLimiteAutorisation);
	}
	
	public void demenage(Adresse nouvadr) {
		if (this.regularise == true) {
			this.adrpers=nouvadr;
		}
	}

}
