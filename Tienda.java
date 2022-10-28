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

	public String seleccion(){
		return idioma.seleccion();
	}

	public String opcionesCompra(){
		return idioma.opcionesCompra();
	}

    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int opcion;
		Tienda tienda = new Tienda();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("julio.g", "calaverita1", "Julio García", "34661102741",  "Avenida Cadena, 2, 6º A, C.P:435768", 1887, 2, 3345, 500000.00);
        Cliente cliente2 = new Cliente("jose.m", "remi88", "Jose Martinez", "5567453856",  "Calle Aljibe #12-4, C.P:5834950", 9965, 1, 5576,2800.00);
        Cliente cliente3 = new Cliente("maria.p", "nacional4tri", "Maria Perez", "557834647328",  " 1980 Fairfax Drive, Bayville, Z.C:08762", 5544, 3,9465, 3000.00);
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		System.out.println("***BIENVENIDO A CHEEMSMART***");
        System.out.println("Por favor, ingrese su nombre de usuario:");
        String usuario = sc.nextLine();
        System.out.println("Por favor, ingrese su contrasena:");
        String contrasena = sc.nextLine();

        for(int i=0; i< clientes.size(); i++){
            if(clientes.get(i).getUsuario().equals(usuario) && clientes.get(i).getContrasena().equals(contrasena)){
                Cliente seleccionado = clientes.get(i);
				if(seleccionado.getPais()==1)
				tienda.transformarcion(new Latino());
				else if(seleccionado.getPais()==3)
				tienda.transformarcion(new Ingles());
				else if(seleccionado.getPais()==2)
				tienda.transformarcion(new Espana());

				System.out.println(tienda.saludar());
				
				do{
					System.out.println(tienda.menu());
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
		
                
				GrupoProducto grupo = new GrupoProducto();
                switch(opcion){
                    case 1:
						Iterator iterador = grupo.getIterator();
						int contador1=1;
						while(iterador.hasNext()){
							System.out.println(contador1 + " )");
							Producto producto = (Producto)iterador.next();
							System.out.println(producto.getNombre());
							System.out.println(producto.getPrecio());
							System.out.println(producto.getCodigoBarras());
							contador1++;
						}
						break;
                    case 2:
					ArrayList<Producto> carrito = new ArrayList<Producto>();
					Iterator iteradorDos = grupo.getIterator();
					int contador = 1;
					while(iteradorDos.hasNext()){
						Producto producto = (Producto)iteradorDos.next();
						System.out.println(contador + " )");
						System.out.println(producto.getNombre());
						System.out.println(producto.getPrecio());
						System.out.println(producto.getCodigoBarras());
						contador++;
					}

					do{
						System.out.println(tienda.opcionesCompra());
			
							while (true){
								try {
									String opcionUsuario = sc.nextLine();
									opcion = Integer.parseInt(opcionUsuario);
									break;
								}catch (NumberFormatException ex){
									System.out.println(tienda.opcionesCompra());
									
								}
							}
			
							switch(opcion){
								case 1:
								int seleccion = 0;
								do{
									System.out.println(tienda.seleccion()); 
								seleccion = sc.nextInt();
								if(seleccion >0 && seleccion<grupo.getTamano()){
									carrito.add(grupo.getProducto(seleccion-1));
									System.out.println("Producto agregado al carrito");
			
								}
								else{
									System.out.println("Por favor, ingrese un numero valido");
								}
								System.out.println(carrito);
							}while(seleccion <0 && seleccion>grupo.getTamano()+1);
								break;
								case 2:
								System.out.println("****Pasando a verificación segura****");
								System.out.println("Por favor ingresa tu número de cuenta");
								ClienteProxy proxy = new ClienteProxy(seleccionado);
								double monto = 0;

								for(int j=0; j<carrito.size(); j++){
									monto += carrito.get(j).getPrecio();
								}
								while (true){
									try {
										String cuenta = sc.nextLine();
										opcion = Integer.parseInt(cuenta);
										break;
									}catch (NumberFormatException ex){
										System.out.println("Por favor, ingrese un numero");
									}
								}
								if(proxy.getCuenta()==opcion){
									proxy.realizarCompra(monto);
									proxy.actualizarEnReales();
								}else{
									System.out.println("El número de cuenta no coincide");
									System.exit(0);
								}

									break;
									
								case 3:
									tienda.despedirse();
									break;
			
								default:
									System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
									break;
			
							}
			
					}while(opcion != 3);
					

					break;
                    default:
                        System.out.println("Opción no válida");
                        break;
					case 3:
					tienda.despedirse();
					System.exit(0);
					break;
                }
            }while(opcion != 3);
			}else{
				System.out.println("El usuario o la contraseña no existe");
			}
		}

	}
}