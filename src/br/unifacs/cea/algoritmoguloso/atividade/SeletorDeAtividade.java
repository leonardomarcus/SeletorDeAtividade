package br.unifacs.cea.algoritmoguloso.atividade;

import java.util.List;

/**
 * Interface que define o comportamento de um Seletor de Atividade
 */
public interface SeletorDeAtividade {
	/**
	 * Seleciona um subconjunto de tamanho máximo de atividades mutuamente compatíveis 
	 * @param atividades Lista de atividades
	 * @return Subconjunto de atividades compatíveis (sem conflito de intervalo inicial e final)
	 */
	List<Atividade> selecionar(List<Atividade> atividades);
}
