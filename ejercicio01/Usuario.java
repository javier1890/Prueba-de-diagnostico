package certamen01;

public class Usuario {

	private long numero_tarjeta;
	private String tipo;
	private int saldof;
	private int descuentof;
	private boolean activa;

	public Usuario() {

	}

	public Usuario(long numero_tarjeta, String tipo, int saldof, boolean activa) {
		super();
		this.numero_tarjeta = numero_tarjeta;
		this.tipo = tipo;
		this.saldof = saldof;
		this.activa = activa;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
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
		return "Usuario [numero_tarjeta=" + numero_tarjeta + ", tipo=" + tipo + ", saldof=" + saldof + ", activa="
				+ activa + "]";
	}

	
}
