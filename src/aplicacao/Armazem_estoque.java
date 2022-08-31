package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Produtos;

public class Armazem_estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner esc = new Scanner(System.in);
 
	                      //leitura dos dados dos produtos do estoque
		
		Produtos produto = new Produtos();
		System.out.println("Qual produto procura no estoque? ");
		System.out.print("Nome: ");
		produto.nome = esc.nextLine();
		System.out.printf("Valor R$ ");
		produto.preco = esc.nextDouble();
		System.out.print("Quantidade de produto no estoque: ");
		System.out.println();
		produto.quantidade = esc.nextInt();

		System.out.println("Produto: " + produto.nome + "," + "\nValor em produto: " + "R$" + produto.preco + ","
				+ "\nQuantidade em estoque: " + produto.quantidade);

		esc.close();
	}

}
