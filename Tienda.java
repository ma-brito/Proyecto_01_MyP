import java.util.LinkedList;
import java.util.*;


public class Tienda{
    private Idioma idioma;

    private void transformarcion(Idioma nuevoIdioma){
		idioma = nuevoIdioma;
	}

	public String saludar(){
		return idioma.saludar();
	}

	public String despedirse(){
		return idioma.despedirse();
	}

	public String completarCompra(){
		return idioma.completarCompra();
	}

	public String fecha(){
		return idioma.fecha();
	}

	public String menu(){
		return idioma.menu();
	}

	public String oferta(){
		return idioma.oferta();
	}

    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int opcion;
		Tienda tienda = new Tienda();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("julio.g", "calaverita1", "Julio García", "34661102741",  "Avenida Cadena, 2, 6º A, C.P:435768", 1887, 2, 3345);
        Cliente cliente2 = new Cliente("jose.m", "remi88", "Jose Martinez", "5567453856",  "Calle Aljibe #12-4, C.P:5834950", 9965, 1, 5576);
        Cliente cliente3 = new Cliente("maria.p", "nacional4tri", "Maria Perez", "557834647328",  " 1980 Fairfax Drive, Bayville, Z.C:08762", 5544, 3,9465);
		System.out.println("***BIENVENIDO A CHEEMSMART***");
        System.out.println("Por favor, ingrese su nombre de usuario:");
        String usuario = sc.nextLine();
        System.out.println("Por favor, ingrese su contraseña:");
        String contraseña = sc.nextLine();

        for(int i=0; i< clientes.size(); i++){
            if(clientes.get(i).getUsuario().equals(usuario) && clientes.get(i).getContraseña().equals(contraseña)){
                Cliente seleccionado = clientes.get(i);
				if(seleccionado.getPais()==1)
				tienda.transformarcion(new Latino());
				else if(seleccionado.getPais()==3)
				tienda.transformarcion(new Ingles());
				else if(seleccionado.getPais()==2)
				tienda.transformarcion(new España());

				System.out.println(tienda.saludar());
				System.out.println(tienda.menu());

				do{
					
		
						while (true){
							try {
								String opcionUsuario = sc.nextLine();
								opcion = Integer.parseInt(opcionUsuario);
								break;
							}catch (NumberFormatException ex){
								System.out.println("Por favor, ingrese un numero");
								System.out.println(tienda.menu());
							}
						}
		
                opcion = sc.nextInt();
                switch(opcion){
                    case 1:
                        
                    case 2:
                        System.out.println(clientes.get(i).getCarrito().toString());
                        break;
                    case 3:
                        System.out.println(clientes.get(i).getCompras().toString());
                        break;
                    case 4:
                        System.out.println("Gracias por su visita");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }
        }
        }

		
				switch(opcion){
					case 1:
						mechaCheems.activar();
						break;

					case 2:
						mechaCheems.caminar();
						break;

					case 3:
						mechaCheems.cocinar();
						break;

					case 4:
						mechaCheems.servir();
						break;

					case 5:
						mechaCheems.suspender();
						break;

					case 6:
						mechaCheems.atender();
						break;
						
					case 0:
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;

				}

		}while(opcion != 0);

	}
}