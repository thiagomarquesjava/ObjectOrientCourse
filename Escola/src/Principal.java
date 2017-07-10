
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		aluno.bimestre1 = 70;
		aluno.bimestre2 = 80;
		aluno.bimestre3 = 70;
		aluno.bimestre4 = 60;
		
		System.out.println(aluno.media());
		System.out.println(aluno.aprovado());
	}
	
	

}
