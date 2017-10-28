package br.unifacs.cea.algoritmoguloso.atividade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Implementa��o do algoritmo guloso recursivo seletor de atividade 
 * 
 * @author Leonardo Costa
 * @author Luis Gabriel
 *
 */
public class SeletorDeAtividadeRecursivo implements SeletorDeAtividade {

	@Override
	public List<Atividade> selecionar(List<Atividade> atividades) {
		atividades = new ArrayList<Atividade>(atividades);
		atividades.add(0, new Atividade(0,0)); //tendo como referência uma atividade com início e fim zerados
		List<Atividade> atividadesSelecionadas = selecionarAtividadeRecursivamente(atividades, 0, atividades.size()-1);
		Collections.reverse(atividadesSelecionadas);
		return atividadesSelecionadas;
	}
	
	/**
	 * 
	 * @param atividades Lista de atividades
	 * @param i Índice atual da atividade em execução
	 * @param j Índice da última atividade da lista
	 * @return Retorna uma lista invertida de atividades selecionadas mutuamente compatíveis 
	 */
	private List<Atividade> selecionarAtividadeRecursivamente(List<Atividade> atividades, int i, int j) {
		int m = i + 1; //apontando para a proxima atividade para comparar com a atual		
		//selecionando a proxima atividade que o in�cio seja >= que o fim da atual
		while (m < j && (atividades.get(m).getInicio() < atividades.get(i).getFim())) {
		    m++;
		}		
		if(m <= j) {
			List<Atividade> atividadesSelecionadas = selecionarAtividadeRecursivamente(atividades, m, j);
			atividadesSelecionadas.add(atividades.get(m));
			return atividadesSelecionadas;
		}
		else {
			//condição de parada: percorremos a lista toda
			return new ArrayList<Atividade>();
		}
	}
	
}
