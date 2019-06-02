package ordena;

public class BBSortAdaptadoVetorB {
	public static void main(String[] args) {
		int vetor[];
		vetor = new int[1000000];
		for (int i = vetor.length - 1; i > 0; i--) {
			vetor[i] = 100000 - i;
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
					vetor[i] = vetor[1 + 1];
					vetor[i + 1] = temp;
					HouveTroca = true;
				}
		}
	}

}
