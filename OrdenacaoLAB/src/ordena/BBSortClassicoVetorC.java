package ordena;

import java.util.Random;

public class BBSortClassicoVetorC {
	public static void main(String[] args) {
		Random r = new Random();
		int vetor[];
		vetor = new int[100000];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(100000);
		}
		long start = System.currentTimeMillis();
		BBSortClassicoo(vetor);
		long tempoFinal = System.currentTimeMillis();
		long elapsed = tempoFinal - start;
		System.out.println("Tempo inicial :" + start);
		System.out.println("Tempo final :" + tempoFinal);
		System.out.println("Tempo de execução:" + elapsed);
	}

	public static void BBSortClassicoo(int[] vetor) {
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
