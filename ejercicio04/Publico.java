package certamen01.ejercicio04;

public class Publico extends Empleado {

	private String municipalidad;
	private String departamento;

	public Publico(String rut, String nombre, String direccion, int telefono, double saldo, String municipalidad,
			String departamento) {
		super(rut, nombre, direccion, telefono, saldo);
		this.municipalidad = municipalidad;
		this.departamento = departamento;
	}

	public String getMunicipalidad() {
		return municipalidad;
	}

	public void setMunicipalidad(String municipalidad) {
		this.municipalidad = municipalidad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Publico [rut= "+this.getRut()+",nombre= "+this.getNombre()+",direccion="+this.getDireccion()+",telefono="+this.getTelefono()+",saldo="+this.getSaldo()+"+municipalidad=" + municipalidad + ", departamento=" + departamento + "]";
	}
	
	

}
