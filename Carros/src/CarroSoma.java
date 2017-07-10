
public class CarroSoma extends CarroDeCorrida {
	
	private int potencia;
	
	public CarroSoma(String nome, int potencia, int velocidadaMaxima) {		
		super(nome,velocidadaMaxima);
		this.potencia = potencia;				
	}

	
	public void acelerar(){		
		velocidade += potencia;
		if (velocidade>velocidadeMaxima) velocidade = velocidadeMaxima;
	}
	
	
}
