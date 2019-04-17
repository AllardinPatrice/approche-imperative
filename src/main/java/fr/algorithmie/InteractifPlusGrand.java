package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		int plusGrand = Integer.MIN_VALUE;
		for (int i = 1; i <= 10; i++ ) {
			System.out.println("Entrez un nombre : ");
			Scanner scanner = new Scanner(System.in);
			int valeur = scanner.nextInt();
			if (valeur > plusGrand ) {
				plusGrand = valeur;
			}
		}
		System.out.println("Le plus grand est : " + plusGrand);

	}

}
