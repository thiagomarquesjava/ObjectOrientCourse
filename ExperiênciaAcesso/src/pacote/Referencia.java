package pacote;

public class Referencia {
	
	int modficadorDefault;
	public int modificadorPublico;
	protected int modificadorProtegido;
	private int modificadorPrivado;
	
	public void testeAcesso() { 
		modficadorDefault = 0;
		modificadorPublico =0;
		modificadorProtegido =0;
		modificadorPrivado=0;
	}

}
