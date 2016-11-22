package br.com.hohoho.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.hohoho.modelo.Produto;

@ManagedBean
@ViewScoped
public class LojaBean {
	Produto produto = new Produto();

	public Produto getProduto() {
		return produto;
	}

	

}
