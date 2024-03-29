package br.com.sulamerica.gto.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Historico implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private br.com.sulamerica.gto.model.Procedimento procedimento;
	private java.time.LocalDate dataAuditoria;
	private java.time.LocalDate dataPagamento;
	private java.time.LocalDate ultimaAlteracao;
	@org.kie.api.definition.type.Label("número da GTO")
	private int gto;

	@org.kie.api.definition.type.Label("Valor contratual de franquia (pago pelo beneficiário ao prestador) ou coparticipação (descontado do beneficiário)")
	private double valorFranquiaCoparticipacao;

	@org.kie.api.definition.type.Label("Código do segurado")
	private br.com.sulamerica.gto.model.Segurado segurado;

	@org.kie.api.definition.type.Label("Código do contrato")
	private br.com.sulamerica.gto.model.Empresa empresa;

	public Historico() {
	}

	public br.com.sulamerica.gto.model.Procedimento getProcedimento() {
		return this.procedimento;
	}

	public void setProcedimento(
			br.com.sulamerica.gto.model.Procedimento procedimento) {
		this.procedimento = procedimento;
	}

	public java.time.LocalDate getDataAuditoria() {
		return this.dataAuditoria;
	}

	public void setDataAuditoria(java.time.LocalDate dataAuditoria) {
		this.dataAuditoria = dataAuditoria;
	}

	public java.time.LocalDate getDataPagamento() {
		return this.dataPagamento;
	}

	public void setDataPagamento(java.time.LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public java.time.LocalDate getUltimaAlteracao() {
		return this.ultimaAlteracao;
	}

	public void setUltimaAlteracao(java.time.LocalDate ultimaAlteracao) {
		this.ultimaAlteracao = ultimaAlteracao;
	}

	public int getGto() {
		return this.gto;
	}

	public void setGto(int gto) {
		this.gto = gto;
	}

	public double getValorFranquiaCoparticipacao() {
		return this.valorFranquiaCoparticipacao;
	}

	public void setValorFranquiaCoparticipacao(
			double valorFranquiaCoparticipacao) {
		this.valorFranquiaCoparticipacao = valorFranquiaCoparticipacao;
	}

	public br.com.sulamerica.gto.model.Segurado getSegurado() {
		return this.segurado;
	}

	public void setSegurado(br.com.sulamerica.gto.model.Segurado segurado) {
		this.segurado = segurado;
	}

	public br.com.sulamerica.gto.model.Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(br.com.sulamerica.gto.model.Empresa empresa) {
		this.empresa = empresa;
	}

	public Historico(br.com.sulamerica.gto.model.Procedimento procedimento,
			java.time.LocalDate dataAuditoria,
			java.time.LocalDate dataPagamento,
			java.time.LocalDate ultimaAlteracao, int gto,
			double valorFranquiaCoparticipacao,
			br.com.sulamerica.gto.model.Segurado segurado,
			br.com.sulamerica.gto.model.Empresa empresa) {
		this.procedimento = procedimento;
		this.dataAuditoria = dataAuditoria;
		this.dataPagamento = dataPagamento;
		this.ultimaAlteracao = ultimaAlteracao;
		this.gto = gto;
		this.valorFranquiaCoparticipacao = valorFranquiaCoparticipacao;
		this.segurado = segurado;
		this.empresa = empresa;
	}

}