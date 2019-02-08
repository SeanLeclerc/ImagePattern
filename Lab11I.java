//============================================================================
// Programmeur: Daniel
// Date: 2015-11-13
// Fichier: Lab11I.java
// Description: 12951/22223 : Laboratoire no 11
//============================================================================

import logdm.utilitaires.*;

//============================================================================
public class Lab11I
//============================================================================
{

	//------------------------------------------------------------------------
	public static void main(String[] args) 
	//------------------------------------------------------------------------
	{
		Visionneur v = new Visionneur(10,5,Visionneur.GRAPHIQUE,Visionneur.MOYENNE);
		int[] position = new int[10];
		int n = 0;
		do {
			v.effacer();
			for (int i=0; i<10; i++) position[i] = i;
			for( int i=0 ; i<10 ; i++ ) {
				int indice = (int)(Math.random()*10);
				int temp = position[i];
				position[i] = position[indice];
				position[indice] = temp;
			}
			for (int x=0; x<10; x++) {
				v.placerChiffre(x, 2, position[x]);
			}
			v.dormir( 5000 );
			n++;
		}while( n<10 );		
	}

}
