package associacao;

public class Principal {

	public static void main(String[] args) {
		
		Departamento departamento = new Departamento();
		departamento.setNome("Contabilidade");
		
		Empregado empregado = new Empregado();
		empregado.setNome("João Paulo");
		empregado.setDepartamento(departamento);
		
		System.out.println(empregado.getNome() + " faz parte do departamento " + empregado.getDepartamento().getNome());
		
	}
	
}
