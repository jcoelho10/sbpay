package br.com.softblue.sbpay;

import javax.validation.constraints.Pattern;

/**
 * 
 * @author josen
 * 
 * Classe para Agrupar Dados do Cart�o de Cr�dito
 *
 */
public class DadosCartao {

	@Pattern(regexp = "\\d{16}", message = "O n�mero do cart�o � inv�lido")
	private String numCartao;
	
	public String getNumCartao() {
		return numCartao;
	}
	
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
}
