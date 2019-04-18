package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		System.out.println("Choisir un rang Fibonacci : ");
		Scanner scanner = new Scanner(System.in);
		double valeur = scanner.nextInt();
		double premiereValeur = 0;
		double deuxiemeValeur = 1;
		double valeurTemporaire;
		for (double increment = 0; increment < valeur; increment++) {
			valeurTemporaire = premiereValeur + deuxiemeValeur;
			premiereValeur = deuxiemeValeur;
			deuxiemeValeur = valeurTemporaire;
		}
		System.out.println("Fibonacci : " + premiereValeur);
	}

}
