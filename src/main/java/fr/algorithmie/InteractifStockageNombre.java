package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		int[] tab = new int[0];
		boolean termine = false;
		while (!termine) {

			System.out.println("1. Ajouter un nombre ");
			System.out.println("2. Afficher les nombres existants ");
			Scanner scanner = new Scanner(System.in);
			int valeur = scanner.nextInt();
			if (valeur == 1){
				//Demander un nombre
				System.out.println("Entrez un nombre :");
				int valeurTab = scanner.nextInt();
				//Agrandir le tableau
				int [] tabtmp = new int [tab.length +1];
				for (int i = 0; i < tabtmp.length -1; i++ ) {
					tabtmp[i] = tab[i];
				}
				tabtmp [tabtmp.length-1] = valeurTab;
				tab = tabtmp ;
			}
			else {
				if (valeur == 2) {
					//Afficher le tableau
					for (int i = 0; i < tab.length ; i++) {
						System.out.println("La valeur de l'indice : " + i + " vaut " + tab[i] );
					}
					//termine = true;
				}
			}
			
			
			
		}
	}

}
