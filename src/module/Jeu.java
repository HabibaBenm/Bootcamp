package module;
import java.lang.Math;

public class Jeu {
	public static void main(String[] args) {
		Personnage[] tabPerso = new Personnage [9];			
		for (int i=0; i<3;i=i+1)
		{
			tabPerso[i]= new Monstre((int)(100*Math.random()), "Monstre"+ i);
		    tabPerso[3+i]= new Sorcier((int)(100*Math.random()), "Sorcier"+ i);
		    tabPerso[6+i]= new Magicien((int)(100*Math.random()), "Magicien"+ i);
		 }
		for(int j=0;j<tabPerso.length;j++)
		{
			System.out.println("\t Position : "+ j +" Il y a "+tabPerso[j]);
		}
	    while ( nombreMonstreVivant(tabPerso) > 0 && nombreVivant(tabPerso)>1 )
	    {
	    	int p1 = (int)(Math.random()*10);
	    	int p2 =(int)(Math.random()*10);
	    	if(p1!=p2)
	    	{
	    		System.out.println("\n"+ tabPerso[p1].getNom()+"attaque" + tabPerso[p2].getNom());
	    		tabPerso[p1].attaque(tabPerso[p2]);
	    		for(int j=0; j< tabPerso.length;j++)
	    		{
	    			System.out.println("En position"+ j + "Il y a" + tabPerso[j]);
	    		}
	    	}
	    	
        }
	    if (nombreVivant(tabPerso)- nombreMonstreVivant(tabPerso)>=1)
		{
			System.out.println("\n Les sorciers sont gagnes");
		}
		else
		{
			int vainqueur = 0 ;
			int j;
			for (j=0;j<3;j++)
			{
				if (!(tabPerso[j].mort()))
				{
					vainqueur = j;
				}
			}
			System.out.println("\n Le grand gagnand est " + tabPerso[vainqueur].getNom());
		}

     }
	public static int nombreMonstreVivant(Personnage[]tabPerso) {
		int compteur = 0;
		for(int j=0 ; j<9 ; j++)
		{
			if (tabPerso[j].getVie()>0){
				compteur++;
			}
		}			
		return compteur;
	}
	public static int nombreVivant(Personnage[]tabPerso) {
		int compteur = 0;
		for(int j=0 ; j<9 ; j++)
		{
			if (tabPerso[j].getVie()>0){
				compteur++;
			}
		}			
		return compteur;
	}
}
