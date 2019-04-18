package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {

		int nombreBatons = 21;
		int valeurCPU = 0;
		boolean termine = false;
		while (!termine) {

			System.out.println("Choisir 1, 2 ou 3 batons : ");
			Scanner scanner = new Scanner(System.in);
			double valeur = scanner.nextInt();

			nombreBatons -= valeur;
			if (nombreBatons == 0) {
				termine = true;
				break;
			}
			if (nombreBatons == 6) {
				// Prendre 1
				nombreBatons--;
				System.out.println("Nombre de batons CPU : 1");
			} else {
				if (nombreBatons == 4) {
					// Prendre 3
					nombreBatons -= 3;
					System.out.println("Nombre de batons CPU : 3");
				} else {
					if (nombreBatons == 3) {
						// Prendre 2
						nombreBatons -= 2;
						System.out.println("Nombre de batons CPU : 2");
					} else {
						if (nombreBatons == 2) {
							// Prendre 1
							nombreBatons--;
							System.out.println("Nombre de batons CPU : 1");
						} else {
							valeurCPU = (int) (Math.random() * 3) + 1;
							nombreBatons -= valeurCPU;
							System.out.println("Nombre de batons Random CPU : " + valeurCPU);

						}
					}
				}
			}

			if (nombreBatons == 0) {
				termine = true;
				continue;
			}
			System.out.println("Nombre de batons restant : " + nombreBatons);
		}
	}

}
