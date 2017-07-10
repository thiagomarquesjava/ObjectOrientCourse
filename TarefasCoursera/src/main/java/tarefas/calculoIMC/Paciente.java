package tarefas.calculoIMC;

public class Paciente {
	
	private Double peso;
	private Double altura;
	private Double valorIMC;
	
	
	Paciente (Double peso, Double altura){ 
		this.peso = peso;
		this.altura = altura;
	}
	
	protected Double calcularIMC() { 
		Double valorCalculoIMC = (peso / Math.pow(altura, 2));
		Long valorAjuste = Math.round(valorCalculoIMC * 100);
		valorIMC = Double.valueOf(valorAjuste / 100);
		return valorIMC;
	}
	
	
	protected String diagnostico() { 
		if (valorIMC==null) valorIMC = calcularIMC();
		String mensagem = "";
		
		if (valorIMC<16D) mensagem = "Baixo peso muito grave";
		if (valorIMC>=16D&&valorIMC<17D) mensagem = "Baixo peso grave";
		if (valorIMC>=17D&&valorIMC<18.5D) mensagem = "Baixo peso";
		if (valorIMC>=18.5D&&valorIMC<25D) mensagem = "Peso Normal";
		if (valorIMC>=25D&&valorIMC<30D) mensagem = "Sobrepeso";
		if (valorIMC>=30D&&valorIMC<35D) mensagem = "Obesidade Grau I";
		if (valorIMC>=35D&&valorIMC<40D) mensagem = "Obesidade Grau II";
		if (valorIMC>=40D) mensagem = "Obesidade Grau III (obesidade mórbida)";
		
		return mensagem;		
	}

}
