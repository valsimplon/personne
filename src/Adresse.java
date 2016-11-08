import java.lang.System;

public class Adresse {
	
	private Integer numRue;
	private String rue;
	private String codepostal;
	private	String commune;
	
	public Adresse() {
	
	}
	
	public Adresse(Integer numRue, String rue, String codepostal, String commune) {
		super();
		this.numRue = numRue;
		this.rue = rue;
		this.codepostal = codepostal;
		this.commune = commune;
	}
	
	public Integer getNumRue() {
		return numRue;
	}
	
	public String getRue() {
		return rue;
	}
	
	public String getCodepostal() {
		return codepostal;
	}
	
	public String getCommune() {
		return commune;
	}
	
	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}
	
	public void setRue(String rue) {
		this.rue = rue;
	}
	
	@Override
	public String toString() {
		return "Adresse [numRue=" + numRue + ", rue=" + rue + ", codepostal="
				+ codepostal + ", commune=" + commune + "]";
	}

	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	
	public void setCommune(String commune) {
		this.commune = commune;
	}
	
	public void affichAdr() {
		System.out.println(this.numRue.toString() + " rue  " + this.rue + " " + this.codepostal + " " + this.commune);
	}

}
