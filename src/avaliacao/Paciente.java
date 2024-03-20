package avaliacao;

public class Paciente {

	double alturaM;
	double kg;
	String nome;
	
	public Paciente(String nome, double alturaM, double kg) {
		this.alturaM = alturaM;
		this.kg = kg;
		this.nome = nome;
	}
	
	public double calcularIMC() {
		return (kg/(alturaM*alturaM));
	}
	
	public String diagnostico() {
		double imc = calcularIMC();
		if(imc<16) {
			return "Baixo peso muito grave.";
		}else if(imc>=16 && imc<=16.99) {
			return "Baixo peso grave.";
		}else if(imc>=17 && imc<=18.49) {
			return "Baixo peso.";
		}else if(imc>=18.50 && imc<=24.99) {
			return "Peso normal.";
		}else if(imc>=25 && imc<=29.99) {
			return "Sobrepeso";
		}else if(imc>=30 && imc<=34.99) {
			return "Obesidade grau I";
		}else if(imc>=35 && imc<=39.99) {
			return "Obesidade grau II";
		}else if(imc>=40) {
			return "Obesidade grau III(obesidade mórbida)";
		}else{
			return "Digite números reais";
		}
	}
	
}
