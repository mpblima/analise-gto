package br.com.sulamerica.gto.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Procedimento implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Código do procedimento")
	private java.lang.String codigoProcedimento;
	@org.kie.api.definition.type.Label("Especialidade do procedimento")
	private java.lang.String especialidade;
	@org.kie.api.definition.type.Label("Valor em reais")
	private double valor;
	@org.kie.api.definition.type.Label("Pacote do qual o procedimento faz parte")
	private java.lang.String pacote;
	@org.kie.api.definition.type.Label("Prazo para repetição")
	private int prazoRepeticao;
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
	@org.kie.api.definition.type.Label("Obrigatorio digitar dent,e")
	private boolean denteObrigatorio;
	@org.kie.api.definition.type.Label("Obrigatorio digitar face")
	private boolean faceObrigatoria;
	@org.kie.api.definition.type.Label("Dente permanente")
	private boolean dentePermanente;
	@org.kie.api.definition.type.Label("Dente recíduo")
	private boolean denteReciduo;
	@org.kie.api.definition.type.Label("Região da boca")
	private java.lang.String regiao;
	@org.kie.api.definition.type.Label("Quantidade mínima face")
	private int qtdMinimaFace;
	@org.kie.api.definition.type.Label("Quanditade máxima face")
	private int qtdMaximaFace;

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

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public java.lang.String getPacote() {
		return this.pacote;
	}

	public void setPacote(java.lang.String pacote) {
		this.pacote = pacote;
	}

	public int getPrazoRepeticao() {
		return this.prazoRepeticao;
	}

	public void setPrazoRepeticao(int prazoRepeticao) {
		this.prazoRepeticao = prazoRepeticao;
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

	public java.lang.String getRegiao() {
		return this.regiao;
	}

	public void setRegiao(java.lang.String regiao) {
		this.regiao = regiao;
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

	public Procedimento(java.lang.String codigoProcedimento,
			java.lang.String especialidade, double valor,
			java.lang.String pacote, int prazoRepeticao, int idadeMinima,
			int idadeMaxima, boolean rxPrevio, boolean raioxInicial,
			boolean raioxFinal, boolean auditoriaAdministrativa,
			boolean auditoriaClinica, boolean necessitaLaudo,
			boolean denteObrigatorio, boolean faceObrigatoria,
			boolean dentePermanente, boolean denteReciduo,
			java.lang.String regiao, int qtdMinimaFace, int qtdMaximaFace) {
		this.codigoProcedimento = codigoProcedimento;
		this.especialidade = especialidade;
		this.valor = valor;
		this.pacote = pacote;
		this.prazoRepeticao = prazoRepeticao;
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
		this.regiao = regiao;
		this.qtdMinimaFace = qtdMinimaFace;
		this.qtdMaximaFace = qtdMaximaFace;
	}

}