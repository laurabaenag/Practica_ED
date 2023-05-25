package practicaED.bloque1;

/**
 * @author Laura
 * Implementa el primer metodo de numeroAleatorio.
 *
 */
public class NumeroAleatorio {
	/*Método que devuelva un número aleatorio entre dos pasados por
	argumentos del método.*/
	/*
	 * @param numero1 y numero2
	 * Le introduczo al metodo los parametros anteriores*/
	public int numeroAleatorio(int numero1, int numero2) {
		int numeroRandom = (int) (Math.random() * (numero1 - numero2 + 1) + numero2);
		/*Me devuelve el numero random*/
		return numeroRandom;
	}

}
