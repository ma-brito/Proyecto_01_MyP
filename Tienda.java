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

	public String numberException(){
		return idioma.numberException();
	}

	public String agregadoCarrito(){
		return idioma.agregadoCarrito();
	}

	public String verificacion(){
		return idioma.verificacion();
	}

	public String saldoInsuficiente(){
		return idioma.saldoInsuficiente();
	}

	public String cuentaRechazada(){
		return idioma.cuentaRechazada();
	}

	public String noValido(){
		return idioma.noValido();

	}

	public String ticket(){
		return idioma.ticket();
	}

	public String total(){
		return idioma.total();
	}
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int opcion;
		Tienda tienda = new Tienda();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("julio.g", "calaverita1", "Julio García", "34661102741",  "Avenida Cadena, 2, 6º A, C.P:435768", 1887, 2, 3345, 500000.00);
        Cliente cliente2 = new Cliente("jose.m", "remi88", "Jose Martinez", "5567453856",  "Calle Aljibe #12-4, C.P:5834950", 9586, 1, 5576,2800.00);
        Cliente cliente3 = new Cliente("mary.p", "nacional4tri", "Maria Perez", "557834647328",  " 1980 Fairfax Drive, Bayville, Z.C:08762", 5544, 3,9465, 3000.00);
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
								System.out.println(tienda.numberException()); 
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
							if(producto.getDepartamento() == seleccionado.getPais()){
								System.out.println(tienda.oferta() + producto.getPrecioDescuento(producto.getDepartamento()));
							}
							else{
								System.out.println(producto.getPrecio());
							}
							
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
						if(producto.getDepartamento() == seleccionado.getPais()){
							double precioDescuento= producto.getPrecioDescuento(producto.getDepartamento());
							System.out.println(tienda.oferta() + precioDescuento);

						}
						else{
							System.out.println(producto.getPrecio());
						}
						
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
								System.out.println(tienda.agregadoCarrito());	
			
								}
								else{
									tienda.noValido();
								}
							}while(seleccion <0 && seleccion>grupo.getTamano()+1);
								break;
								case 2:
								System.out.println(tienda.verificacion());
								ClienteProxy proxy = new ClienteProxy(seleccionado);
								double monto = 0;

								for(int j=0; j<carrito.size(); j++){
									if(carrito.get(j).getDepartamento() == seleccionado.getPais()){
										double precioDescuento= carrito.get(j).getPrecioDescuento(carrito.get(j).getDepartamento());
										monto = monto + precioDescuento;
									}else{
										monto = monto + carrito.get(j).getPrecio();
									}
								}
								while (true){
									try {
										String cuenta = sc.nextLine();
										opcion = Integer.parseInt(cuenta);
										break;
									}catch (NumberFormatException ex){
										System.out.println(tienda.numberException());
									}
								}
								boolean completada;
								if(proxy.getCuenta()==opcion){
									proxy.realizarCompra(monto);
									completada= proxy.actualizarEnReales();
									if(completada){
										System.out.println(tienda.completarCompra()
										);
										System.out.println(tienda.fecha());
									}
									else{
										System.out.println( tienda.saldoInsuficiente());
									}
									System.out.println(tienda.ticket());
									double total = 0;
									for(int o=0; o<carrito.size(); o++){

										System.out.println(carrito.get(o).getNombre());
										if(carrito.get(o).getDepartamento() == seleccionado.getPais()){
											double precioDescuento= carrito.get(o).getPrecioDescuento(carrito.get(o).getDepartamento());
											System.out.println(tienda.oferta() + precioDescuento);
											total = total + precioDescuento;
										}
										else{
											System.out.println(carrito.get(o).getPrecio());
											total = total + carrito.get(o).getPrecio();
										}
										// System.out.println(carrito.get(o).getCodigoBarras());
									}
									System.out.println(tienda.total() + total);
									System.out.println(tienda.despedirse()); 
									System.exit(0);
								}else{
									System.out.println( tienda.cuentaRechazada());
									System.exit(0);
								}

									break;
									
								case 3:
									System.out.println(tienda.despedirse());
									break;
			
								default:
									System.out.println(tienda.noValido());
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