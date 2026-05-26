package pctEx03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[3][3];
		int soma=0;
		
		matriz[0][0]= 1;
		matriz[0][1]= 2;
		matriz[0][2]= 2;
		matriz[1][0]= 3;
		matriz[1][1]= 2;
		matriz[1][2]= 3;
		matriz[2][0]= 4;
		matriz[2][1]= 1;
		matriz[2][2]= 1;
		
		System.out.println("Soduko: ");
		for (int lin = 0; lin < matriz.length; lin++) {
			soma=0;
			for (int col = 0; col < matriz.length; col++) {

				soma = soma + matriz[lin][col];
				System.out.print(" " + matriz[lin][col]);
			
		
			}
			System.out.println();
			
			System.out.println("A soma da linha: " + (lin + 1) + ": " + soma);
	      }
		

	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
