package ordena;


public class BBSortClassicoVetorA {

	public static void main(String[] args) {
		int vetor[];
		vetor = new int[1000000];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
		}
		long start = System.currentTimeMillis();
		BBSortClassico(vetor);
		long tempoFinal = System.currentTimeMillis();
		long elapsed = tempoFinal - start;
		System.out.println("Tempo inicial :" + start);
		System.out.println("Tempo final :" + tempoFinal);
		System.out.println("Tempo de execução:" + elapsed);
	}

	public static void BBSortClassico(int[] vetor) {
		int i, j, temp;
		for (i = 0; i < vetor.length - 1; i++)
			for (j = 0; j < vetor.length - 1; j++)
				if (vetor[j] > vetor[j + 1]) {
					temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
	}

}
