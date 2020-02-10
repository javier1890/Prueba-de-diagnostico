package certamen01.ejercicio03;

public class Automovil {

	private String marca;
	private String modelo;
	private int anio;
    private double precio;
    
    
    
	public Automovil() {
	}



	public Automovil(String marca, String modelo, int anio, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
	}

	


   public void precioFinal() {
	  if (this.precio!=0) {

		  
		System.out.println("El precio finl es "+(int)((((this.precio)*1.19)*1.05)+100000));
	}else {
		System.out.println("No ha ingresado un precio");
	}
   }


   
	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getAnio() {
		return anio;
	}



	public void setAnio(int anio) {
		this.anio = anio;
	}
    
    
	
    
}
