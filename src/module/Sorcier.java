package module;

public class Sorcier extends Personnage {

	public double pouvoir;

	public Sorcier(int pointVie, String nom) {
		super(pointVie, nom);
		this.pouvoir = Math.random();
	}

	public void attaque(Personnage p) {
		if (!(this.mort())) {
			int pointVieS = this.getVie();
			int ContreAttaque = p.subitFrappe((int) (pointVieS * pouvoir));
			this.addVie(ContreAttaque);
		}
	}

	public int subitFrappe(int coup) {
		this.addVie(-coup);
		int pointVieS = this.getVie();
		if (pointVieS > 0) {
			return (int) (-pointVieS * pouvoir);
		} else
			return 0;
	}

	public int subitCharme(int coup) {
		System.out.println("Aucun charme n’a d’effet sur un sorcier");
		return 0;
	}

	protected double getPouvoir() {
		return this.pouvoir;
	}
}
