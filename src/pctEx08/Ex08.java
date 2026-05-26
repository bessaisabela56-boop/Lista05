package pctEx08;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner receba = new Scanner(System.in);

	        int[][] matriz = new int[3][3];
	        int[][] invertida = new int[3][3];

	        
	        System.out.println("Digite os valores da matriz:");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Posição [" + i + "][" + j + "]: ");
	                matriz[i][j] = receba.nextInt();
	            }
	        }

	       
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                invertida[j][i] = matriz[i][j];
	            }
	        }

	        
	        System.out.println("\nMatriz Original:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }

	      
	        System.out.println("\nMatriz Invertida:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(invertida[i][j] + " ");
	            }
	            System.out.println();
	        }

	        receba.close();
	    }
	
		
		
		
		
		
		
		
	}

}
