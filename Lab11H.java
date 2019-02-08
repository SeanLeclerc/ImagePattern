//============================================================================
// Programmeur: Daniel
// Date: 2015-11-13
// Fichier: Lab11H.java
// Description: 12951/22223 : Laboratoire no 11
//============================================================================

import logdm.utilitaires.*;

//============================================================================
public class Lab11H
//============================================================================
{

	//------------------------------------------------------------------------
	public static void main(String[] args) 
	//------------------------------------------------------------------------
	{
		Visionneur v = new Visionneur(20,20,Visionneur.GRAPHIQUE,Visionneur.MOYENNE);
		boolean[] cellule = new boolean[76];  //false = innocupée
		int n = v.lireInt("Combien d'images (0-76):",50);
		if ( n<0 || n>76 ) n = (int)(Math.random()*77); 
		//On place n true dans le tableau cellule
		for( int i=0 ; i<n ; i++ ) {
			int j;
			do {
				j = (int)(Math.random()*76);
			}while( cellule[j] );
			cellule[j] = true;
		}
		//On affiche les images;
		for( int i=0 ; i<76 ; i++ ) {
			if( i<20 && cellule[i] ) v.placerImage(i, 0, 1);
			else if( i>=20 && i<38 && cellule[i] ) v.placerImage(19, i-19, 1);
			else if( i>=38 && i<58 && cellule[i] ) v.placerImage(19-(i-38), 19, 1);
			else if( i>=58 && i<76 && cellule[i] ) v.placerImage(0, 19-(i-57), 1);
		}
	}

}
