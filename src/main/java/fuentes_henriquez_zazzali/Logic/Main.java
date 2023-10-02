package fuentes_henriquez_zazzali.Logic;
import java.sql.Connection;
import java.util.Scanner;

import fuentes_henriquez_zazzali.Domain.Cliente;
import fuentes_henriquez_zazzali.Domain.Database;

public class Main {

    public static void main(String[] args) {
        Connection conn = new Database().getConnection();
        System.out.println(conn);
		String[] customer_fields={"Rut","Name","Last Name","Address","Phone","Email"};

        System.out.println("Welcome to Tecno Store!\n");
		System.out.println("To login press (1)!\n To Sign up press (2)");  

        Scanner scanner = new Scanner(System.in);
    	int opcion = scanner.nextInt();

    	while(opcion != 1 && opcion != 2) {
    		System.out.println("Invalid option!\n");
    		System.out.println("Try again: ");
    		opcion = scanner.nextInt();
        }
		String[] client_info = new String[customer_fields.length];
		if (opcion ==2){
			for (int i=0; i<customer_fields.length; i++){
				System.out.println("Enter your "+customer_fields[i]+": ");
				String info = scanner.nextLine();
				client_info[i]=info;
			}
			Cliente newClient = new Cliente(client_info[0],client_info[1],client_info[2],client_info[3],client_info[4],client_info[5]);

		}else{
            System.out.println("Ingrese su rut\n");
			String rut = scanner.nextLine();
			//Cliente currentClient = 
		}
        System.out.println("¿How do you wish to begin?: (1) Start buying\n (2) Watch customer with top purchases\n (3) Best selling product\n (4) Worst selling product\n (5) Customer who has spent more money on purchases\n (6) Salir del sistema");     
		opcion = scanner.nextInt();
        switch(opcion){
            case 1:
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Choose de product you want to buy:\n");
            System.out.println("(1) Computer\n (2) Monitor (3) Mouse:");
            int chose= scanner2.nextInt();
            switch(chose){
                case 1:
                  String[] computers={"(1) Hp Pavilion Gaming:\n id:Hp-1, Brand: HP, type: Slim model: Pavilion Gaming, CPU: Intel core i5"};
                  System.out.println("These are the computers availables\n (1) Hp Pavilion Gaming:\n id:Hp-1, Brand: HP, type: Slim CPU: Intel core i5,(2) Legion 5 Pro (3) Lenovo ideapad (4) Hp Victus (5) :");

                case 2:

                case 3:

            }

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
    }
}