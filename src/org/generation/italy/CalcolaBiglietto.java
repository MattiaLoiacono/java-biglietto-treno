package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		int age, kmPercorso;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire l'età del passeggero: ");
		age= input.nextInt();
		System.out.print("Inserire la distanza da percorrere in Km: ");
		kmPercorso= input.nextInt();
		
		double prezzo_biglietto=0.21*kmPercorso;
		
		if (age<18) {
			prezzo_biglietto=8*prezzo_biglietto/10;
		}else if (age>65) {
			prezzo_biglietto=6*prezzo_biglietto/10;
		}
		
		System.out.format("Il biglietto costa: %.2f€",prezzo_biglietto);
		input.close();
	}
}
