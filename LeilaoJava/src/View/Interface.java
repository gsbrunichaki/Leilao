package View;
import java.util.Scanner;
import Model.Compradores;
import Model.Lances;
public class Interface {
	public static void  main (String [] args) {
		Scanner in = new Scanner  (System.in);
		
		int opcoes = -1;
		
		System.out.println("BEM-VINDO(A) AO LEILÃO!\n");
		System.out.println("O que você deseja fazer?\n");
		System.out.println("1 - Me cadastrar como vendedor");
		System.out.println("2 - Me cadastrar como comprador");
		System.out.println("0 - Sair\n");
		
		System.out.println("Escolha uma opção: ");
		
		switch (in.nextInt()) {
		case 1:
			System.out.println("\n# CADSTRO DE VENDEDOR #\n");
			System.out.println("Nome: \"Guilherme Draghetti\"");
			System.out.println("Idade: 19");
			System.out.println("Sexo: 'm'");
			System.out.println("CPF: \"02456465465\"\n");
			
			// inserir vendedor no banco
			
			System.out.println("Vendedor cadastrado com sucesso!");
			
			// seguir com opções de vendedor (leiloar produto ou receber dinheiro)
			
			break;
		case 2:
			System.out.println("\n# CADSTRO DE COMPRADOR #\n");
			System.out.println("Nome: \"Marcelo Bernardy\"");
			System.out.println("Idade: 21");
			System.out.println("Sexo: 'm'");
			System.out.println("CPF: \"26584698532\"\n");
			
			// inserir comprador no banco
			
			System.out.println("Comprador cadastrado com sucesso!");
			
			// seguir com opções de vendedor (selecionar um produto e dar um lance)
			break;
		default:
			System.out.println("ATÉ MAIS!");
			break;
		}
		
//		while(opcoes != 0) {
//			System.out.println("Insira nome, idade, sexo e CPF:  ");
//			Compradores p1 = new Compradores("Guilherme", 19, 'm', "02456465465");
//				
//			System.out.println("Insira seu lance: ");
//			Lances l1 = new Lances(p1, 260.8);
//				
//			System.out.println("Vc deseja sair - digite 0");
//			opcoes = in.nextInt();
//		}
	}
}