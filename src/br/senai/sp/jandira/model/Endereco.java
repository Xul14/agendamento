package br.senai.sp.jandira.model;

public class Endereco {

	private String logradouro;
	private String cidade;
	private String bairro;
	private String numero;
	private String cep;
	private String complemento;
	private String estado;

	public void setlogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getlogradouro() {
		return logradouro;
	}

	public void setcidade(String cidade) {
		this.cidade = cidade;
	}

	public String getcidade() {
		return cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
