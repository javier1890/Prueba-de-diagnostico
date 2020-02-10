package certamen01.ejercicio01;

public class Usuario {

	public enum User {
		comun, tne, bip;
	}

	private long numero_tarjeta;
	private Usuario tipo;
	private int saldof;
	private int descuentof;
	private boolean activa;

	public Usuario() {
		this.saldof=0;
		this.activa=true;
	}

	public Usuario(long numero_tarjeta, Usuario tipo, int saldof, int descuentof) {
		super();
		this.numero_tarjeta = numero_tarjeta;
		this.tipo = tipo;
		this.saldof = saldof;
		this.descuentof = descuentof;
	}
	
	
	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	

	public long getNumero_tarjeta() {
		return numero_tarjeta;
	}

	public void setNumero_tarjeta(long numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}

	public Usuario getTipo() {
		return tipo;
	}

	public void setTipo(Usuario tipo) {
		this.tipo = tipo;
	}

	public int getSaldof() {
		return saldof;
	}

	public void setSaldof(int saldof) {
		this.saldof = saldof;
	}

	public int getDescuentof() {
		return descuentof;
	}

	public void setDescuentof(int descuentof) {
		this.descuentof = descuentof;
	}

	@Override
	public String toString() {
		return "Usuario [numero_tarjeta=" + numero_tarjeta + ", tipo=" + tipo + ", saldof=" + saldof + ", descuentof="
				+ descuentof + "]";
	}

	
	
}
