package Model;

public class Vendedores {
	private String nome;
	private int idade;
	private char sexo;
	private String CPF;
	
	public Vendedores(String nome, int idade, char sexo, String cPF) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		CPF = cPF;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	} 
	
	
}
