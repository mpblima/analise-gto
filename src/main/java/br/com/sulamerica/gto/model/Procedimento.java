package br.com.sulamerica.gto.model;

import java.time.LocalDate;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Procedimento implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Código do procedimento")
	private java.lang.String codigoProcedimento;
	@org.kie.api.definition.type.Label("Especialidade do procedimento")
	private java.lang.String especialidade;
	@org.kie.api.definition.type.Label("Pacote do qual o procedimento faz parte")
	private java.lang.String pacote;
	@org.kie.api.definition.type.Label("Idade minima de atendimento para a faixa etaria")
	private int idadeMinima;
	@org.kie.api.definition.type.Label("Idade máxima da atendimento para a faixa etaria")
	private int idadeMaxima;
	@org.kie.api.definition.type.Label("Exige Raio X previo")
	private boolean rxPrevio;
	@org.kie.api.definition.type.Label("Exige raio x inicial")
	private boolean raioxInicial;
	@org.kie.api.definition.type.Label("Exige raio x final")
	private boolean raioxFinal;
	@org.kie.api.definition.type.Label("Auditoria administrativa")
	private boolean auditoriaAdministrativa;
	@org.kie.api.definition.type.Label("Auditoria Clinica")
	private boolean auditoriaClinica;
	@org.kie.api.definition.type.Label("Necessita laudo")
	private boolean necessitaLaudo;
	@org.kie.api.definition.type.Label("Obrigatorio digitar dente")
	private boolean denteObrigatorio;
	@org.kie.api.definition.type.Label("Obrigatorio digitar face")
	private boolean faceObrigatoria;
	@org.kie.api.definition.type.Label("Dente permanente")
	private boolean dentePermanente;
	@org.kie.api.definition.type.Label("Dente recíduo")
	private boolean denteReciduo;
	@org.kie.api.definition.type.Label("Quantidade mínima face")
	private int qtdMinimaFace;
	@org.kie.api.definition.type.Label("Quanditade máxima face")
	private int qtdMaximaFace;

	@org.kie.api.definition.type.Label("Marca se o procedimento foi analisado eletronicamente ou não")
	private boolean analisadoEletronicamente;

	@org.kie.api.definition.type.Label("Prazo máximo para reprovação do procedimento")
	private int prazoRepeticaoMeses;

	@org.kie.api.definition.type.Label("regiao da boca")
	private java.util.List<java.lang.String> regiao;

	@org.kie.api.definition.type.Label("faces do dente")
	private java.util.List<java.lang.String> listaDeFaces;

	@org.kie.api.definition.type.Label("lista de dentes")
	private java.util.List<java.lang.Integer> listaDentes;

	@org.kie.api.definition.type.Label("Lista de todos os registros de analise eletrônica")
	private java.util.List<br.com.sulamerica.gto.model.AnaliseEletronica> registrosAnaliseEletronica;

	@org.kie.api.definition.type.Label("Dente/região do procedimento realizado")
	private java.lang.String denteRegiao;

	@org.kie.api.definition.type.Label("Face do dente do procedimento realizado")
	private java.lang.String face;

	@org.kie.api.definition.type.Label("Valor do procedimento realizado")
	private double valorReais;

	@org.kie.api.definition.type.Label("Se contem imagem no procedimento realizado")
	private boolean contemImagem;

	@org.kie.api.definition.type.Label("Valor em USO")
	@org.kie.api.definition.type.Description("valor do procedimento em unidade de serviço do cadastro do procedimento")
	private double valorUso;

	@org.kie.api.definition.type.Label("Status do pagamento oriundo da auditoria eletronica.")
	private java.lang.String statusPagamento;

	@org.kie.api.definition.type.Label("Motivo do pagamento ou da glosa da auditoria eletrônica.")
	private int motivo;

	@org.kie.api.definition.type.Label("Campo 49 da GTO. Campo de texto preenchido pelo prestador")
	private java.lang.String observacaoJustificativa;

	@org.kie.api.definition.type.Label("Data de recepção da conta")
	private java.time.LocalDate dataAviso;

	@org.kie.api.definition.type.Label("Data em que o procedimento foi realizado")
	private LocalDate dataRealizacao;

	public Procedimento() {
	}

	public java.lang.String getCodigoProcedimento() {
		return this.codigoProcedimento;
	}

	public void setCodigoProcedimento(java.lang.String codigoProcedimento) {
		this.codigoProcedimento = codigoProcedimento;
	}

	public java.lang.String getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(java.lang.String especialidade) {
		this.especialidade = especialidade;
	}

	public java.lang.String getPacote() {
		return this.pacote;
	}

	public void setPacote(java.lang.String pacote) {
		this.pacote = pacote;
	}

	public int getIdadeMinima() {
		return this.idadeMinima;
	}

	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}

	public int getIdadeMaxima() {
		return this.idadeMaxima;
	}

	public void setIdadeMaxima(int idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}

	public boolean isRxPrevio() {
		return this.rxPrevio;
	}

	public void setRxPrevio(boolean rxPrevio) {
		this.rxPrevio = rxPrevio;
	}

	public boolean isRaioxInicial() {
		return this.raioxInicial;
	}

	public void setRaioxInicial(boolean raioxInicial) {
		this.raioxInicial = raioxInicial;
	}

	public boolean isRaioxFinal() {
		return this.raioxFinal;
	}

	public void setRaioxFinal(boolean raioxFinal) {
		this.raioxFinal = raioxFinal;
	}

	public boolean isAuditoriaAdministrativa() {
		return this.auditoriaAdministrativa;
	}

	public void setAuditoriaAdministrativa(boolean auditoriaAdministrativa) {
		this.auditoriaAdministrativa = auditoriaAdministrativa;
	}

	public boolean isAuditoriaClinica() {
		return this.auditoriaClinica;
	}

	public void setAuditoriaClinica(boolean auditoriaClinica) {
		this.auditoriaClinica = auditoriaClinica;
	}

	public boolean isNecessitaLaudo() {
		return this.necessitaLaudo;
	}

	public void setNecessitaLaudo(boolean necessitaLaudo) {
		this.necessitaLaudo = necessitaLaudo;
	}

	public boolean isDenteObrigatorio() {
		return this.denteObrigatorio;
	}

	public void setDenteObrigatorio(boolean denteObrigatorio) {
		this.denteObrigatorio = denteObrigatorio;
	}

	public boolean isFaceObrigatoria() {
		return this.faceObrigatoria;
	}

	public void setFaceObrigatoria(boolean faceObrigatoria) {
		this.faceObrigatoria = faceObrigatoria;
	}

	public boolean isDentePermanente() {
		return this.dentePermanente;
	}

	public void setDentePermanente(boolean dentePermanente) {
		this.dentePermanente = dentePermanente;
	}

	public boolean isDenteReciduo() {
		return this.denteReciduo;
	}

	public void setDenteReciduo(boolean denteReciduo) {
		this.denteReciduo = denteReciduo;
	}

	public int getQtdMinimaFace() {
		return this.qtdMinimaFace;
	}

	public void setQtdMinimaFace(int qtdMinimaFace) {
		this.qtdMinimaFace = qtdMinimaFace;
	}

	public int getQtdMaximaFace() {
		return this.qtdMaximaFace;
	}

	public void setQtdMaximaFace(int qtdMaximaFace) {
		this.qtdMaximaFace = qtdMaximaFace;
	}

	public boolean isAnalisadoEletronicamente() {
		return this.analisadoEletronicamente;
	}

	public void setAnalisadoEletronicamente(boolean analisadoEletronicamente) {
		this.analisadoEletronicamente = analisadoEletronicamente;
	}

	public int getPrazoRepeticaoMeses() {
		return this.prazoRepeticaoMeses;
	}

	public void setPrazoRepeticaoMeses(int prazoRepeticaoMeses) {
		this.prazoRepeticaoMeses = prazoRepeticaoMeses;
	}

	public java.util.List<java.lang.String> getRegiao() {
		return this.regiao;
	}

	public void setRegiao(java.util.List<java.lang.String> regiao) {
		this.regiao = regiao;
	}

	public java.util.List<java.lang.String> getListaDeFaces() {
		return this.listaDeFaces;
	}

	public void setListaDeFaces(java.util.List<java.lang.String> listaDeFaces) {
		this.listaDeFaces = listaDeFaces;
	}

	public java.util.List<java.lang.Integer> getListaDentes() {
		return this.listaDentes;
	}

	public void setListaDentes(java.util.List<java.lang.Integer> listaDentes) {
		this.listaDentes = listaDentes;
	}

	public java.util.List<br.com.sulamerica.gto.model.AnaliseEletronica> getRegistrosAnaliseEletronica() {
		return this.registrosAnaliseEletronica;
	}

	public void setRegistrosAnaliseEletronica(
			java.util.List<br.com.sulamerica.gto.model.AnaliseEletronica> registrosAnaliseEletronica) {
		this.registrosAnaliseEletronica = registrosAnaliseEletronica;
	}

	public java.lang.String getDenteRegiao() {
		return this.denteRegiao;
	}

	public void setDenteRegiao(java.lang.String denteRegiao) {
		this.denteRegiao = denteRegiao;
	}

	public java.lang.String getFace() {
		return this.face;
	}

	public void setFace(java.lang.String face) {
		this.face = face;
	}

	public double getValorReais() {
		return this.valorReais;
	}

	public void setValorReais(double valorReais) {
		this.valorReais = valorReais;
	}

	public boolean isContemImagem() {
		return this.contemImagem;
	}

	public void setContemImagem(boolean contemImagem) {
		this.contemImagem = contemImagem;
	}

	public double getValorUso() {
		return this.valorUso;
	}

	public void setValorUso(double valorUso) {
		this.valorUso = valorUso;
	}

	public java.lang.String getStatusPagamento() {
		return this.statusPagamento;
	}

	public void setStatusPagamento(java.lang.String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public int getMotivo() {
		return this.motivo;
	}

	public void setMotivo(int motivo) {
		this.motivo = motivo;
	}

	public java.lang.String getObservacaoJustificativa() {
		return this.observacaoJustificativa;
	}

	public void setObservacaoJustificativa(
			java.lang.String observacaoJustificativa) {
		this.observacaoJustificativa = observacaoJustificativa;
	}

	public java.time.LocalDate getDataAviso() {
		return this.dataAviso;
	}

	public void setDataAviso(java.time.LocalDate dataAviso) {
		this.dataAviso = dataAviso;
	}

	public java.time.LocalDate getDataRealizacao() {
		return this.dataRealizacao;
	}

	public void setDataRealizacao(java.time.LocalDate dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}
	
	public void addAnalise(br.com.sulamerica.gto.model.AnaliseEletronica analise){
	    if(){
	        
	    }
	    
	}

	public Procedimento(
			java.lang.String codigoProcedimento,
			java.lang.String especialidade,
			java.lang.String pacote,
			int idadeMinima,
			int idadeMaxima,
			boolean rxPrevio,
			boolean raioxInicial,
			boolean raioxFinal,
			boolean auditoriaAdministrativa,
			boolean auditoriaClinica,
			boolean necessitaLaudo,
			boolean denteObrigatorio,
			boolean faceObrigatoria,
			boolean dentePermanente,
			boolean denteReciduo,
			int qtdMinimaFace,
			int qtdMaximaFace,
			boolean analisadoEletronicamente,
			int prazoRepeticaoMeses,
			java.util.List<java.lang.String> regiao,
			java.util.List<java.lang.String> listaDeFaces,
			java.util.List<java.lang.Integer> listaDentes,
			java.util.List<br.com.sulamerica.gto.model.AnaliseEletronica> registrosAnaliseEletronica,
			java.lang.String denteRegiao, java.lang.String face,
			double valorReais, boolean contemImagem, double valorUso,
			java.lang.String statusPagamento, int motivo,
			java.lang.String observacaoJustificativa,
			java.time.LocalDate dataAviso, java.time.LocalDate dataRealizacao) {
		this.codigoProcedimento = codigoProcedimento;
		this.especialidade = especialidade;
		this.pacote = pacote;
		this.idadeMinima = idadeMinima;
		this.idadeMaxima = idadeMaxima;
		this.rxPrevio = rxPrevio;
		this.raioxInicial = raioxInicial;
		this.raioxFinal = raioxFinal;
		this.auditoriaAdministrativa = auditoriaAdministrativa;
		this.auditoriaClinica = auditoriaClinica;
		this.necessitaLaudo = necessitaLaudo;
		this.denteObrigatorio = denteObrigatorio;
		this.faceObrigatoria = faceObrigatoria;
		this.dentePermanente = dentePermanente;
		this.denteReciduo = denteReciduo;
		this.qtdMinimaFace = qtdMinimaFace;
		this.qtdMaximaFace = qtdMaximaFace;
		this.analisadoEletronicamente = analisadoEletronicamente;
		this.prazoRepeticaoMeses = prazoRepeticaoMeses;
		this.regiao = regiao;
		this.listaDeFaces = listaDeFaces;
		this.listaDentes = listaDentes;
		this.registrosAnaliseEletronica = registrosAnaliseEletronica;
		this.denteRegiao = denteRegiao;
		this.face = face;
		this.valorReais = valorReais;
		this.contemImagem = contemImagem;
		this.valorUso = valorUso;
		this.statusPagamento = statusPagamento;
		this.motivo = motivo;
		this.observacaoJustificativa = observacaoJustificativa;
		this.dataAviso = dataAviso;
		this.dataRealizacao = dataRealizacao;
	}

}