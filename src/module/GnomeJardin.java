package module;

public class GnomeJardin extends NainJardin implements SuperPouvoir{

	protected double superPouvoir ;
	
	protected double extra;
	
	public GnomeJardin(int solidite) {
		super (solidite);
	}
	
	public double sort() {
		double sort = (Math.random()) * this.superPouvoir;
	    return sort;
	}
	
	public int subitCharme(int charme) {
		if (sort()> charme) {
			return -charme;
		}
		return 0;
	}

}
