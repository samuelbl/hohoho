package br.com.hohoho.dao;


import java.math.BigDecimal;

import br.com.hohoho.modelo.CarrinhoCompra;
import br.com.hohoho.modelo.ItemComercial;

public class CarrinhoDAO extends DAO<CarrinhoCompra> {
	public static synchronized CarrinhoDAO getInstance() {
		if (instancia == null) {
			instancia = new CarrinhoDAO();
		}
		return instancia;
	}

	private static CarrinhoDAO instancia;
	
	
	
	private CarrinhoDAO() {
		super(CarrinhoCompra.class);
		geraDados();
	}
	
	public void atualizaCarrinhoEtotal(CarrinhoCompra carrinho) {
		BigDecimal total = new BigDecimal(0);
		for (ItemComercial item : carrinho.getItens()) {
			 total = total.add(item.getTotal());
		}
		carrinho.setTotal(total);
		super.atualiza(carrinho);
	}
	
	public void removeDoCarrinho(Long itemId, CarrinhoCompra carrinho){
		BigDecimal total = carrinho.getTotal();	
		for (int i =0; i< carrinho.getItens().size();i++){
			ItemComercial itemCarrinho = carrinho.getItens().get(i);
			if(itemCarrinho.getId().equals(itemId)){
				total = total.subtract(itemCarrinho.getTotal());
				carrinho.getItens().remove(itemCarrinho);
				carrinho.setTotal(total);
			}
		}
		super.atualiza(carrinho);
	}
		/*
	    pessoas.add(new Pessoa("José"));
	    pessoas.add(new Pessoa("Maria"));
	    pessoas.add(new Pessoa("Pedro"));

	    System.out.print("Pessoas cadastradas:\n");
	    for(int i = 0; i < pessoas.size(); i++)
	    {
	        System.out.print(pessoas.get(i).getNome() + "\n");
	    }

	    // Removendo Pedro:
	    for(int i = 0; i < pessoas.size(); i++)
	    {
	        Pessoa p = pessoas.get(i);

	        if(p.getNome().equals("Pedro"))
	        {
	            // Encontrou uma pessoa cadastrada com nome "Pedro".

	            // Remove.
	            pessoas.remove(p);

	            // Sai do loop.
	            break;
	        }
	    } */
	
	


		
	@Override
	void geraDados() {
		// TODO Auto-generated method stub
		
	}

}
