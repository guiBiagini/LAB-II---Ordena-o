package ordena;

public class InsercaoVetorA {
	public static void main(String[] args) {
		int vetor[];
		vetor = new int[100000];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
		}
		long start = System.currentTimeMillis();
		Insercao(vetor);
		long tempoFinal = System.currentTimeMillis();
		long elapsed = tempoFinal - start;
		System.out.println("Tempo inicial :" + start);
		System.out.println("Tempo final :" + tempoFinal);
		System.out.println("Tempo de execução:" + elapsed);

	}

	public static void Insercao(int[] vetor) {
		int i, j, v;
		for (i = 1; i < vetor.length; i++) {
			v = vetor[i];
			j = i;
			while ((j > 0) && (vetor[j - 1] > v)) {
				vetor[j] = vetor[j - 1];
				j--;
			}
			vetor[j] = v;
		}
	}

}
