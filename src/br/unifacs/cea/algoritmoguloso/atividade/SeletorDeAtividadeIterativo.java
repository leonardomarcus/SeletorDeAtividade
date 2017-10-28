package br.unifacs.cea.algoritmoguloso.atividade;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação do algoritmo guloso iterativo seletor de atividade
 * 
 * @author Leonardo Costa
 * @author Luis Gabriel
 */
public class SeletorDeAtividadeIterativo implements SeletorDeAtividade {

	@Override
	public List<Atividade> selecionar(List<Atividade> atividades) {
		//caso receba uma lista vazia, retorna uma lista vazia
		if(atividades.isEmpty())
			return new ArrayList<Atividade>();
		
		int n = atividades.size()-1; //pegando o índice do ultimo elemento da lista
		List<Atividade> atividadesSelecionadas = new ArrayList<Atividade>(); //criando uma lista de atividades selecionadas
		atividadesSelecionadas.add(atividades.get(0)); //adiciona logo o primeiro item na lista
		int i = 0; //partindo do primeiro item da lista como referencia
		for(int m = 1; m <= n; m++) { //percorre todas as atividades da lista começando da segunda
			//se a proxima atividade tem o início maior ou igual ao final da atividade referencia
			if(atividades.get(m).getInicio() >= atividades.get(i).getFim()) {
				atividadesSelecionadas.add(atividades.get(m)); //adicionamos a próxima atividade na lista de retorno
				i = m; //a atividade referência passa a ser a próxima
			}
		}
		return atividadesSelecionadas;
	}

}
