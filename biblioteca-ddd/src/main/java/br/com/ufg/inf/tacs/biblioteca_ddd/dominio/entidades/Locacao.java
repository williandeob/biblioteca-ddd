package br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades;

import java.util.Date;
import java.util.List;

public class Locacao {
	private Cliente cliente;
	private List<Obra> obras;
	private float valorTotal;
	private Date dataLocacao;
	private Date dataDevolucao;
}
