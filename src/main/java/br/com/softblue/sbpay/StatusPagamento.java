package br.com.softblue.sbpay;

/**
 * 
 * @author josen
 * 
 * Enum que mostra a situa��o da transa��o 
 * utilizando Status de Pagamento
 *
 */

public enum StatusPagamento {

	Autorizado("Autorizado"),
	NaoAutorizado("N�o autorizado pela institui��o financeira"),
	CartaoInvalido("Cart�o inv�lido ou bloqueado");
	
	String descricao;
	
	private StatusPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
