package br.com.hohoho.modelo;

import java.math.BigDecimal;

import br.com.hohoho.dao.ProdutoDAO;



public class ItemComercial extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String idProduto;
	private int quantidade;
	private BigDecimal total;
	 private Integer quantidadeSelecionadaRemocao;

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
	
	public Produto getProduto(){
		return ProdutoDAO.getInstance().buscaPorId(Long.valueOf(this.idProduto));
	}

	public Integer getQuantidadeSelecionadaRemocao() {
		return quantidadeSelecionadaRemocao;
	}

	public void setQuantidadeSelecionadaRemocao(Integer quantidadeSelecionadaRemocao) {
		this.quantidadeSelecionadaRemocao = quantidadeSelecionadaRemocao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemComercial other = (ItemComercial) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	


}
