package module;

public abstract class Personnage extends Victime{
	
	public int pointVie ;
	
	public String nom ;
	
	public Personnage (int pointVie, String nom) {
		this.nom= nom;
		this.pointVie= pointVie;
	}

	public String toString(Personnage p) {
       if (p.pointVie<=0) {
    	   return (p.nom+"est mort");
       }
       else {
    	   return p.nom+"a"+p.pointVie+"points de vie";
       }
	}
	
	public String getNom() { return this.nom; }
	
	public boolean mort() {
		if (this.pointVie > 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public int getVie() { return this.pointVie; }
	
	public void addVie(int num) {
         this.pointVie += num ;
	}
	
	public abstract void attaque(Personnage p);
	public abstract int subitFrappe(int coup);
	public abstract int subitCharme(int coup);


	
}
 