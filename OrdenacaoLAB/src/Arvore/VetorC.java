package Arvore;

//import java.util.Random;
import java.util.Scanner;

public class VetorC {
	private static Scanner le;

	public static void main(String args[]) {
		AvlTree t = new AvlTree();
		le = new Scanner(System.in);
		int opcao;
		System.out.print("\n Programa Arvore AVL - VETOR C");
		do {
			System.out.print("\n***********************************");
			System.out.print("\nEntre com a opcao:");
			System.out.print("\n ----1: Inserir");
			System.out.print("\n ----2: Pesquisar");
			System.out.print("\n ----3: Sair do programa");
			System.out.print("\n***********************************");
			System.out.print("\n Opcao : ");
			opcao = le.nextInt();

			switch (opcao) {
			case 1: {

				long tempoInicio = System.currentTimeMillis();

				int i;
	//			Random gerador = new Random();
				for (i = 0; i <= 10000000; i++) {
					t.insert(i);
				}

				System.out.println("\nTempo Total( em milisegundos): " + (System.currentTimeMillis() - tempoInicio));
				break;
			}

			case 2: {

				long tempoInicio = System.currentTimeMillis();
				System.out.print("\n Informe o valor (long) -> ");
				int p = (int) le.nextLong();

				if (t.search(p) != null)
					System.out.print("\n Valor Encontrado");
				else
					System.out.print("\n Valor nao encontrado!");
				System.out.println("\nTempo Total( em milisegundos): " + (System.currentTimeMillis() - tempoInicio));
			}

			}
		} while (opcao != 3);

	}
}
