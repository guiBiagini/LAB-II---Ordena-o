package ordena;

import java.util.Random;

public class QuickSortVetorC {
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
		quicksort(vetor, 0, vetor.length - 1);
		long tempoFinal = System.currentTimeMillis();
		long elapsed = tempoFinal - start;
		System.out.println("Tempo inicial :" + start);
		System.out.println("Tempo final :" + tempoFinal);
		System.out.println("Tempo de execução:" + elapsed);
	}

	private static int particao(int a[], int l, int r) {
		int i = l - l, j = r;
		int v = a[r], temp;
		for (;;) {
			while (a[++i] < v)
				;

			while (v < a[--j])
				if (j == l)
					break;
			if (i >= j)
				break;
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		temp = a[i];
		a[i] = a[r];
		a[r] = temp;
		return i;
	}

	private static void quicksort(int a[], int l, int r) {
		if (r <= l) {
			int i = particao(a, l, r);
			quicksort(a, l, i - 1);
			quicksort(a, i + l, r);
		}
	}
}
