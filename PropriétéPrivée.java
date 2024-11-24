package TP5;

public class PropriétéPrivée extends Propriété {
	private int nbPieces;

	public PropriétéPrivée(int id, Personne responsable, String adresse, double sourface, int nbPieces) {
		super(id, responsable, adresse, sourface);
		this.nbPieces = nbPieces;
	}

	@Override
	public String toString() {
		return "PropriétéPrivée [nbPieces=" + nbPieces + ", id=" + id + ", responsable=" + responsable + ", adresse="
				+ adresse + ", sourface=" + sourface + "]";
	}

	@Override
	public double calculImpot() {
		// TODO Auto-generated method stub
		return (50/(this.sourface/100)+10/this.nbPieces);
	}

	public int getNbPieces() {
		return nbPieces;
	}
	

}
