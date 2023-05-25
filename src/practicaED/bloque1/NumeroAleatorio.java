package practicaED.bloque1;

public class NumeroAleatorio {

	public int numeroAleatorio(int numero1, int numero2) {
		int numeroRandom = (int) (Math.random() * (numero1 - numero2 + 1) + numero2);
		return numeroRandom;
	}

}
