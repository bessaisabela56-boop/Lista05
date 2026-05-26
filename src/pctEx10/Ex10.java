package pctEx10;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[][] matriz = {
	            {1, 2, 5, 1, 4},
	            {3, 2, 4, 2, 3},
	            {4, 1, 2, 3, 7},
	            {5, 5, 2, 4, 9},
	            {1, 2, 4, 5, 1}
	        };

	        int soma = 0;

	        for (int i = 0; i < 5; i++) {

	            soma += matriz[i][i];

	        }

	        System.out.println("Soma da diagonal principal: " + soma);
	    }
	
	
	
	
	}


