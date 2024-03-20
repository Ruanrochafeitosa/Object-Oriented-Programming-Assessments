package avaliacao;

public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente("Paulo", 1.73, 70.0);
		Paciente p2 = new Paciente("Jão", 1.66, 70.8);
		Paciente p3 = new Paciente("Marcos", 1.70, 80);
		
		System.out.println("Resultado de "+p1.nome);
		System.out.println("O seu imc resultou em:"+p1.calcularIMC());
		System.out.println("Diagnóstico:"+p1.diagnostico());
		
		System.out.println("Resultado de "+p2.nome);
		System.out.println("O seu imc resultou em:"+p2.calcularIMC());
		System.out.println("Diagnóstico:"+p2.diagnostico());
		
		System.out.println("Resultado de "+p3.nome);
		System.out.println("O seu imc resultou em:"+p3.calcularIMC());
		System.out.println("Diagnóstico:"+p3.diagnostico());
		
		

	}

}
