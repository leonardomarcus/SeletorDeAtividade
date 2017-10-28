package br.unifacs.cea.algoritmoguloso.atividade;

/**
 * Classe que define uma atividade 
 */
public class Atividade {
	private int inicio;
	private int fim;
	
	/**
	 * Construtor que gera a instância de uma Atividade
	 * @param inicio Início da atividade 
	 * @param fim Final da atividade
	 */
	public Atividade(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}
	public int getInicio() {
		return inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	public int getFim() {
		return fim;
	}
	public void setFim(int fim) {
		this.fim = fim;
	}
	@Override
	public String toString() {
		return "Atividade [inicio=" + inicio + ", fim=" + fim + "]";
	}
	
}
