package br.com.hohoho.dao;

import java.math.BigDecimal;

import br.com.hohoho.modelo.Produto;

public class ProdutoDAO extends DAO<Produto> {
	public static synchronized ProdutoDAO getInstance() {
		if (instancia == null) {
			instancia = new ProdutoDAO();
		}
		return instancia;
	}

	private static ProdutoDAO instancia;

	private ProdutoDAO() {
		super(Produto.class);
		geraDados();
	}

	@Override
	void geraDados() {
		geraIdEAdiciona(new Produto("Enfeites de árvore",
				"https://images-americanas.b2w.io/produtos/01/00/item/124242/9/124242976_1GG.jpg",
				new BigDecimal(4.50)));
		geraIdEAdiciona(new Produto("Toalha de mesa quadrada 4 lugares",
				"https://images-americanas.b2w.io/produtos/01/00/item/16256/6/16256622_1GG.jpg",
				new BigDecimal(42.20)));
		geraIdEAdiciona(new Produto("Árvore de natal 1,8m + guirlanda",
				"https://images-americanas.b2w.io/produtos/01/00/item/124507/7/124507760_1GG.jpg",
				new BigDecimal(98)));
		geraIdEAdiciona(new Produto("Caneca árvore de natal cromus",
				"https://images-americanas.b2w.io/produtos/01/00/sku/9785/1/9785105_1GG.jpg",
				new BigDecimal(12)));
		geraIdEAdiciona(new Produto("Guirlanda natalina tradicional",
				"https://images-americanas.b2w.io/produtos/01/00/item/124242/9/124242976_1GG.jpg",
				new BigDecimal(56.50)));
		geraIdEAdiciona(new Produto("Pisca - pisca 100 leds",
				"https://images-americanas.b2w.io/produtos/01/00/item/8181/9/8181963_1GG.jpg",
				new BigDecimal(14.35)));
	}
}
