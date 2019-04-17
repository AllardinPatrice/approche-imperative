package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {

		int nombreBatons = 21;
		int valeurCPU;
		boolean termine = false;
		while (!termine) {

			System.out.println("Choisir 1, 2 ou 3 batons : ");
			Scanner scanner = new Scanner(System.in);
			double valeur = scanner.nextInt();
			
			nombreBatons -= valeur;
			if (nombreBatons == 0){
				termine = true;
				break;
			}
			if (nombreBatons == 5){
				
			}
			valeurCPU = (int)(Math.random()*3) +1;
			System.out.println("Nombre de batons CPU : " + valeurCPU);
			nombreBatons -= valeurCPU ;
			if (nombreBatons == 0){
				termine = true;
				break;
			}
			System.out.println("Nombre de batons restant : " + nombreBatons);
			
		}
	}

}
