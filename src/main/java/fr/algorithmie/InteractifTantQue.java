package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {

		int valeur = 0;
		while ((valeur < 1) || (valeur > 10)) {
			System.out.println("Entrez un nombre entre 1 et 10 : ");
			Scanner scanner = new Scanner(System.in);
			valeur = scanner.nextInt();
		}
		System.out.println("Valeur : " + valeur );
	}

}
