package certamen01.ejercicio02;

public class Principal02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Empleado a1=new Empleado("14567893k", "arturo", "ruiz", "silva", "administrativo");
		Empleado a2=new Empleado("178999199", "zapata", "soto", "paicavi 4566", 46556566, "zapata@gmail.com");
		
		System.out.println("don "+a1.getNombre()+" "+a1.getApellidop()+" "+a1.getApellidom()+" ,su cargo es"+a1.getCargo());
		System.out.println("\n");
		System.out.println("señor "+a2.getApellidop()+" "+a2.getApellidom()+" ,su direccion es "+a2.getDireccion()+", su telefono es "+a2.getFono()+" y su correo es "+a2.getMain() );
	}

}
