package br.com.ufg.inf.tacs.biblioteca_ddd.dominio.interfaces;

import java.util.List;

import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Cliente;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Locacao;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Obra;

public interface ILocacao {
	public Locacao locar(List<Obra> obras, Cliente cliente);
}
