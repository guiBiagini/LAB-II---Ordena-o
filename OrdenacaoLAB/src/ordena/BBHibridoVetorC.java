package ordena;

import java.util.Random;

public class BBHibridoVetorC {

	public static void main(String[] args) {
		Random r = new Random();
		int vetor[];
		int a;
		vetor = new int[100000];
		for (int i = 0; i < vetor.length; i++) {
			a = r.nextInt(100000);
			vetor[i] = a;
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
		System.out.println(vetor[80]);
		System.out.println(vetor[81]);
		System.out.println(vetor[82]);
	}

}
