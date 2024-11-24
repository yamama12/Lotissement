package TP5;

public class Appartement extends PropriétéPrivée{
	private int numEtage;

	public Appartement(int id, Personne responsable, String adresse, double sourface, int nbPieces, int numEtage) {
		super(id, responsable, adresse, sourface, nbPieces);
		this.numEtage = numEtage;
	}

	@Override
	public String toString() {
		return "Appartement [numEtage=" + numEtage + ", id=" + id + ", responsable=" + responsable + ", adresse="
				+ adresse + ", sourface=" + sourface + "]";
	}
	
	
	
	

}
