package com.br.ms.communication.buytrip.gateway.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RetornoJson {
	
	private String mensagem;
	private String chavePesquisa;

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setChavePesquisa(String chavePesquisa) {
		this.chavePesquisa = chavePesquisa;
	}
}
