package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Model.Compradores;
import Model.Lances;
import Model.Leilao;
import Model.Produtos;
import Model.Vendedores;
import Controllers.ChamadaInterface;

public class Interface {
	public static void main(String[] args) {
		ChamadaInterface ci = new ChamadaInterface();
		

		menu(ci);
		}
	public static void menu(ChamadaInterface ci) {
		
		Scanner in = new Scanner(System.in);

		int opcoes = -1;
		System.out.println("\n\n\n\nBEM-VINDO(A) AO LEILÃO!\n");
		System.out.println("O que você deseja fazer?\n");
		System.out.println("1 - Me cadastrar como vendedor");
		System.out.println("2 - Me cadastrar como comprador");
		System.out.println("3 - Ganhadores do leilão");
		System.out.println("0 - Sair\n");

		System.out.println("Escolha uma opção: ");

		switch (in.nextInt()) {
		case 1:
			System.out.println("\n# CADASTRO DE VENDEDOR #\n");
			String nome = "Guilherme";
			System.out.println("Nome: " + nome);
			int idade = 19;
			System.out.println("Idade: " + idade);
			char sexo = 'm';
			System.out.println("Sexo:" + sexo);
			String CPF = "02456465465";
			System.out.println("CPF: " + CPF + "\n");

			// inserir vendedor no banco
			Vendedores v1 = new Vendedores (nome, idade, sexo, CPF);
			ci.insereVendedor(v1);

			System.out.println("Vendedor cadastrado com sucesso!");

			// seguir com opções de vendedor (leiloar produto ou receber dinheiro)
			System.out.println("CADASTRAR PRODUTO:");
			String nomeProd = "Ferrari";
			System.out.println("Nome do produto:");
			String catProd = "Carro";
			System.out.println("Categoria do produto:");
			double preco = 20000000;
			System.out.println("Preço Inicial:");
			
			//inserir Produto
			Produtos p1 = new Produtos(nomeProd, catProd, preco, v1);
			ci.insereProduto(p1);
			menu(ci);
			
			List<Lances> lstLances= new ArrayList<Lances>();
			Leilao l = new Leilao(1, p1, false, lstLances);
			ci.addLeilao(l);
			break;
		case 2:
			System.out.println("\n# CADSTRO DE COMPRADOR #\n");
			String nome1 = "Marcelo Bernardy";
			System.out.println("Nome: " + nome1);
			int idade1 = 21;
			System.out.println("Idade:" + idade1);
			char sexo1 = 'm';
			System.out.println("Sexo: " + sexo1);
			String CPF1 = "26584698532";
			System.out.println("CPF:" + CPF1 + "\n");

			// inserir comprador no banco
			Compradores c1 = new Compradores (nome1, idade1, sexo1, CPF1);
			List<Compradores> lstComp = ci.insereComprador(c1);
			
			System.out.println("Lista de todos os compradores");
			 for (Compradores c : lstComp) {
				System.out.println("Nome: " + c.getNome());
			}
				
			System.out.println("Comprador cadastrado com sucesso!");

			// seguir com opções de comprador (selecionar um produto e dar um lance)
			System.out.println("Insira o valor de seu lance: ");
			double lance = 10.0;
			Lances l1 = new Lances (c1, lance);
			ci.insereLance(l1, 1);
			menu(ci);
			break;
			
		case 3: 
			System.out.println("Insira o id do leilão");
			int id = 1;
			System.out.println("Maior Lance: " + ci.maiorLance(id));
			menu(ci);
			break;
		case 4:
			List<Leilao> lstLeilao = ci.returnLeiloes();
			
			System.out.println("Lista de todos os leilões");
			 for (Leilao le : lstLeilao) {
				System.out.println("Id leilão: " + le.getId());
			}
			menu(ci);
			break;
		default:
			System.out.println("ATÉ MAIS!");
			break;	
	}

	}
	
}