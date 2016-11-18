package br.com.hohoho.modelo;

import java.math.BigDecimal;



public class ItemComercial extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String idProduto;
	private int quantidade;
	private BigDecimal total;

	public ItemComercial(String idProduto, int quantidade){
		this.idProduto = idProduto;
		this.quantidade = quantidade;
	}
	
	public ItemComercial(){
		this("",0);
	}
	
	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return this.id;
	}
	
	public Long getLongIdProduto() {
		return Long.valueOf(this.idProduto);
	}
	
	


}
