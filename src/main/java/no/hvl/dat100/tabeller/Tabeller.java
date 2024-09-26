package no.hvl.dat100.tabeller;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tabeller {
	public static void main(String[] args) {
		int[] tabell = {0,2,3,4,5};
		skrivUt(tabell);
	}

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		for (int e : tabell) {
			if (e == 0) {
				System.out.println("Du kan bare ha heltall");
				break;
			} else {
				System.out.println(Arrays.toString(tabell));
				break;
			}
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}      	

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
