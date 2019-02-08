//============================================================================
// Programmeur: Daniel
// Date: 2015-11-13
// Fichier: Lab11G.java
// Description: 12951/22223 : Laboratoire no 11
//============================================================================

import logdm.utilitaires.*;

//============================================================================
public class Lab11G
//============================================================================
{

	//------------------------------------------------------------------------
	public static void main(String[] args) 
	//------------------------------------------------------------------------
	{
		Visionneur v = new Visionneur(20,10,Visionneur.GRAPHIQUE,Visionneur.MOYENNE);
		boolean[][] grille = new boolean[10][10];  //false = innocupée
		//On place les 50 images de la grille de gauche
		int x,y;
		for (int i = 0; i < 80; i++) {
			do{
				x = (int)(Math.random()*10);
				y = (int)(Math.random()*10);
			}while(grille[x][y]);
			grille[x][y] = true;
			v.placerImage(x, y, 1);
		}
		v.dormir(1000);
		//On place les 20 images de la grille de droite
		for (x = 0; x<grille.length; x++) {
			for (y = 0; y<grille[0].length; y++) {
				if( !grille[x][y] ) v.placerImage(10+x,y,0);
			}
		}
	}

}
