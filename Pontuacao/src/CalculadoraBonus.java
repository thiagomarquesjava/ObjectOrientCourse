
public class CalculadoraBonus {

	int bonusDoDia=1;
	
	public int bonus(Usuario usuario) { 
		int multiplicador = bonusDoDia;
		if (usuario.vip) 
			multiplicador *= 5;
		return multiplicador;
	}
}
