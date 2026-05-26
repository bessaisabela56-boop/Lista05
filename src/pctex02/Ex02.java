package pctex02;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] matriz = new char[4][5];

		matriz[0][0] = 'a';
		matriz[0][1] = 'b';
		matriz[0][2] = 'c';
		matriz[0][3] = 'd';
		matriz[0][4] = 'e';
		matriz[1][0] = 'f';
		matriz[1][1] = 'g';
		matriz[1][2] = 'h';
		matriz[1][3] = 'i';
		matriz[1][4] = 'j';
		matriz[2][0] = 'l';
		matriz[2][1] = 'm';
		matriz[2][2] = 'n';
		matriz[2][3] = 'o';
		matriz[2][4] = 'p';
		matriz[3][0] = 'q';
		matriz[3][1] = 'r';
		matriz[3][2] = 's';
		matriz[3][3] = 't';
		matriz[3][4] = 'u';

		System.out.println("Matriz letra a): ");
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 5; col++) {
				System.out.print(" " + matriz[lin][col]);

			}
			System.out.println();

		}
		
		
		int [][] matrizes = new int[3][4];
		
		matrizes[0][0]= 19;
		matrizes[0][1]=25;
		matrizes[0][2]=100;
		matrizes[0][3]=99;
		matrizes[1][0]=10;
		matrizes[1][1]=7;
		matrizes[1][2]=25;
		matrizes[1][3]=14;
		matrizes[2][0]=35;
		matrizes[2][1]=2;
		matrizes[2][2]=47;
		matrizes[2][3]=74;

		
		System.out.println("Matriz letra b): ");
		
		for(int i=0; i <3; i++) {
			for(int j = 0; j <4; j++) {
				System.out.print(" "+matrizes[i][j]);
			}
			System.out.println();
		}	
        
		double [][] matriza = new double[3][3];
		
		matriza[0][0]= 1.9;
		matriza[0][1]=2.5;
		matriza[0][2]=10.0;
		matriza[1][0]=1.0;
		matriza[1][1]=7.8;
		matriza[1][2]=2.5;
		matriza[2][0]=3.5;
		matriza[2][1]=2.2;
		matriza[2][2]=4.7;
		

		
		System.out.println("Matriz letra c): ");
		
		for(int li=0; li <3; li++) {
			for(int ja = 0; ja <3; ja++) {
				System.out.print(" "+matriza[li][ja]);
			}
			System.out.println();
	
		}
	
	}
}