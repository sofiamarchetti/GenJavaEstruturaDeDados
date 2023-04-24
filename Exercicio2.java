package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int op = 0;
		Scanner leia = new Scanner(System.in);
			
		Stack<String> pilha = new Stack<String>();
				
		do {			
			System.out.println("\n\t\tSUA PILHA DE LIVROS");
			System.out.println("\n(1) Adicionar livro na pilha");
			System.out.println("\n(2) Listar todos os livros");
			System.out.println("\n(3) Retirar livro da pilha");
			System.out.println("\n(0) Sair");
			System.out.println("\nEntre com a opção desejada: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do livro: ");
				String nome = leia.nextLine();
				System.out.println("\nLivro adicionado.");
				pilha.push(nome);
				break;
				
			case 2:
				leia.nextLine();							
				if(pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia!");					
				}else {
					System.out.println("\nPilha de livros: "+pilha);
				}
				break;
				
			case 3: 
				leia.nextLine();								
				if(pilha.isEmpty()) {
					System.out.println("\nA pilha esta vazia!");					
				}else {
					System.out.println("\nPróximo livro: "+pilha.pop());
				}
				break;
							
			case 0:
				System.out.println("\nPrograma finalizado.");
				break;
				
				default:
					System.out.println("\nOpção inválida!!!");				
			}
			
		}while(op != 0);
	}
}