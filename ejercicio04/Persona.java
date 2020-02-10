package certamen01.ejercicio04;

public class Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Privado a2=new Privado("15243567", "fernando", "juan bosco 1786", 97683416,600000.00, "comuna las condes", "gerencia");
		
		Publico a3=new Publico("20383838", "francisco", "los laureles 45", 976834678, 600000.00,"municipalidad de los alamos", "administrativo");
		
		System.out.println(a2.toString());
		System.out.println(a3.toString());

	}

}
