package ordena;

public class BBHibridoVetorA {
	public static void main(String[] args) {
		int vetor[];
		vetor = new int[1000000];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
		}
		long start = System.currentTimeMillis();
		BBSortHibrido(vetor);
		long tempoFinal = System.currentTimeMillis();
		long elapsed = tempoFinal - start;
		System.out.println("Tempo inicial :" + start);
		System.out.println("Tempo final :" + tempoFinal);
		System.out.println("Tempo de execução:" + elapsed);
	}

	public static void BBSortHibrido(int[] vetor) {
		int i, temp, cont;
		cont = vetor.length - 1;
		Boolean HouveTroca = true;
		while (HouveTroca) {
			HouveTroca = false;
			for (i = 0; i < cont; i++) {
				if (vetor[i] > vetor[i + 1]) {
					temp = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = temp;
					HouveTroca = true;
				}
			}
		}
	}

}
