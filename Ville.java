package TP5;

public class Ville extends PropriétéPrivée {
	private boolean avecPiscine ;

	public Ville(int id, Personne responsable, String adresse, double sourface, int nbPieces, boolean avecPiscine) {
		super(id, responsable, adresse, sourface, nbPieces);
		this.avecPiscine = avecPiscine;
	}
	
	
	
	@Override
	public String toString() {
		return "Ville [avecPiscine=" + avecPiscine + ", id=" + id + ", responsable=" + responsable + ", adresse="
				+ adresse + ", sourface=" + sourface + "]";
	}



	public double calculImpot() {
		if (this.avecPiscine=true) {
			return super.calculImpot()+200;
		}
		else {
			return super.calculImpot();
		}
		
		
	}
	
	
	

}
