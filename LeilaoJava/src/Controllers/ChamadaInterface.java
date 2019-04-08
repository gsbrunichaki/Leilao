package Controllers;
import Model.Produtos;
import Model.Compradores;
import Model.Lances;
import Model.Leilao;
import Model.Vendedores;

import java.util.List;

import Controllers.ProcessamentoLeilao;

public class ChamadaInterface {
	
		ProcessamentoLeilao pl = new ProcessamentoLeilao();
	
	public void insereComprador(Compradores comprador) {
				pl.novoComprador(comprador);

	}
	
	public void insereVendedor(Vendedores vendedor) {
		pl.novoVendedor(vendedor);
	}
	
	public void insereProduto (Produtos produto) {
		pl.novoProduto(produto);
	}
	
	public void insereLance(Lances lance, int id) {
		pl.novoLance(lance, id);
	}
	
	public Lances maiorLance(int id) {
		return pl.maiorLance(id);
		
	}
	public void addLeilao(Leilao l) {
		 pl.novoLeilao(l);
	}
	public List<Compradores> returnCompradores () {
		return pl.lstCompradores();
	}
	public List<Vendedores> returnVendedores () {
		return pl.lstVendedores();
	}
	public List<Produtos> returnProdutos () {
		return pl.lstProdutos();
	}
	public List<Leilao> returnLeiloes () {
		return pl.lstLeilao();
	}
 }
