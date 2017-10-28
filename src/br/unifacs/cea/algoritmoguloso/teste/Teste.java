package br.unifacs.cea.algoritmoguloso.teste;

import java.util.ArrayList;
import java.util.List;

import br.unifacs.cea.algoritmoguloso.atividade.Atividade;
import br.unifacs.cea.algoritmoguloso.atividade.SeletorDeAtividade;
import br.unifacs.cea.algoritmoguloso.atividade.SeletorDeAtividadeIterativo;
import br.unifacs.cea.algoritmoguloso.atividade.SeletorDeAtividadeRecursivo;

/**
 * Testando o Seletor de Atividade
 * 
 * @author Leonardo Costa
 * @author Luis Gabriel
 * 
 */
public class Teste {
	
	public static void main(String[] args) {
		
		//criando uma lista de atividades
		List<Atividade> atividades = new ArrayList<Atividade>();
		
		//adicionando as atividade do Livro "Algoritmos. Teoria e Prática" de Thomas H. Cormen
		//de forma ordenada crescente pelo tempo de termina da atividade
		atividades.add(new Atividade(1,4));
		atividades.add(new Atividade(3,5));
		atividades.add(new Atividade(0,6));
		atividades.add(new Atividade(5,7));
		atividades.add(new Atividade(3,8));
		atividades.add(new Atividade(5,9));
		atividades.add(new Atividade(6,10));
		atividades.add(new Atividade(8,11));
		atividades.add(new Atividade(8,12));
		atividades.add(new Atividade(2,13));
		atividades.add(new Atividade(12,14));
		
		System.out.println("Selecionando as atividades mutuamente compatíveis recursivamente");
		SeletorDeAtividade seletorDeAtividades = new SeletorDeAtividadeRecursivo();
		List<Atividade> atividadesSelecionadas = seletorDeAtividades.selecionar(atividades);
		for(Atividade atividade : atividadesSelecionadas) {
			System.out.println(atividade);
		}
		
		System.out.println("Selecionando as atividades mutuamente compatíveis iterativamente");
		seletorDeAtividades = new SeletorDeAtividadeIterativo();
		atividadesSelecionadas = seletorDeAtividades.selecionar(atividades);
		for(Atividade atividade : atividadesSelecionadas) {
			System.out.println(atividade);
		}
	}
}
