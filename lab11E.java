import logdm.utilitaires.Visionneur;

public class lab11E {

	public static void main(String[] args) {
		Visionneur v = new Visionneur(false, // Avec ou sans grille
				20, // Nombre de colonne
				5, // Nombre de ranger
				666, // Ne sert a rien
				false, // Avec ou sans console
				Visionneur.GRAPHIQUE, Visionneur.MOYENNE);
		int n [] = new int[20];
		for (int i = 0; i < 20; i++) {
			n[i] = (int)(Math.random()*5);
			//On dessine les billes dans la colonne
			for (int j = 0; j < n[i]; j++) {
				v.placerImage(i, 4-j, 1);
			}
		}
		v.dormir(2000);
		//Animation
		for (int i = 0; i < 20; i++) {
			v.placerImage(i, 4-n[i], 70);
			v.dormir(100);
			v.effacer(i, 4-n[i-1]);

		}

	}

}
