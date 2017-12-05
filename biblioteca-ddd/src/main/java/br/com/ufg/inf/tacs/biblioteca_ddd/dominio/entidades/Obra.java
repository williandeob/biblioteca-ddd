package br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades;

import java.util.Date;

public abstract class Obra {
	private long codigo;
	private String nome;
	private Date dataDeLancamento;
	private Date dataDeAquisicao;
	private boolean locado;
	private Estande estande;
	private float valorDeLocacaoPorDia;
	
	public String getNome() {
		return nome;
	}
	
	public boolean isLocado() {
		return locado;
	}
	
}
