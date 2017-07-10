package main;

public class Principal {
	
	public static void main (String args[]){
		Pizza calabresa = new Pizza("calabresa","queijo");
		Pizza bacon = new Pizza("bacon","queijo","cebola");
		Pizza portuguesa = new Pizza("azeitona","queijo","cebola","pimentao","ovo","alho");
		
		CarrinhoDeCompras carrinhoPizza = new CarrinhoDeCompras();
		carrinhoPizza.adicionaPizza(calabresa);
		carrinhoPizza.adicionaPizza(bacon);
		carrinhoPizza.adicionaPizza(portuguesa);
		
		System.out.println("Total das Compras: R$ "+carrinhoPizza.valorTotalCarrinho());
		calabresa.imprimeIngredientes();
	}
}
