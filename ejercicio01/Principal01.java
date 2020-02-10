package certamen01.ejercicio01;

import java.util.Scanner;

public class Principal01 {

	public static void main(String[] args) {
		
	         
		       Scanner sn = new Scanner(System.in);
		       
		       boolean salir = false;
		       int opcion,op; //Guardaremos la opcion del usuario
		       int i=0;
		       int a1,a2,a3,a4,a5;
		       
		       System.out.println("\nEscribe la cantidad de usuarios que desea ingresar:");
		       op=sn.nextInt();
		       
		       Usuario[] user=new Usuario[op]; 
		       Scanner leer= new Scanner(System.in);
		       
	
		       while(!salir){
		    	   
		    	   System.out.println("\nEscribe una de las opciones:");
		           System.out.println("1. Abono de dinero");
		           System.out.println("2. Descuento por viaje");
		           System.out.println("3. Consulta el saldo");
		           System.out.println("4. Verificar su actividad");
		           System.out.println("Presione cualquier numero para salir:");
		           
		           do {
		        	   opcion = sn.nextInt();
		        	  
		        	   
				} while (opcion<1 && opcion>4);
		          
		            
		           switch(opcion){
		               case 1:
		                   System.out.println("Abono de dinero");
		                   System.out.println("**********************");
		                   System.out.println("Ingresa el abono para su tarjeta:");
		                   a1=leer.nextInt();
		                   user[i].setSaldof(a1);
		                   
		                   System.out.println("\n\n");
		                   break;
		               case 2:
		            	   
		            	   int descuento,descuento2;
		                   System.out.println("Descuento por viaje");
		                   System.out.println("ingrese el descuento por viaje en %:");
		                   descuento=leer.nextInt();
		                   descuento2=descuento/100;
		                   
		                   a2=descuento2*user[i].getSaldof();
		                   user[i].setSaldof(a2);
		                   System.out.println("\n\n");
		                   
		                   break;
		                case 3:
		                   System.out.println("Consulta el saldo");
		                  for (int z=0;z<user.length;z++) {
							System.out.println(user[z].getSaldof());
						}
		                   System.out.println("\n\n");
		                   break;
		                case 4:
			                   System.out.println("Verificar su actividad");
			                   a4=leer.nextInt();
			                   user[i].setSaldof(a4);
			                   System.out.println("\n\n");
			                   break;
		                default:
		                	  salir=true;
		                   System.out.println("adios!!!");
		           }
		            ++i;
		       }
		        
		    }

	}


