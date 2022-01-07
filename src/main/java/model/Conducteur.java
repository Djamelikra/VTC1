package model;

public class Conducteur {
	private int id_conducteur;
	private String prenom;
	private String nom;
	
	public Conducteur(int id_conducteur, String prenom, String nom) {
		super();
		this.id_conducteur = id_conducteur;
		this.prenom = prenom;
		this.nom = nom;
	}

	public int getId_conducteur() {
		return id_conducteur;
	}

	public void setId_conducteur(int id_conducteur) {
		this.id_conducteur = id_conducteur;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Conducteur [id_conducteur=" + id_conducteur + ", prenom=" + prenom + ", nom=" + nom
				+ ", getId_conducteur()=" + getId_conducteur() + ", getPrenom()=" + getPrenom() + ", getNom()="
				+ getNom() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
