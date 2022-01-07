package model;

public class Association {
	private int id_association;
	//On est contraint de répéter ces champs pour les besoins de la vue : l'affichage
	private String conducteur;
	private String vehicule;
	private int id_conducteur;
	private int id_vehicule;
	
	
	
	public Association(int id_association, String conducteur, String vehicule) {
		super();
		this.id_association = id_association;
		this.conducteur = conducteur;
		this.vehicule = vehicule;
	}



	public int getId_association() {
		return id_association;
	}



	public void setId_association(int id_association) {
		this.id_association = id_association;
	}



	public String getConducteur() {
		return conducteur;
	}



	public void setConducteur(String conducteur) {
		this.conducteur = conducteur;
	}



	public String getVehicule() {
		return vehicule;
	}



	public void setVehicule(String vehicule) {
		this.vehicule = vehicule;
	}



	public int getId_conducteur() {
		return id_conducteur;
	}



	public void setId_conducteur(int id_conducteur) {
		this.id_conducteur = id_conducteur;
	}



	public int getId_vehicule() {
		return id_vehicule;
	}



	public void setId_vehicule(int id_vehicule) {
		this.id_vehicule = id_vehicule;
	}



	@Override
	public String toString() {
		return "Association [id_association=" + id_association + ", conducteur=" + conducteur + ", vehicule=" + vehicule
				+ ", id_conducteur=" + id_conducteur + ", id_vehicule=" + id_vehicule + "]";
	}
	
	
	
	
	
	

}
