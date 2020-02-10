package certamen01.ejercicio04;

public class Privado extends Empleado {

	private String comuna;
	private String empresa;

	public Privado(String rut, String nombre, String direccion, int telefono, double saldo, String comuna,
			String empresa) {
		super(rut, nombre, direccion, telefono, saldo);
		this.comuna = comuna;
		this.empresa = empresa;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Privado [rut="+this.getRut() +",nombre="+this.getNombre()+",direccion="+this.getDireccion()+",telefono="+this.getTelefono()+",saldo="+this.getSaldo()+",comuna=" + comuna + ", empresa=" + empresa + "]";
	}

	
}
