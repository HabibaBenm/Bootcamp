package module;

public class NainJardin extends Victime {
	
	protected int solidite;
	
	public NainJardin(int solidite) {
	}
	
	public int getSolidite() {
		return this.solidite;
	}
	
	public int subitFrappe(int coup){
		int degatM = this.getSolidite();		
		if(coup > this.solidite) {
			this.solidite = 0;
		}
	    return -degatM;
	}
	
	public int subitCharme(int charme) {
		return -1;
	}
	
}
