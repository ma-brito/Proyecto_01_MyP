import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Iterator;

public class GrupoProducto{
	private ArrayList<Producto> Productos = new ArrayList<>();

	public GrupoProducto(){

		Producto Producto1 = new Producto("Pescado", 120, 1, "3443536");
		Producto Producto2 = new Producto("Carne", 70, 1, "3366456");
		Producto Producto3 = new Producto("Refresco", 50, 1, "3372638");
		Producto Producto4 = new Producto("Licuadora", 2300, 2, "4573023");
		Producto Producto5 = new Producto("Refrigerador", 7500, 2, "45873634");
		Producto Producto6 = new Producto("Lavadora", 6000, 2, "45739340");
		Producto Producto7 = new Producto("Celular", 6500, 3, "5934592");
		Producto Producto8 = new Producto("Tablet", 3500, 3, "57362342");
		Producto Producto9 = new Producto("Laptop", 12000, 3, "57374923");
		Producto Producto10 = new Producto("Juguete", 250, 4, "743993433");
		Producto Producto11 = new Producto("Hueso", 100, 4, "73423242");
		Producto Producto12 = new Producto("Comida de Perro", 70, 4, "79443098");
		Productos.add(Producto1);
		Productos.add(Producto2);
		Productos.add(Producto3);
		Productos.add(Producto4);
		Productos.add(Producto5);
		Productos.add(Producto6);
		Productos.add(Producto7);
		Productos.add(Producto8);
		Productos.add(Producto9);
		Productos.add(Producto10);
		Productos.add(Producto11);
		Productos.add(Producto12);
	}

	public Iterator getIterator(){
		return Productos.iterator();
	}

	public Producto getProducto(int i){
		return Productos.get(i);
	}
}