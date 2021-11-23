package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Scegli la base del tuo rettangolo: ");
		int base = scanner.nextInt();
		System.out.print("Scegli l'altezza del tuo rettangolo: ");
		int altezza = scanner.nextInt();

		Rettangolo t1 = new Rettangolo(base, altezza);

		if (base > 0 && altezza > 0) {
			int area = t1.calcolaArea();
			int perimetro = t1.calcolaPerimetro();

			System.out.println("Il perimetro è: " + perimetro);
			System.out.println("L'area è: " + area);
		} else {
			System.out.println("ERRORE, immettere dati validi!");
		}
		
		scanner.close();
	}

}
