
public class Principal {

	public static void main(String[] args) {
		Barulhento[] barrulhentos = new Barulhento [10];
		barrulhentos[0] = new Cachorro();
		barrulhentos[1] = new Carro();
		barrulhentos[2] = new Vuvuzela();
		barrulhentos[3] = new Cachorro();
		barrulhentos[4] = new Bateria();
		barrulhentos[5] = new Carro();
		barrulhentos[6] = new Vuvuzela();
		barrulhentos[7] = new Carro() ;
		barrulhentos[8] = new Bateria();
		barrulhentos[9] = new Cachorro();
		sons(barrulhentos);

	}
	
	public static void sons(Barulhento[] barrulhentos) {
		for (Barulhento b: barrulhentos) { 
			System.out.println(b.fazerBarulho());
		}
	}

}
