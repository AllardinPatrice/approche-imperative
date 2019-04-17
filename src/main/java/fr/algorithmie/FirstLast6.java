package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array2 = {8, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		//int[] array2 = {} ;
		boolean verifConditions = false;
		if ((array2.length >= 1)&&((array2[0]==6)||(array2[array2.length-1 ]==6))){
			verifConditions = true;
		}
		System.out.println("Condition FirstLast6 : " + verifConditions );

	}

}
