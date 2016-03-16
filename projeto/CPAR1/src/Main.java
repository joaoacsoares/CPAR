import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		do {
			System.out.println(" \n 1. Multiplication");
			System.out.println("2. lin Multiplication");
			System.out.println("Selection?: ");
			Scanner a = new Scanner(System.in);
			op = a.nextInt();

			System.out.println("Dimensions: lins cols ? ");
			int lin = a.nextInt();
			int col = a.nextInt();

			switch (op){
			case 1: 
				printMatrix(onMult(lin, col));
				break;
			case 2:
				printMatrix(onMultlin(lin, col));
				break;
			}
		}while (op != 0);
	}


	private static void printMatrix(double [][] matrix)
	{
		System.out.println("Result Matrix");
		for(int i=0; i<matrix.length; i++)
		{ for(int j=0; j<matrix.length; j++)
			System.out.print(matrix[i][j] + " ");
		System.out.println();
		}

	}

	private static double [][] onMultlin(int lin, int col) {
		double[][] pha = new double [lin][col];
		double[][] phb = new double [lin][col];
		double[][] phc = new double [lin][col];
		for(int i=0; i<lin; i++)
			for(int j=0; j<col; j++)
				pha[i][j] = (double)1.0;

		for(int i=0; i<lin; i++)
			for(int j=0; j<col; j++)
				phb[i][j] = (double)(i+1);

		for(int i=0; i<lin; i++)
		{	
			for( int k=0; k<lin; k++)
			{	 
				for( int j=0; j<col; j++)
				{	
					phc[i][k] += pha[i][k] * phb[j][k];
				}

			}
		}
		return phc;

	}




	public static double[][] onMult(int lin, int col)
	{
		double[][] pha = new double [lin][col];
		double[][] phb = new double [lin][col];
		double[][] phc = new double [lin][col];
		for(int i=0; i<lin; i++)
			for(int j=0; j<col; j++)
				pha[i][j] = (double)1.0;

		for(int i=0; i<lin; i++)
			for(int j=0; j<col; j++)
				phb[i][j] = (double)(i+1);

		double temp;
		for(int i=0; i<lin; i++)
		{	
			for( int j=0; j<col; j++)
			{	 
				temp  = 0;
				for( int k=0; k<lin; k++)
				{	
					temp += pha[i][k] * phb[k][j];
				}
				phc[i][j]=temp;
			}
		}
		return phc;
	}

}


