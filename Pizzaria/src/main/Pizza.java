package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
	
	private static Map<String,Integer> ingredientesPizzaGeral = new HashMap<String,Integer>(); 	
	private List<String> ingredientesPizza;
	
	
	public static Map<String,Integer> getIngredientes() { 
		return ingredientesPizzaGeral;
	}
	
	public boolean semIgredientes() { 
		return ingredientesPizza.size()<1;				
	}
	
	public boolean comIgredientes() { 
		return ingredientesPizza.size()>0;				
	}
	
	public Pizza(String ... ingrediente) {
		if (ingrediente.length==0) throw new IllegalArgumentException("A pizza precisa ter ao menos um ingrediente!");
		
		ingredientesPizza = new ArrayList<String>();
		for (int index=0;index<ingrediente.length;index++) {
			adicionaIngrediente(ingrediente[index]);
		}
	}
	
	public void adicionaIngrediente(String ingrediente) {
		contabilizaIngrediente(ingrediente);
		ingredientesPizza.add(ingrediente);
	}
	
	public Integer contabilizaIngrediente(String ingrediente) {
		Integer total = 0;
		if (ingredientesPizzaGeral.get(ingrediente)!=null)
			total = ingredientesPizzaGeral.get(ingrediente);
		total++;
		
		ingredientesPizzaGeral.put(ingrediente,total);
		return total;
	}
	
	
	public int getPreco() { 
		int preco = 0 ;
		if (ingredientesPizza.size()<=2) preco = 15;
		if (ingredientesPizza.size()>2&&ingredientesPizza.size()<=5) preco = 20;
		if (ingredientesPizza.size()>5) preco = 25;		
		return preco;
	}
	
	public void imprimeIngredientes(){
		System.out.println("---------------------------------------");
		System.out.println("-------------INGREDIENTES--------------");
		System.out.println("---------------------------------------");
		for (String key: ingredientesPizzaGeral.keySet()) { 
			Integer value = ingredientesPizzaGeral.get(key);
			System.out.println("Ingrediente: ["+key.toUpperCase()+"] Quantidade: ["+value+"]");
		}
		System.out.println("---------------------------------------");
	}

}
