import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		System.out.println("Entrez un nombre : ");
		Scanner scanner = new Scanner (System.in);
		int valeur = scanner.nextInt();
		System.out.println("Table de " + valeur);
		for (int i = 1; i <= 10; i++) {
			System.out.println(valeur + " * " + i + " = " + valeur*i);
		}

	}

}
