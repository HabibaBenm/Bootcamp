package module;

public class Magicien extends Sorcier implements SuperPouvoir {
	
	protected double superPouvoir ;
	protected double extra;
	
	protected double getPouvoir() {
    	return this.pouvoir;
	    }
	
	protected Magicien(int pointVie, String nom) {
		super(pointVie, nom);
		this.superPouvoir = this.pouvoir * extra;
	}
	
	public double sort() {
		double sort = (Math.random()) * this.superPouvoir;
	    return sort;
	}
	
	public int subitCharme(int coup) {
		double sortval= sort();
		return -(int)(coup * sortval) ;
	}
}
