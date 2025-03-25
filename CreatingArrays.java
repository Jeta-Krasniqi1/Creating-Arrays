package jetaKrasniqi;

import java.util.Scanner;

public class CreatingArrays {
	public static int[] krijimiivargut() {
        Scanner input = new Scanner(System.in); 
		int gjatesia_e_vargut;
		// Sigurohemi që përdoruesi të mos fusë një gjatësi 0 apo negative pasi shfaq error 
		do {
                System.out.println("Shtyp nje gjatesi te vargut (duhet te jete > 0): ");
                gjatesia_e_vargut = input.nextInt();

                	if (gjatesia_e_vargut < 0) {
                	System.out.println("Gabim! Gjatesia nuk mund te jete 0 apo negative. Ju lutem provoni perseri.");
           		}
	       } while (gjatesia_e_vargut < 0);
		
		// Shtimi i elementeve ne varg
		int [] varguIm = new int[gjatesia_e_vargut];
		System.out.println("Shtyp " + gjatesia_e_vargut +  " elemente te vargut: ");
		for(int i = 0; i < varguIm.length; i++) {
			varguIm[i] = input.nextInt();
			}
		// shfaqja e vargut ne konzole
 
 input.close();
 return varguIm;
}
}
