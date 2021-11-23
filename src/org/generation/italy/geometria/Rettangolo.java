package org.generation.italy.geometria;

public class Rettangolo {

	int base;
	int altezza;

	Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	int calcolaPerimetro() {
		int calcolaPerimetro = base * 2 + altezza * 2;
		return calcolaPerimetro;
	}

	int calcolaArea() {
		int calcolaArea = (base * altezza);
		return calcolaArea;
	}

	void printRettangolo() {
		System.out.println(" base " + this.base + " altezza" + this.altezza);
	}
}
