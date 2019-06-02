package ordena;

import java.util.Random;

public class ShellSortVetorC {
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
		shellSort(vetor);
		long tempoFinal = System.currentTimeMillis();
		long elapsed = tempoFinal - start;
		System.out.println("Tempo inicial :" + start);
		System.out.println("Tempo final :" + tempoFinal);
		System.out.println("Tempo de execução:" + elapsed);
	}

	public static void shellSort(int[] nums) {
		int h = 1;
		int n = nums.length;
		while (h < n) {
			h = h * 3 + 1;
		}
		h = h / 3;
		int c, j;
		while (h > 0) {
			for (int i = h; i < n; i++) {
				c = nums[i];
				j = i;
				while (j >= h && nums[j - h] > c) {
					nums[j] = nums[j - h];
					j = j - h;
				}
				nums[j] = c;
			}
			h = h / 2;
		}
	}
}
