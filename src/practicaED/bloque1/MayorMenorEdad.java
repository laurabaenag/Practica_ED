package practicaED.bloque1;

/**
 * @author Laura 
 * Implementa el segundo metodo de MayorMenorEdad.
 *
 */
class Persona {
	String nombre;
	int edad;

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}

public class MayorMenorEdad {
	public static String MayorMenorEdad(Persona persona1) {
		if (persona1.edad < 18) {
			return "El usuario es menor de edad";
		} else {
			return "El usuario es mayor de edad";
		}
	}

}
