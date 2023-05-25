package practicaED.bloque1;

public class MainSheila {

	public static void main(String[] args) {
		NumeroAleatorio Numero = new NumeroAleatorio();
		System.out.println(Numero.numeroAleatorio(8, 10));
		
		Persona persona1 = new Persona("Pedro", 16);
		MayorMenorEdad esMenor = new MayorMenorEdad();
		System.out.println(esMenor.MayorMenorEdad(persona1));
	}




}
