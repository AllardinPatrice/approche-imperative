package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int [] arrayCopy = new int[array.length];
		for (int i = array.length-1; i >=0; i--) {
			arrayCopy[arrayCopy.length-i-1] = array[i];
			
		}
		
		for (int i = array.length-1; i >=0; i--) {
			System.out.println("Copie Elément Inversé : " + i + " : "  + array[i] + " : "  + arrayCopy[i]);
		}
	}

}
