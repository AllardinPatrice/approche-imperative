package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		System.out.println("Entrez un nombre : ");
		Scanner scanner = new Scanner(System.in);
		int valeur = scanner.nextInt();
		int somme = 0;
		for (int i = 1; i <= valeur; i++) {
			somme += i;
		}
		System.out.println("La somme des nombres vaut " + somme);
	}

}
