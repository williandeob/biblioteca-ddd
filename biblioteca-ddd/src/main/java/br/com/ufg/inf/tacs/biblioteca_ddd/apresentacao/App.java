package br.com.ufg.inf.tacs.biblioteca_ddd.apresentacao;

import java.util.ArrayList;
import java.util.List;

import br.com.ufg.inf.tacs.biblioteca_ddd.aplicacao.interfaces.IAppLocacao;
import br.com.ufg.inf.tacs.biblioteca_ddd.aplicacao.servicos.ServicoAppLocacao;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Cd;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Cliente;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Livro;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Locacao;
import br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades.Obra;

public class App 
{
    public static void main( String[] args )
    {
        IAppLocacao app = new ServicoAppLocacao();
        Obra comerRezarEAmar = new Livro();
        Obra backInBlack = new Cd();
        List<Obra> obras = new ArrayList<Obra>();
        obras.add(comerRezarEAmar);
        obras.add(backInBlack);
        Cliente joao = new Cliente();
		
        Locacao locacao = app.locar(obras, joao);
        if(app.confirmarLocacao(locacao))
        	System.out.println("locação realizada com sucesso!");
    }
}
