package no.hvl.dat100.tabeller;


import java.util.Arrays;

public class Tabeller {
<<<<<<< HEAD
=======
	public static void main(String[] args) {
		int[] tabell = {0,2,3,4,5};
		skrivUt(tabell);
	}
>>>>>>> 3644657545227b3169419fe7314cca017296588d

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == 0) {
				System.out.println("Må være et heltall");
				break;
			} else {
				System.out.println(Arrays.toString(tabell));
				break;
			}
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		System.out.println(Arrays.toString(tabell).replace(" ", ""));
		return Arrays.toString(tabell).replace(" ", "");
	}      	

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int sum = 0;
		for (int a : tabell) {
			sum += a;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean sjekkVerdi = false;
		for (int a : tabell) {
			if (a == tall) {
				sjekkVerdi = true;
			}
		}
		return sjekkVerdi;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int posisjon = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				posisjon = i;
			}
		}
		return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int [] nyListe = new int[tabell.length];
		int j = tabell.length -1;
		for (int i = 0; i < tabell.length; i++) {
			nyListe[i] = tabell[j];
			j--;
		}
		System.out.println(Arrays.toString(nyListe));
		return nyListe;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sjekkOmSortert = true;
		for (int i = 0; i < tabell.length - 1; i++) {
			int j = i + 1;
			if (tabell[j] > tabell[i]) {
				sjekkOmSortert = true;
			} else {
				sjekkOmSortert = false;
			}
		}
		System.out.println(Arrays.toString(tabell));
		System.out.println(sjekkOmSortert);
		return sjekkOmSortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyListe = new int[tabell1.length + tabell2.length];
		int y = 0;
		for (int i = 0; i < tabell1.length; i++) {
			nyListe[i] = tabell1[i];
		}
		for (int j = tabell1.length; j < tabell1.length + tabell2.length; j++) {
			nyListe[j] = tabell2[y];
			y++;
		}
		System.out.println(Arrays.toString(nyListe));
		return nyListe;
	}
}
