package no.hvl.dat100.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] a : matrise) {
			for (int b : a)  {
				System.out.println(b);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String matriseString = "";
		for (int[] a : matrise) {
			matriseString += Arrays.toString(a).replace("]", " \n").replace("[", "").replace(",", "");
		}
		System.out.println(matriseString);
		return matriseString;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erLikBoolean = false;
		if (a == b) {
			erLikBoolean = true;
		}
		return erLikBoolean;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] matriseSpeilet = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matriseSpeilet[i][j] = matrise[j][i];
			}
		}
		return matriseSpeilet;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		return a;
	}
}
