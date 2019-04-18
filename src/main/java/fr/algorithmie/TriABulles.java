package fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		for (int i = array2.length-1; i >=1; i--) {
			for (int j = 0 ; j <= i -1; j++ ) {
				if (array2[j+1] < array2[j]) {
					int c = 0;
					c = array2[j+1];
					array2[j+1] = array2[j];
					array2[j] = c;
				}
			}
		}
		for (int i = 0 ; i < array2.length ; i++) {
			System.out.println("Le tableau trié à bulles est : indice : " + i + " valeur : " + array2[i]);	
		}
	}
}
