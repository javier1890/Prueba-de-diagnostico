package certamen01.ejercicio04;

public class Empleado {
	private String rut;
	private String nombre;
	private String direccion;
	private int telefono;
	private double saldo;

	public Empleado(String rut, String nombre, String direccion, int telefono, double saldo) {
		this.rut = rut;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.saldo = saldo;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
