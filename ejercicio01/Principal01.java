package certamen01;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal01 {

	public static void main(String[] args) {
        
//		Usuario A1=new Usuario(10001, "bip", 526333, true);
//		Usuario A2=new Usuario(10002, "tne", 500003, false);

		boolean salir = false;
		int opcion, op; // Guardaremos la opcion del usuario
		int i = 0;
		int a1, a2, a3, a4, a5;
		boolean inactiva=false;
		int plata=0;
		
		ArrayList<Usuario> users = new ArrayList<Usuario>();
//        users.add(A1);
//        users.add(A2);
        
        
		Scanner leer = new Scanner(System.in);

		int op1;

		do {
			System.out.println("\nEscribe una de las opciones:");
			System.out.println("1. Desea crear nuevo usuario");
			System.out.println("2. Desea consultar de saldo");
			System.out.println("3. Verificar actividad");
			System.out.println("4. Salir");
			op1 = leer.nextInt();
		} while (op1 < 1 && op1 > 2);

		switch (op1) {
		case 1:

			
			Usuario user = new Usuario();
			System.out.println("*****************************");
			
			int azar=(int)(Math.random()*1000)+100;
			user.setNumero_tarjeta(azar);
			
			System.out.println(" ****Desea crear nuevo usuario****");
			System.out.println("\n Ingrese tipo de usuario:");
			System.out.println(" 1)COMUN  2)TNE  3)BIP");
			do {
				a1 = leer.nextInt();
				switch (a1) {
				case 1:
					user.setTipo("comun");
					break;
				case 2:
					user.setTipo("tne");
					break;

				case 3:
					user.setTipo("bip");
					break;

				default:
					System.out.println("\n Ingrese una alternativa correcta:");
					break;
				}
			} while (a1 < 1 && a1 > 3);
			
			System.out.println(" Ingrese saldo:");
			a2 = leer.nextInt();
			user.setSaldof(a2);
			
			
			System.out.println(" Ingrese dia de inactividad:");
			a3 = leer.nextInt();
			if (a3>10) {
				inactiva=true;
				user.setActiva(inactiva);
			}else {
				user.setActiva(inactiva);
			}
			
			System.out.println(" Ingrese abono de dinero:");
			a4 = leer.nextInt();
            plata=a4+user.getSaldof();
			user.setSaldof(plata);
			
			users.add(user);
			main(args);
		case 2:
            for (Usuario usuario : users) {
				System.out.println(usuario.toString());
			}
			break;
		default:
			main(args);
			break;
		}

	}
}
