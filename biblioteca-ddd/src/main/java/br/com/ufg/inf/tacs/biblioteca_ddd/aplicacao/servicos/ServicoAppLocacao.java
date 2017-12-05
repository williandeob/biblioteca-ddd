package br.com.ufg.inf.tacs.biblioteca_ddd.aplicacao.servicos;

import java.util.List;

import br.com.ufg.inf.tacs.biblioteca_ddd.aplicacao.interfaces.IAppLocacao;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Cliente;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Locacao;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Obra;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.interfaces.IInfraLocacao;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.interfaces.ILocacao;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.servicos.ServicoLocacao;
import br.com.ufg.inf.tacs.biblioteca_ddd.infra.InfraLocacao;

public class ServicoAppLocacao implements IAppLocacao {

	public Locacao locar(List<Obra> obras, Cliente cliente) {
		ILocacao servicoLocacao = new ServicoLocacao();
		return servicoLocacao.locar(obras, cliente);
	}

	public boolean confirmarLocacao(Locacao locacao) {
		IInfraLocacao infra = new InfraLocacao();
		infra.save(locacao);
		return true;
	}

}
