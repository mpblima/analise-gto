package br.com.sulamerica.gto.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Usuario implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Nome do usuario")
	private java.lang.String nome;
	@org.kie.api.definition.type.Label(value = "Estado do usuario")
	private java.lang.String estado;

	public Usuario() {
	}

	public java.lang.String getNome() {
		return this.nome;
	}

	public void setNome(java.lang.String nome) {
		this.nome = nome;
	}

	public java.lang.String getEstado() {
		return this.estado;
	}

	public void setEstado(java.lang.String estado) {
		this.estado = estado;
	}

	public Usuario(java.lang.String nome, java.lang.String estado) {
		this.nome = nome;
		this.estado = estado;
	}

}