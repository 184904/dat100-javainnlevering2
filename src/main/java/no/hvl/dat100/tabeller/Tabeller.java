package no.hvl.dat100.tabeller;

public class Tabeller {
	public static void main(String[] args) {
		int[] tabell = {0,2,3,4,5};
		skrivUt(tabell);
	}

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == 0) {
				System.out.println("Må være et helt tall");
			} else {
				System.out.print(tabell[i]);
				if (i < tabell.length - 1) {
					System.out.print(",");
				}
			}
		}
		System.out.println("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String hello = "[";
		for (int i = 0; i < tabell.length; i++) {
			hello += Integer.toString(tabell[i]);
			if (i < tabell.length - 1) {
				hello += ",";
			}
		}
		hello += "]";
		System.out.println(hello);
		return hello;
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
		return nyListe;
	}
}
