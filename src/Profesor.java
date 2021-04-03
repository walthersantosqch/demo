
public class Profesor extends Persona {
	private String codigo;
	
	public Profesor(String nombre, int edad, String codigo) {
		super(nombre, edad);
		
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Profesor [codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
}
