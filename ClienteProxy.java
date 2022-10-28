import java.io.Serializable;

public class ClienteProxy implements Serializable, InterfazCliente{
	private Cliente clienteReal;
	private double monto;

	public ClienteProxy(Cliente ClienteReal){
		this.clienteReal = ClienteReal;
	}

	public void realizarCompra(double monto){
		this.monto = monto;
	}

	public void actualizarEnReales(){
		clienteReal.completarCompra(monto);
	}

	public int getCuenta(){
		return clienteReal.getCuenta();
	}
}