package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int op = 0;
		Scanner ler = new Scanner(System.in);
				
		Queue<String> fila = new LinkedList<String>();
					
		do {			
			System.out.println("\n*************** ");
			System.out.println("\n(1) Adicionar cliente na fila");
			System.out.println("\n(2) Listar todos os clientes na fila");
			System.out.println("\n(3) Retirar cliente da fila");
			System.out.println("\n(0) Sair");
			System.out.println("\nEntre com a opção desejada: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o nome do cliente: ");
				String nome = ler.nextLine();
				System.out.println("\nCliente adicionado.");
				fila.add(nome);
				break;
				
			case 2:
				ler.nextLine();							
				if(fila.isEmpty()) {
					System.out.println("\nA fila esta vazia!");				
				}else {
					System.out.println("\nLista de clientes na fila: "+fila);
				}
				break;
				
			case 3: 
				ler.nextLine();								
				if(fila.isEmpty()) {
					System.out.println("\nA fila esta vazia!");					
				}else {
					System.out.println("\nPróximo cliente: "+fila.poll());
				}
				break;
							
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;				
				
			default:
					System.out.println("\nOpção inválida!!!");				
			}
			
		}while(op != 0);	
	}
}