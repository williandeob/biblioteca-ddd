package br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades;

import java.util.List;

public class Livro extends Obra{
	private Editora editora;
	private List<Autor> autores;
	private int volume;
	private EstiloLiterario estilo;
	public Livro() {
		// TODO Auto-generated constructor stub
	}

}
