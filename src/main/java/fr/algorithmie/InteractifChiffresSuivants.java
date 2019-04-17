package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		System.out.println("Entrez un nombre : ");
		Scanner scanner = new Scanner(System.in);
		int valeur = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			if (i == 10) {
				System.out.print(valeur + i + ". ");
			} else {
				System.out.print(valeur + i + ", ");
			}
		}

	}

}
