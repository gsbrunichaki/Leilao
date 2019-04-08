package Controllers;

import java.util.List;

import Model.Compradores;
import Model.Lances;
import Model.Leilao;
import Model.Produtos;
import Model.SimulaBanco;
import Model.Vendedores;

public class ProcessamentoLeilao {
	SimulaBanco smlBanco = new SimulaBanco();

	public Lances maiorLance(int id) {
		Lances maior = null;
		for (int i = 0; i < smlBanco.returnLeilao(id).getLances().size(); i++) {
			if (smlBanco.returnLeilao(id).getLances().get(i).getValor() > maior.getValor()) {
				maior = smlBanco.returnLeilao(id).getLances().get(i);
			}
		}
		
		return maior;
	}
	
	public List<Leilao> lstLeilao(){
		return smlBanco.getLeiloes();
	}
	
	public List<Compradores> lstCompradores(){
		return smlBanco.getCompradores();
	}
	
	public void novoLeilao(Leilao l) {
		//RNs
		this.smlBanco.incluirLeilao(l);
	}
	
	public List<Compradores> novoComprador(Compradores c) {
		//RNs -  não pode ser menor que 0
		//chama model e inclui no banco
		return this.smlBanco.incluirComprador(c);
		
	}
	
	
	public void novoProduto(Produtos p) {
		//RNs
		this.smlBanco.incluirProduto(p);
	}
	public void novoLance (Lances l, int id) {
		this.smlBanco.incluirLance(l, id);
	}
	
	
	public List<Produtos> lstProdutos(){
		return smlBanco.getProdutos();
	}
	
	public void novoVendedor(Vendedores v) {
		//RNs
		this.smlBanco.incluirVendedor(v);
	}
	
	public List<Vendedores> lstVendedores(){
		return smlBanco.getVendedores();
	}
	
}
