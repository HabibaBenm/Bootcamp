package module;

public class Monstre extends Personnage {
	
	public Monstre(int pointVie, String nom) {
			super (pointVie, nom);
	}
	public void attaque(Personnage p) {
		if(!(this.mort())) {
			int pointVieM = this.getVie();
            int ContreAttaque = p.subitFrappe(pointVieM/2);
		    this.addVie(ContreAttaque);
		}
	}
	
	public int subitFrappe(int coup) {
		this.addVie(-coup);
		int pointVieM= this.getVie();
		if(pointVieM >0) {
			return (-pointVieM/2);
		}
		else return 0;
	}
	public int subitCharme(int coup) {
		this.addVie(-coup);
		int pointVieM= this.getVie();
		if(pointVieM >0) {
			return (pointVieM/2);
		}
		else return 0;
	}
	
}