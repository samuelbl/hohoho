package br.com.hohoho.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.component.datatable.DataTable;

import br.com.hohoho.dao.CarrinhoDAO;
import br.com.hohoho.dao.ItemComercialDAO;
import br.com.hohoho.modelo.CarrinhoCompra;
import br.com.hohoho.modelo.ItemComercial;

@ManagedBean
@ViewScoped

public class CarrinhoBean {
	FacesContext context = FacesContext.getCurrentInstance();
	private CarrinhoCompra carrinho = (CarrinhoCompra) context.getExternalContext().getSessionMap()
			.get("carrinhoCompra");	
	private Integer quantidadeSelecionada;
	 private DataTable dataTable;

	public String removerDoCarrinho() {
		FacesContext context = FacesContext.getCurrentInstance();
		String idItem = (String) context.getExternalContext().getRequestParameterMap().get("idItem");
		ItemComercial itemRemocao = ItemComercialDAO.getInstance().buscaPorId(Long.valueOf(idItem));
		if(this.quantidadeSelecionada == itemRemocao.getQuantidade()){
			CarrinhoDAO.getInstance().removeDoCarrinho(Long.valueOf(idItem), this.carrinho);
		}
		else{		
			//
		}
//		ItemComercial itemRemocao = (ItemComercial) dataTable.getRowData();
//		CarrinhoDAO.getInstance().removeDoCarrinho(itemRemocao.getId(), this.carrinho);
		return "carrinho?faces-redirect=true";
	}

	public CarrinhoCompra getCarrinho() {
		return carrinho;
	}
	
	public List<Integer> quantidadeDoItem(){
		ItemComercial itemQuantidade = (ItemComercial) dataTable.getRowData();
		List<Integer> quantidadesPossiveisDoItem = new ArrayList<>();
		for(int i=1;i<=itemQuantidade.getQuantidade();i++){
			quantidadesPossiveisDoItem.add(i);
		}
		return quantidadesPossiveisDoItem;
	}

	public void setCarrinho(CarrinhoCompra carrinho) {
		this.carrinho = carrinho;
	}

	public Integer getQuantidadeSelecionada() {
		return quantidadeSelecionada;
	}

	public void setQuantidadeSelecionada(Integer quantidadeSelecionada) {
		this.quantidadeSelecionada = quantidadeSelecionada;
	}

	public DataTable getDataTable() {
		return dataTable;
	}

	public void setDataTable(DataTable dataTable) {
		this.dataTable = dataTable;
	}

}
