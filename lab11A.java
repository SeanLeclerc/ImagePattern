import logdm.utilitaires.Visionneur;

public class lab11A {

	public static void main(String[] args) {
		Visionneur v = new Visionneur(false, // Avec ou sans grille
				20, // Nombre de colonne
				5, // Nombre de ranger
				666, // Ne sert a rien
				false, // Avec ou sans console
				Visionneur.GRAPHIQUE, Visionneur.MOYENNE);
		boolean[] t = new boolean[20];
		int j;
		for (int i = 0; i < 11; i++) {
			do {
				j = (int)(Math.random()*20);
				
			}while(t[j] == true);
			v.placerPokemon(j, 1, (int) (Math.random()*150));
			t[j] = true;
		}

	}

}
