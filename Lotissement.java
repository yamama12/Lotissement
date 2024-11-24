package TP5;

public class Lotissement implements GestionPropriete{

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Propriété p[]=new Propriété[4];
		Personne per=new Personne(1234567,"yamama","khalili");
		p[0]=new Ville(1,per,"nabeul",300.0 ,2, true);
		p[1]=new PropriétéProfessionnelle(2,per,"nabeul",175.00,2,true);
		p[2]=new PropriétéProfessionnelle(3,per,"pokd",200.00,3,false);
		p[1]=new Appartement(4,per,"hammamet",180.5,0,2);
		System.out.println(p[0]);
	}*/	
	
		protected Propriété[] tab;
		protected int n ;
		

		public Lotissement(Propriété[] tab, int n) {
			this.tab = tab;
			this.n = n;
		}
		
		public Propriété getproprieteByIndice (int i) {
			if (i<0 && tab[i]!=null) {
				return tab[i];
			}
			else {
				return null;
			}
		}
		
		public int getnbPieces() {
			int s=0;
			for (int i=0;i<n;i++) {
				if (tab[i] instanceof PropriétéPrivée) {
				 s=s+((PropriétéPrivée)tab[i]).getNbPieces(); 
				}
			}
			return s;
		}

		@Override
		public void afficherPropriete() {
			// TODO Auto-generated method stub
			for (int i=0;i<n;i++) {
				System.out.println(tab[i]);
			}
			
		}

		@Override
		public boolean ajouter(Propriété p) {
			// TODO Auto-generated method stub
			if (n<max_proprietes) {
				tab[n]=p;
				n++;
				return true;
			}
			else {
				return false;
			}

		}

		@Override
		public boolean supprimer(Propriété p) {
		    for (int i = 0; i < n; i++) {
		        if (tab[i].equals(p)) {
		            for (int j = i; j < n - 1; j++) {
		                tab[j] = tab[j + 1];
		            }
		            tab[n - 1] = null; 
		            n--;
		            return true; 
		        }
		    }
		    return false; 
		}

		
		
		
		
		
		
		
		
}


