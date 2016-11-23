package br.com.hohoho.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.hohoho.dao.CarrinhoDAO;
import br.com.hohoho.dao.ProdutoDAO;
import br.com.hohoho.modelo.CarrinhoCompra;
import br.com.hohoho.modelo.Produto;

@ManagedBean
@ViewScoped

public class CarrinhoBean {
	FacesContext context = FacesContext.getCurrentInstance();
	private CarrinhoCompra carrinho = (CarrinhoCompra) context.getExternalContext().getSessionMap().get("carrinhoCompra");
	
	
		
	public Produto ObterProdutoCarrinho(){
		Produto produto = ProdutoDAO.getInstance().buscaPorId(Long.valueOf(this.getCarrinho().getId()));
		return produto;
		
	}
	
	public String removerDoCarrinho(){
		FacesContext context = FacesContext.getCurrentInstance();
		String idItem = (String)context.getExternalContext().getRequestParameterMap().get("idItem");
		CarrinhoDAO.getInstance().removeDoCarrinho(Long.valueOf(idItem), this.carrinho);
		return "carrinho?faces-redirect=true";
		
	}

	public CarrinhoCompra getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(CarrinhoCompra carrinho) {
		this.carrinho = carrinho;
	}

}
