package Model;

import java.util.ArrayList;
import java.util.List;

public class SimulaBanco {
	public List<Leilao> lstLeilao = new ArrayList<Leilao> ();
	public List<Compradores> lstCompradores  = new ArrayList<Compradores> ();
	public List<Produtos> lstProdutos = new ArrayList<Produtos> ();
	public List<Vendedores> lstVendedores = new ArrayList<Vendedores> ();
	
	public List<Leilao> getLeiloes(){
		return this.lstLeilao;
	}
	public void incluirLeilao(Leilao l) {
		this.lstLeilao.add(l);
	}
	
	public void incluirProduto(Produtos p) {
		this.lstProdutos.add(p);
	}
	
	public List<Produtos> getProdutos(){
		return this.lstProdutos;
	}
	
	public void incluirVendedor(Vendedores v) {
		this.lstVendedores.add(v);
	}
	
	public List<Vendedores> getVendedores(){
		return this.lstVendedores;
	}
	
	
	public List<Compradores> getCompradores(){
		return this.lstCompradores;
	}
	
	public void incluirComprador(Compradores c) {
		this.lstCompradores.add(c);
	}
	public void incluirLance (Lances l, int id) {
		this.returnLeilao(id).getLances().add(l);
	}
	public Leilao returnLeilao(int id) {
		List <Leilao> novoLeilao = this.lstLeilao;
		Leilao leilaoAchou = new Leilao();
		for (Leilao l : novoLeilao) {
			if (l.getId()== id) {
				leilaoAchou = l;
				break;
			}
		}
		return leilaoAchou;
	}

}
