package fuentes_henriquez_zazzali.Logic;
import java.sql.Connection;
import java.util.Scanner;
import fuentes_henriquez_zazzali.Domain.Database;

public class Main {

    public static void main(String[] args) {
        Connection conn = new Database().getConnection();
        System.out.println(conn);

        System.out.println("Welcome to Tecno Store!\n");
        System.out.println("¿How do you wish to begin?: (1) Start buying\n (2) Watch customer with top purchases\n (3) Best selling product\n (4) Worst selling product\n (5) Customer who has spent more money on purchases\n (6) Salir del sistema");     

        Scanner scanner = new Scanner(System.in);
    	int opcion = scanner.nextInt();

    	while(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 && opcion != 6) {
    		System.out.println("Invalid option!\n");
    		System.out.println("Try again: ");
    		opcion = scanner.nextInt();
        }
        switch(opcion){
            case 1:
            System.out.println("Enter your Rut\n");
            String rut = scanner.nextLine();
            //DatabaseSAber.getCLientebyRut(rut);
            //Estos son los productos disponibles

            case 2:
            System.out.println("The customer with top purchases:\n ");
            

            case 3:
            System.out.println(" The best selling product:\n ");

            case 4:
            System.out.println("The  worst selling product:\n ");

            case 5:
            System.out.println("The customer who has spent more money on purchases:\n ");

            case 6:
            System.out.println("Exiting.....");
            
        }
    	if(opcion==1) {
    		System.out.println("Ingrese la fecha actual (DD/MM/AA); ");
    		String fecha=scanner.nextLine();
    		while(fecha.length()<8) {
    			System.out.println("Error, el formato de la fecha es invalido! ");
    			System.out.println("Ingrese la fecha actual (DD/MM/AA); ");
    			fecha=scanner.nextLine();
    		}
	    	System.out.println("Desea registrarse? (SI/NO):");
	    	String eleccion = scanner.nextLine();
	    	while(!eleccion.equalsIgnoreCase("SI") && !eleccion.equalsIgnoreCase("NO")) {
	    		System.out.println("Opcion invalida");
	    		System.out.println("Desea registrarse? (SI/NO):");
	    		eleccion = scanner.nextLine();
	    	}
	    	if(eleccion.equalsIgnoreCase("SI")) { 
	    		Scanner scan = new Scanner(System.in);
	    		System.out.println("Ingrese su nombre: ");
	    		String nuevoNom = scan.nextLine();
	    		System.out.println("Ingrese su contrasena: ");
	    		String contra = scan.nextLine();
	    		while(sistema.verificarDatos(nuevoNom,contra)==true) {
	    			System.out.println("El nombre y/o la contrasena ya existen, ingrese sus datos nuevamente: ");
	    			System.out.println("Ingrese su nombre: ");
	    			nuevoNom = scan.nextLine();
		    		System.out.println("Ingrese su contrasena: ");
		    		contra = scan.nextLine();
	    		}
	    		boolean ingreso=sistema.ingresarJugador(nuevoNom, contra, 0);
	    		if(ingreso!=false) {
	    			System.out.println("Registro exitoso!");
	    		}
	    		System.out.println("Ha ingresado al MENU JUGADOR");
	    		System.out.println("Operaciones: "+"\n1)Ver informacion de usuario"+"\n2)Anadir saldo"+"\n3)Comprar Orbe"+"\n4)Re-roll"+"\n5)Abrir Orbe"+"\n6)Salir del sistema");
	    		int operacion=scanner.nextInt();
	    		while(operacion!=6) {
	    			switch(operacion) {
	    			    case 1:
	    			    	System.out.println(sistema.informacionUsuario(nuevoNom));
	    			    	break;
	    			    case 2:
	    			    	System.out.println("Ingrese el monto que desea anadir a su cuenta: ");
	    			    	int nuevoMont=scanner.nextInt();
	    			    	boolean realizado=sistema.anadirSaldo(nuevoNom, nuevoMont);
	    			    	if(realizado==true) {
	    			    		System.out.println("Monto anadido con exito!");
	    			    	}
	    			    	else {
	    			    		System.out.println("Fallo el ingreso del monto");
	    			    	}
	    			    	break;
	    			    case 3:
	    			    	System.out.println(sistema.obtenerOrbes());
	    			    	System.out.println("Ingrese el nombre del orbe que desea comprar: ");
	    			    	String nomOrbe = scan.nextLine();
	    			    	boolean resultadoCompra=sistema.comprarOrbe(nomOrbe, nuevoNom,fecha);
	    			    	if(resultadoCompra==true) {
	    			    		System.out.println("Orbe comprado con exito!");
	    			    	}
	    			    	else {
	    			    		System.out.println("Fallo la compra del orbe");
	    			    	}
	    			    	System.out.println("¿Desea abrir el orbe? (SI/NO):");
	    			    	String elecc = scan.nextLine();
	    			        while(elecc.equalsIgnoreCase("SI") && elecc.equalsIgnoreCase("NO")) {
	    			        	System.out.println("Opcion incorrecta");
	    			        	System.out.println("¿Desea abrir el orbe? (SI/NO):");
	    			        	elecc = scan.nextLine();
	    			        }
	    			        if(elecc.equalsIgnoreCase("SI")) {
	    			        	System.out.println(sistema.abrirOrbe(nomOrbe, nuevoNom)); // REVISARRRRR
	    			        }
	    			    	break;
	    			    case 4:
	    			    	try {
	    			    		System.out.println(sistema.obtenerFragmentosJugador(nuevoNom));
	    			    		System.out.println("Elija el nombre del primer fragmento: ");
	    			    		String asp = scan.nextLine();
		    			    	System.out.println("Elija el nombre del segundo fragmento: ");
		    			    	String asp2 = scan.nextLine();
		    			    	System.out.println("Elija el nombre del tercer fragmento: ");
		    			    	String asp3 = scan.nextLine();
		    			    	boolean verif=sistema.verificarFragmento(nuevoNom, asp);
		    			    	boolean verif2=sistema.verificarFragmento(nuevoNom, asp2);
		    			    	boolean verif3=sistema.verificarFragmento(nuevoNom, asp3);
		    			    	while(verif!=true && verif2!=true && verif3!=true) {
		    			    		System.out.println("Error uno de los fragmentos no pertenece a su inventario, intente de nuevo");
		    			    		System.out.println("Elija el nombre del primer fragmento: ");
			    			    	asp=scan.nextLine();
			    			    	System.out.println("Elija el nombre del segundo fragmento: ");
			    			    	asp2=scan.nextLine();
			    			    	System.out.println("Elija el nombre del tercer fragmento: ");
			    			    	asp3=scan.nextLine();
		    			    	}
		    			    	sistema.eliminarFragmentoJugador(nuevoNom, asp);
		    			    	sistema.eliminarFragmentoJugador(nuevoNom, asp2);
		    			    	sistema.eliminarFragmentoJugador(nuevoNom, asp3);
		    			    	System.out.println(sistema.reRoll(nuevoNom));
	    			    	}catch(Exception ex) {
	    			    		ex.getMessage();
	    			    	}
	    			    	
	    			        break;
	    			    case 5:
	    			    	System.out.println(sistema.obtenerOrbesJugador(nuevoNom));
	    			    	System.out.println("¿Que orbe desea abrir?");
	    			    	String orbeElegido=scan.nextLine();
	    			    	boolean verificar=sistema.verificarOrbe(nuevoNom, orbeElegido);
	    			    	while(verificar!=true) {
	    			    		System.out.println("Error!, el orbe escogido no esta en su inventario, intente de nuevo");
	    			    		System.out.println("¿Que orbe desea abrir?");
		    			    	orbeElegido=scan.nextLine();
	    			    	}
	    			    	System.out.println(sistema.abrirOrbe(orbeElegido, nuevoNom));
	    			    	break;
	   
	    			}
	    			System.out.println("Operaciones: "+"\n1)Ver informacion de usuario"+"\n2)Anadir saldo"+"\n3)Comprar Orbe"+"\n4)Re-roll"+"\n5)Abrir Orbe"+"\n6)Salir del sistema");
		    		operacion=StdIn.readInt();
	    		}
	    	}   
	    	
	    	else {                                 
	    		Scanner scan = new Scanner(System.in);
	    		System.out.println("Ingrese su nombre: ");
	    		String nombre= scan.nextLine();
	    		System.out.println("Ingrese su contrasena: ");
	    		String contra=scan.nextLine();
	    		boolean verificacion=sistema.verificarDatos(nombre, contra);
	            while(verificacion==false) {
	            	System.out.println("Datos incorrectos, ingrese sus datos nuevamente ");
	            	System.out.println("Ingrese su nombre: ");
	            	nombre= scan.nextLine();
		    		System.out.println("Ingrese su contrasena: ");
		    		contra=scan.nextLine();
		    		verificacion=sistema.verificarDatos(nombre, contra);
	            }
	            boolean verAdmin=sistema.verificarAdmin(nombre, contra);
	    		if(verificacion!=false && verAdmin==false) {
	    			System.out.println("Operaciones: "+"\n1)Ver informacion de usuario"+"\n2)Anadir saldo"+"\n3)Comprar Orbe"+"\n4)Re-roll"+"\n5)Abrir Orbe"+"\n6)Salir del sistema");
	    			int elegir=StdIn.readInt();
	    			while(elegir!=6) {
	    				switch(elegir) {
	    			    case 1:
	    			    	System.out.println(sistema.informacionUsuario(nombre));
	    			    	break;
	    			    case 2:
	    			    	System.out.println("Ingrese el monto que desea anadir a su cuenta: ");
	    			    	int nuevoMont=StdIn.readInt();
	    			    	boolean realizado=sistema.anadirSaldo(nombre, nuevoMont);
	    			    	if(realizado==true) {
	    			    		System.out.println("Monto anadido con exito!");
	    			    	}
	    			    	else {
	    			    		System.out.println("Fallo el ingreso del monto");
	    			    	}
	    			    	break;
	    			    case 3:
	    			    	System.out.println(sistema.obtenerOrbes());
	    			    	System.out.println("Ingrese el nombre del orbe que desea comprar: ");
	    			    	String nomOrbe=scan.nextLine();
	    			    	boolean resultadoCompra=sistema.comprarOrbe(nomOrbe, nombre,fecha);
	    			    	if(resultadoCompra==true) {
	    			    		System.out.println("Orbe comprado con exito!");
	    			    	}
	    			    	else {
	    			    		System.out.println("Fallo la compra del orbe");
	    			    	}
	    			    	System.out.println("¿Desea abrir el orbe? (SI/NO):");
	    			        String elecc=scan.nextLine();
	    			        while(elecc.equalsIgnoreCase("SI") && elecc.equalsIgnoreCase("NO")) {
	    			        	System.out.println("Opcion incorrecta");
	    			        	System.out.println("¿Desea abrir el orbe? (SI/NO):");
	    			        	elecc=scan.nextLine();
	    			        }
	    			        if(elecc.equalsIgnoreCase("SI")) {
	    			        	System.out.println(sistema.abrirOrbe(nomOrbe, nombre)); // REVISARRRRR
	    			        }
	    			    	break;
	    			    case 4:
	    			    	try {
	    			    		System.out.println(sistema.obtenerFragmentosJugador(nombre));
	    			    		System.out.println("Elija el nombre del primer fragmento: ");
		    			    	String asp=scan.nextLine();
		    			    	System.out.println("Elija el nombre del segundo fragmento: ");
		    			    	String asp2=scan.nextLine();
		    			    	System.out.println("Elija el nombre del tercer fragmento: ");
		    			    	String asp3=scan.nextLine();
		    			    	boolean verif=sistema.verificarFragmento(nombre, asp);
		    			    	boolean verif2=sistema.verificarFragmento(nombre, asp2);
		    			    	boolean verif3=sistema.verificarFragmento(nombre, asp3);
		    			    	while(verif!=true && verif2!=true && verif3!=true) {
		    			    		System.out.println("Error uno de los fragmentos no pertenece a su inventario, intente de nuevo");
		    			    		System.out.println("Elija el nombre del primer fragmento: ");
			    			    	asp=scan.nextLine();
			    			    	System.out.println("Elija el nombre del segundo fragmento: ");
			    			    	asp2=scan.nextLine();
			    			    	System.out.println("Elija el nombre del tercer fragmento: ");
			    			    	asp3=scan.nextLine();
		    			    	}
		    			    	sistema.eliminarFragmentoJugador(nombre, asp);
		    			    	sistema.eliminarFragmentoJugador(nombre, asp2);
		    			    	sistema.eliminarFragmentoJugador(nombre, asp3);
		    			    	System.out.println(sistema.reRoll(nombre));
	    			    	}catch(Exception ex) {
	    			    		ex.getMessage();
	    			    	}
	    			    	break;
	    			    case 5:
	    			    	try {
	    			    		System.out.println(sistema.obtenerOrbesJugador(nombre));
		    			    	System.out.println("¿Que orbe desea abrir?");
		    			    	String orbeElegido=scan.nextLine();
		    			    	boolean verificar=sistema.verificarOrbe(nombre, orbeElegido);
		    			    	while(verificar!=true) {
		    			    		System.out.println("Error!, el orbe escogido no esta en su inventario, intente de nuevo");
		    			    		System.out.println("¿Que orbe desea abrir?");
			    			    	orbeElegido=scan.nextLine();
		    			    	}
		    			    	System.out.println(sistema.abrirOrbe(orbeElegido, nombre));
	    			    	}catch(Exception ex) {
	    			    		ex.getMessage();	    			    	}
	    			    	break;
	    			}
	    				System.out.println("Operaciones: "+"\n1)Ver informacion de usuario"+"\n2)Anadir saldo"+"\n3)Comprar Orbe"+"\n4)Re-roll"+"\n5)Abrir Orbe"+"\n6)Salir del sistema");
		    			elegir=StdIn.readInt();
	    			}
	    		}
	    		else {
	    			System.out.println("Ha ingresado con exito al MENU ADMIN");
	    			System.out.println("Operaciones: "+"\n1)Mes mas ventas"+"\n2)Informacion Jugadores"+"\n3)Mejor aspecto"+"\n4)Salir del sistema");
	    			int elegir=StdIn.readInt();
	    			while(elegir!=4) {
	    				switch(elegir) {
	    				case 1:
	    					System.out.println("El mes con mas ventas es:\n");
	    					System.out.println(sistema.mesMasVentas());
	    					break;
	    				case 2:
	    					System.out.println(sistema.informacionJugadores());
	    					break;
	    				case 3:
	    					System.out.println("El aspecto de campeon mas frecuente es:\n");
	    					System.out.println(sistema.mejorAspecto());
	    					break;
	    				
	    				}
	    				System.out.println("Operaciones: "+"\n1)Mes mas ventas"+"\n2)Informacion Jugadores"+"\n3)Mejor aspecto"+"\n4)Salir del sistema");
		    			elegir=StdIn.readInt();
	    			}
	    		}
	    	}
    	}
    }
}