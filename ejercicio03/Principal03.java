package certamen01.ejercicio03;

public class Principal03 {

	public static void main(String[] args) {
		
		Automovil auto=new Automovil("nissan", "mz-20", 2015, 34444444.000);
		System.out.println("la marca es "+auto.getMarca());
		System.out.println("el modelo es "+auto.getModelo());
		auto.precioFinal();

		 
	}

}
