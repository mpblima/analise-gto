package br.com.sulamerica.gto.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Historico implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private br.com.sulamerica.gto.model.Procedimento procedimento;
	private double coParticipacao;
	private java.time.LocalDate dataAuditoria;
	private java.time.LocalDate dataPagamento;
	private java.time.LocalDate ultimaAlteracao;
	private br.com.sulamerica.gto.model.Prestador prestador;
	@org.kie.api.definition.type.Label("número da GTO")
	private int gto;

	@org.kie.api.definition.type.Label(value = "Data de recepção da conta.")
	private java.time.LocalDate dataAviso;

	public Historico() {
	}

	public br.com.sulamerica.gto.model.Procedimento getProcedimento() {
		return this.procedimento;
	}

	public void setProcedimento(
			br.com.sulamerica.gto.model.Procedimento procedimento) {
		this.procedimento = procedimento;
	}

	public double getCoParticipacao() {
		return this.coParticipacao;
	}

	public void setCoParticipacao(double coParticipacao) {
		this.coParticipacao = coParticipacao;
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

	public br.com.sulamerica.gto.model.Prestador getPrestador() {
		return this.prestador;
	}

	public void setPrestador(br.com.sulamerica.gto.model.Prestador prestador) {
		this.prestador = prestador;
	}

	public int getGto() {
		return this.gto;
	}

	public void setGto(int gto) {
		this.gto = gto;
	}

	public java.time.LocalDate getDataAviso() {
		return this.dataAviso;
	}

	public void setDataAviso(java.time.LocalDate dataAviso) {
		this.dataAviso = dataAviso;
	}

	public Historico(br.com.sulamerica.gto.model.Procedimento procedimento,
			double coParticipacao, java.time.LocalDate dataAuditoria,
			java.time.LocalDate dataPagamento,
			java.time.LocalDate ultimaAlteracao,
			br.com.sulamerica.gto.model.Prestador prestador, int gto,
			java.time.LocalDate dataAviso) {
		this.procedimento = procedimento;
		this.coParticipacao = coParticipacao;
		this.dataAuditoria = dataAuditoria;
		this.dataPagamento = dataPagamento;
		this.ultimaAlteracao = ultimaAlteracao;
		this.prestador = prestador;
		this.gto = gto;
		this.dataAviso = dataAviso;
	}

}