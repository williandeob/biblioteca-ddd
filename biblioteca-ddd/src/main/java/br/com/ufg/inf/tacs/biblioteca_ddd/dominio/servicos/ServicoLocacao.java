package br.com.ufg.inf.tacs.biblioteca_ddd.dominio.servicos;

import java.util.List;

import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Cliente;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Locacao;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Obra;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.interfaces.ILocacao;

public class ServicoLocacao implements ILocacao{

	public Locacao locar(List<Obra> obras, Cliente cliente) {
		return null;
	}

}
