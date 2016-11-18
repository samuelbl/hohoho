package br.com.hohoho.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
	private ArrayList <ItemComercial> itens = new ArrayList<>();
	private BigDecimal total;

	

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public CarrinhoCompra(BigDecimal total) {
		this.total = total;
	}
	
	public CarrinhoCompra() {
		this(new BigDecimal(0.0));
	}
	
	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public List <ItemComercial> getItens() {
		return itens;
	}

	public void setItens(ItemComercial item) {
		this.itens.add(item);
	}

}
