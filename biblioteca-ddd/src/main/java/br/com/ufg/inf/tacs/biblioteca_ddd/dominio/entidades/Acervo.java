package br.com.ufg.inf.tacs.biblioteca_ddd.dominio.entidades;

import java.util.ArrayList;
import java.util.List;

public class Acervo {
	private List<Obra> obras;
	
	public Acervo() {
		obras = new ArrayList<Obra>();
	}
	
	public List<Obra> getObra(){
		return obras;
	}

}
