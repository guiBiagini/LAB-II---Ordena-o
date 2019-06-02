package ordena;

import java.util.Random;

class BBSortAdaptadoVetorC {
	public static void main(String[] args) {
		Random r = new Random();
		int vetor[];
		vetor = new int[100000];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(100000);
		}
		long start = System.currentTimeMillis();
		BBSortAdap1(vetor);
		long tempoFinal = System.currentTimeMillis();
		long elapsed = tempoFinal - start;
		System.out.println("Tempo inicial :" + start);
		System.out.println("Tempo final :" + tempoFinal);
		System.out.println("Tempo de execução:" + elapsed);

	}

	public static void BBSortAdap1(int[] vetor) {
		int i, temp;
		Boolean HouveTroca = true;
		while (HouveTroca) {
			HouveTroca = false;
			for (i = 0; i < vetor.length - 1; i++)
				if (vetor[i] > vetor[i + 1]) {
					temp = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = temp;
					HouveTroca = true;
				}
		}
	}

}
