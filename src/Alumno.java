
public class Alumno extends Persona {
	private String dni;

	public Alumno(String nombre, int edad, String dni) {
		super(nombre, edad);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
