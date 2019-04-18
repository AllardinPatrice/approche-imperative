package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };

		int[] arrayGrand = null;
		int[] arrayPetit = null;
		if (array1.length >= array2.length) {
			arrayGrand = array1;
			arrayPetit = array2;
		} else {
			arrayGrand = array2;
			arrayPetit = array1;
		}

		for (int i = 0; i < arrayGrand.length; i++) {
			if (i < arrayPetit.length) {
				arrayGrand[i] = arrayPetit[i] + arrayGrand[i];
			}

			System.out.println("La somme est : indice : " + i + " valeur : " + arrayGrand[i]);
		}
	}

}
