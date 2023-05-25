package practicaED.bloque1;

public class Main_Jesus {

	public static void main(String[] args) {
		
		NumeroAleatorio num1 = new NumeroAleatorio();
		System.out.println(num1.numeroAleatorio(2, 9));
		
		
		Persona persona1 = new Persona("John", 56);
		MayorMenorEdad mayorONo = new MayorMenorEdad();
		
		System.out.println(mayorONo.MayorMenorEdad(persona1));
	}

}
