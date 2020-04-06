package br.masivian.pinter.operations;

public class Operations {

	public void operationA(int K, int M,int J, int SQUARE, int ORD, int P[], int MULT[], int N, boolean JPRIME ) {
		
		Operations  operations= new Operations();
		
		while (K < M) {
			do {
			J += 2;
			if( J == SQUARE) {
			ORD++;
			SQUARE=P[ORD]*P[ORD];
			MULT[ORD-1]=J;
			}
			N=2;
			JPRIME=true;
			while (N < ORD && JPRIME) {
			while (MULT[N]<J)
				MULT[N] += P[N] + P[N];
			if (MULT[N] == J)
			JPRIME=false;
			N++;
			}
			} while (!JPRIME);
			K++;
			P[K]=J;
			}
		
		operations.operationB(M, P);
		
	}
	
	public void operationB(int M, int P[] ) {
		int PAGENUMBER = 1;
		int PAGEOFFSET = 1;
		final int RR = 50;
		final int CC = 4;
		
		while (PAGEOFFSET <= M) {
			System.out.print("The First ");
			System.out.print(Integer.toString(M));
			System.out.print(" Prime Numbers === Page ");
			System.out.print(Integer.toString(PAGENUMBER));
			System.out.println("\n");
			for (int ROWOFFSET=PAGEOFFSET; ROWOFFSET <= PAGEOFFSET+RR-1;
			ROWOFFSET++) {
			for (int C = 0; C <= CC - 1; C++)
			if (ROWOFFSET + C * RR <= M)
			System.out.printf("%10d", P[ROWOFFSET + C * RR]);
			System.out.println();
			}
			System.out.println("\f");
			PAGENUMBER++;
			PAGEOFFSET += RR*CC;
			}
	}
}
