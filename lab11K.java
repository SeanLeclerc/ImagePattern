

import logdm.utilitaires.Visionneur;

public class lab11K {

	public static void main(String[] args) {
		Visionneur v = new Visionneur(false, // Avec ou sans grille
				20, // Nombre de colonne
				5, // Nombre de ranger
				666, // Ne sert a rien
				false, // Avec ou sans console
				Visionneur.GRAPHIQUE, Visionneur.MOYENNE);
		int n = v.lireInt("Nombre de billes :",10);
		if( n<5 || n>15) n = (int)(Math.random()*11);
		boolean[] t = new boolean[20];
		int j;
		for (int i = 0; i < n; i++) {
			do {
				j = (int)(Math.random()*20);
				
			}while(t[j] == true);
			v.placerPokemon(j, 1, (int) (Math.random()*150));
			t[j] = true;
			
		}
		boolean[] t2 = new boolean[20];
		for (int i = 0; i < n; i++) {
			do {
				j = (int)(Math.random()*20);
				
			}while(t2[j] == true);
			v.placerPokemon(j, 3, (int)(Math.random()*150));
			t2[j] = true;
		}
		v.dormir(2000);
		for (int i = 0; i < 20; i++) {
			if( t[i] && t2[i]) v.placerImage(i, 2, 45);
			
		}
			

	}

}
