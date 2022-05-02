package br.com.tiago.java.io.model;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 5842043062579813836L;
	
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNomeCpfProfissao() {
		return "Nome: " + nome + " CPF: " + cpf + " Profissao: " + profissao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
