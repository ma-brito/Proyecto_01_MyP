import java.util.Iterator;

public class Catalogo {
    private GrupoProducto catalogo = new GrupoProducto();
    /**
 * Constructor para objetos de la clase Catalogo
 */
public Catalogo() {
    catalogo = new GrupoProducto();

}

/**
 * @return el iterador del catalogo
 */
public Iterator getIteradorCatalogo() {
    return catalogo.getIterator();
}
}


