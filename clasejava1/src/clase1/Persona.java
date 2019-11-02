package clase1;

public class Persona {
	private int altura;
	private String nombre; // "cadena"
	private boolean fuma = false; // true
	private char sexo; // 'f' o 'm'
	private float peso; // 60,5f
	private double sueldo; // 65000d
	private String nacionalidad;
	private Persona padre;
	private Persona madre;

	

	public Persona getPadre() {
		return padre;
	}

	public void setPadre(Persona padre) {
		this.padre = padre;
	}

	public Persona getMadre() {
		return madre;
	}

	public void setMadre(Persona madre) {
		this.madre = madre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int alt) {
		altura = alt;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isFuma() {
		return fuma;
	}

	public void setFuma(boolean fuma) {
		this.fuma = fuma;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad; 
	}
	}
