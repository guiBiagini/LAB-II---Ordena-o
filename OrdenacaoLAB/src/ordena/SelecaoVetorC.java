package ordena;

public class SelecaoVetorC {
	public static void main(String[] args) {
		int vetor[];
		vetor = new int[100000];
		for (int i = vetor.length - 1; i > 0; i--) {
			vetor[i] = 100000 - i;
		}
		long start = System.currentTimeMillis();
		Selecao(vetor);
		long tempoFinal = System.currentTimeMillis();
		long elapsed = tempoFinal - start;
		System.out.println("Tempo inicial :" + start);
		System.out.println("Tempo final :" + tempoFinal);
		System.out.println("Tempo de execução:" + elapsed);
	}

	public static void Selecao(int[] vetor) {
		int i, j, min, aux;
		for (i = 0; i < vetor.length - 1; i++) {
			min = i;
			for (j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[min]) {
					min = j;
					aux = vetor[min];
					vetor[min] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
	}
}
