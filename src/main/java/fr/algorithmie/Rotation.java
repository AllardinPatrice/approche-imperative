package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] array2 = {6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int c = array2[array2.length-1];
		for (int i = array2.length-1; i > 0  ; i--) {
			array2[i] = array2[i-1];
		}
		array2[0] = c;

		for (int i = 0; i < array2.length ; i++) {
			System.out.println("Rotation : indice : " + i + " valeur : " + array2[i]);
		}
	}
}
