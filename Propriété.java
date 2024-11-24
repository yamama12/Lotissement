package TP5;

import java.util.Objects;

public abstract class Propriété {
	protected int id;
	protected Personne responsable;
	protected String adresse ;
	protected double sourface ;
	
	public Propriété(int id, Personne responsable, String adresse, double sourface) {
		this.id = id;
		this.responsable = responsable;
		this.adresse = adresse;
		this.sourface = sourface;
	}

	@Override
	public String toString() {
		return "Propriété [id=" + id + ", responsable=" + responsable + ", adresse=" + adresse + ", sourface="
				+ sourface + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propriété other = (Propriété) obj;
		return id == other.id;
	}

	public abstract double calculImpot ();
	
	
	
	
	
	

}
