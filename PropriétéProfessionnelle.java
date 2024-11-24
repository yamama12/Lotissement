package TP5;

public class PropriétéProfessionnelle extends Propriété {
	private int nbEmployes;
	private boolean estEtatique ;
	
	public PropriétéProfessionnelle(int id, Personne responsable, String adresse, double sourface, int nbEmployes,
			boolean estEtatique) {
		super(id, responsable, adresse, sourface);
		this.nbEmployes = nbEmployes;
		this.estEtatique = estEtatique;
	}

	@Override
	public String toString() {
		return "PropriétéProfessionnelle [nbEmployes=" + nbEmployes + ", estEtatique=" + estEtatique + ", id=" + id
				+ ", responsable=" + responsable + ", adresse=" + adresse + ", sourface=" + sourface + "]";
	}

	@Override
	public double calculImpot() {
		// TODO Auto-generated method stub
		if (this.estEtatique=false) {
			return (100/(this.sourface/100)+30/this.nbEmployes);
		}
		else {
			return 0;
		}
	}
	
	
	
	

}
