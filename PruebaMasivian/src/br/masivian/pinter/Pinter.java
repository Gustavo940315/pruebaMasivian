package br.masivian.pinter;

import br.masivian.pinter.operations.Operations;

public class Pinter {
	public static void main(String[] args) { 
		Operations operation = new Operations();
		int K =1;
		int J =1;
		int SQUARE = 9;
		int ORD = 2 ;
		final int M = 1000;
		int P[] = new int[M+1];
		final int ORDMAX = 30;
		int MULT[] = new int[ORDMAX+1];
		int N=0;
		boolean JPRIME = false;	
		P[1] = 2;
		
		operation.operationA(K, M, J, SQUARE, ORD, P, MULT, N, JPRIME);

	}
	
	
}
