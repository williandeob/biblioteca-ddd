package br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades;

import java.util.List;

public class Biblioteca {
	private static Biblioteca biblioteca;
	private Acervo acervo;
	private List<Funcionario> funcionarios;
	private List<Cliente> clientes;
	private String nome;
	private String cnpj;
	private Endereco endereco;
	private String telefone;
	private String email;

	private Biblioteca() {
		acervo = new Acervo();
	}
	
	public static synchronized Biblioteca getInstance() {
		if (biblioteca == null)
			biblioteca = new Biblioteca();

		return biblioteca;
	}

	public Acervo getAcervo() {
		return acervo;
	}

}
