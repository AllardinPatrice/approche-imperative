package fr.tableaux;

public class Exercice2 {

	public static void main(String[] args) {
		int [][] tab = {{1,2,3,5,6,7,8,9,10}, {4,5,6,7,8,9}, {1,2}};
		int [][] tab2 = new int [2][];
		tab2[0] = new int[] {1,2,3,4,5};
		tab2[1] = new int[] {6,7,8,9,10};
		System.out.println("Longueur de tableau : " + tab.length);
		System.out.println("Longueur de tableau 0 : " + tab[0].length);
		System.out.println("Longueur de tableau 1 : " + tab[1].length);
		System.out.println("Premier élément du tableau : " + tab[0][0]);
		System.out.println("Dernier élément de tableau : " +  tab[tab.length-1][tab[tab.length-1].length-1]);
		
	}

}
