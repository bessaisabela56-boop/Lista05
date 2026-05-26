package pctEx05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
		int[][] matriz = new int[4][3];
		int num;
		boolean encontrado = false;

		matriz[0][0] = 42;
		matriz[0][1] = 12;
		matriz[0][2] = 06;
		matriz[0][0] = 33;
		matriz[1][0] = 14;
		matriz[1][1] = 78;
		matriz[1][2] = 24;
		matriz[2][0] = 90;
		matriz[2][1] = 58;
		matriz[2][2] = 64;
		matriz[3][0] = 22;
		matriz[3][1] = 10;
		matriz[3][2] = 45;

		System.out.println("Soduko: ");
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(" " + matriz[lin][col]);

			}
			System.out.println();

		}

		System.out.println("Digite um numero de 1 a 100: ");
		num = receba.nextInt();

		for (int i = 0; i < matriz[i].length; i++) {
			for (int j = 0; j < matriz[j].length; j++) {

				if (matriz[i][j] == num) {
					encontrado = true;
					System.out.println("O numero se encontra na matriz");
				} else {
					System.out.println("O numero não se encontra na matriz");
					break;
				}
			}
		}
	}
}
