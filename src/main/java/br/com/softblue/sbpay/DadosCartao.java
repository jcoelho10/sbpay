package br.com.softblue.sbpay;

import javax.validation.constraints.Pattern;

/**
 * 
 * @author josen
 * 
 * Classe para Agrupar Dados do Cartão de Crédito
 *
 */
public class DadosCartao {

	@Pattern(regexp = "\\d{16}", message = "O número do cartão é inválido")
	private String numCartao;
	
	public String getNumCartao() {
		return numCartao;
	}
	
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
}
