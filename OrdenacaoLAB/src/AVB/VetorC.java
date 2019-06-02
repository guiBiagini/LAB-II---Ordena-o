package AVB;

import java.util.Random;
import java.util.Scanner;

class VetorC {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner le = new Scanner(System.in);
		Tree arv = new Tree();
		int opcao;
		long x;
		System.out.print("\n Programa Arvore AVB - VETOR C");
		do {
			System.out.print("\n***********************************");
			System.out.print("\nEntre com a opcao:");
			System.out.print("\n ----1: Inserir");
			System.out.print("\n ----2: Pesquisar");
			System.out.print("\n ----3: Sair do programa");
			System.out.print("\n***********************************");
			System.out.print("\n Opcao :  ");
			opcao = le.nextInt();

			switch (opcao) {
			case 1: {
				long tempoInicio = System.currentTimeMillis();

				int i;
				@SuppressWarnings("unused")
				Random gerador = new Random();
				for (i = 0; i < 10000000; i++) {
					arv.inserir(i);
				}

				System.out.println("\nTempo Total( em milisegundos): " + (System.currentTimeMillis() - tempoInicio));
				break;
			}

			case 2: {
				long tempoInicio = System.currentTimeMillis();

				System.out.print("\n Informe o valor (long) -> ");
				x = le.nextLong();
				if (arv.buscar(x) != null)
					System.out.print("\n Valor Encontrado");
				else
					System.out.print("\n Valor nao encontrado!");

				System.out.println("\nTempo Total( em milisegundos): " + (System.currentTimeMillis() - tempoInicio));
				break;

			}

			}
		} while (opcao != 3);
	}
}
