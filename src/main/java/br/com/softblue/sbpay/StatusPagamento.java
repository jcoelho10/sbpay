package br.com.softblue.sbpay;

/**
 * 
 * @author josen
 * 
 * Enum que mostra a situação da transação 
 * utilizando Status de Pagamento
 *
 */

public enum StatusPagamento {

	Autorizado("Autorizado"),
	NaoAutorizado("Não autorizado pela instituição financeira"),
	CartaoInvalido("Cartão inválido ou bloqueado");
	
	String descricao;
	
	private StatusPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
