
public class Principal {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(10);		
		pilha.empilhar("Carlos");
		pilha.empilhar("Maria");
		pilha.empilhar("Jose");		

		pilha.desempilhar();
		System.out.println("Elemento....: ["+pilha.topo()+"]");
		System.out.println("Topo........: ["+pilha.tamanho()+"]");
		System.out.println("\nDesempilhar.: ["+pilha.desempilhar().toString().toUpperCase()+"]");
		System.out.println("Elemento....: ["+pilha.topo()+"]");
		System.out.println("Topo........: ["+pilha.tamanho()+"]");
	}

}
