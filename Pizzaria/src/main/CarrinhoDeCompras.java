package main;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	List<Pizza> produtos;
	
	public CarrinhoDeCompras() { 
		produtos = new ArrayList<Pizza>();		
	}
	
	public void adicionaPizza(Pizza pizza) {
		if (pizza.comIgredientes()) { 
			produtos.add(pizza);
		}
	}

	public Integer valorTotalCarrinho () {
		Integer totalPizza = 0;
		for (Pizza pizza: produtos) {
			totalPizza += pizza.getPreco();
		}
		return totalPizza;
	}
		
}
