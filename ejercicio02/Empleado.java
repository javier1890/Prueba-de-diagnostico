package certamen01.ejercicio02;

public class Empleado {

	private String rut;
	private String nombre;
	private String apellidop;
	private String apellidom;
	private String cargo;
	
	private String direccion;
	private int fono;
	private String main;
	
	
	
	public Empleado(String rut, String nombre, String apellidop, String apellidom, String cargo) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.cargo = cargo;
	}
	
	
	public Empleado(String rut, String apellidop, String apellidom, String direccion, int fono, String main) {
		this.rut = rut;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.direccion = direccion;
		this.fono = fono;
		this.main = main;
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
	public String getApellidop() {
		return apellidop;
	}
	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}
	public String getApellidom() {
		return apellidom;
	}
	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getFono() {
		return fono;
	}
	public void setFono(int fono) {
		this.fono = fono;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	
	
	
	
	
	
}
