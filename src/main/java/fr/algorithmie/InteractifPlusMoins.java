package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		int valeurCible = (int) (Math.random() * 100) + 1;
		// System.out.println("Random " + valeurCible );
		boolean trouve = false;
		int nbCoups = 0;
		while (!trouve) {
			System.out.println("Entrez un nombre entre 1 et 100 : ");
			Scanner scanner = new Scanner(System.in);
			int valeur = scanner.nextInt();
			nbCoups++;
			if (valeur == valeurCible) {
				trouve = true;
			} else {
				if (valeur > valeurCible) {
					System.out.println("Trop haut");
				} else {
					System.out.println("Trop bas");
				}
			}
		}
		System.out.println("Bravo, vous avez trouvé en " + nbCoups + " coups");
	}

}
