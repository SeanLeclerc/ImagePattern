//============================================================================
// Programmeur: Daniel
// Date: 2015-11-13
// Fichier: Lab11F.java
// Description: 12951/22223 : Laboratoire no 11
//============================================================================

import logdm.utilitaires.*;

//============================================================================
public class Lab11F
//============================================================================
{

	//------------------------------------------------------------------------
	public static void main(String[] args) 
	//------------------------------------------------------------------------
	{
		Visionneur v = new Visionneur(21,21,Visionneur.GRAPHIQUE,Visionneur.MOYENNE);
		//On place les images 
		int[][] grille = new int[21][21];
		for (int x = 0; x < grille.length; x++) {
			for (int y = 0; y < grille[0].length; y++) {
				grille[x][y] = (Math.random()<0.5 ? 34 : 35);
				v.placerImage(x, y, grille[x][y]);
			}
		}
		//Boucle de saisie
		int x,y;
		do{
			int[] c = v.lireCoordonnees("Cliquez sur le labyrinthe");
			x = c[0];
			y = c[1];
			grille[x][y] = (grille[x][y]==34 ? 35 : 34);
			v.placerImage(x, y, grille[x][y],java.awt.Color.WHITE);
		}while( x!=0 || y!=0 );
	}

}
