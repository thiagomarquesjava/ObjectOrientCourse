package tarefas.calculoIMC;

public class Principal {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(40D,1.8D);
		Paciente paciente2 = new Paciente(80D,1.73D);
		Paciente paciente3 = new Paciente(80D,1.8D);
		
		System.out.println("IMC do Paciente1: " + paciente1.calcularIMC() + " Diagnóstico [" + paciente1.diagnostico() + "]");
		System.out.println("IMC do Paciente2: " + paciente2.calcularIMC() + " Diagnóstico [" + paciente2.diagnostico() + "]");
		System.out.println("IMC do Paciente3: " + paciente3.calcularIMC() + " Diagnóstico [" + paciente3.diagnostico() + "]");
	}

}
