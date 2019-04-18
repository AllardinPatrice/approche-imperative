package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		for (int i = 0; i < array2.length -1; i++){
			int min = i;
			for (int j = i+1; j < array2.length ; j++) {
				if (array2[j] < array2[min] ) {
					min = j;
				}
			}
			if (min != i) {
				int c;
				c = array2 [i];
				array2[i] = array2[min];
				array2[min] = c;
			}
		}
		for (int i = 0 ; i < array2.length ; i++) {
			System.out.println("Le tableau trié est : indice : " + i + " valeur : " + array2[i]);	
		}
	}
}
