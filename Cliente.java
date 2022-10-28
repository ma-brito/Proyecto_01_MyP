public class Cliente{
private String usuario;
private String contraseña;
private String nombre;
private String telefono;
private String direccion;
private int cuenta;
private int pais;
private int id;

/**
 * Constructor de la clase Cliente
 * @param usuario
 * @param contraseña
 * @param nombre
 * @param telefono
 * @param direccion
 * @param cuenta
 * @param pais
 * @param id
 */
public Cliente(String usuario, String contraseña, String nombre, String telefono, String direccion, int cuenta, int pais, int id){
    this.usuario = usuario;
    this.contraseña = contraseña;
    this.nombre = nombre;
    this.telefono = telefono;
    this.direccion = direccion;
    this.cuenta = cuenta;
    this.pais = pais;
    this.id = id;
}

/**
 * @return el usuario del cliente
 */
public String getUsuario(){
    return usuario;
}

/**
 * @return la contraseña del cliente
 */
public String getContraseña(){
    return contraseña;
}

/**
 * @return el nombre del cliente
 */
public String getNombre(){
    return nombre;
}

/**
 * @return el telefono del cliente
 */
public String getTelefono(){
    return telefono;
}

/**
 * @return la direccion del cliente
 */
public String getDireccion(){
    return direccion;
}

/**
 * @return la cuenta del cliente
 */
public int getCuenta(){
    return cuenta;
}

/**
 * @return el pais del cliente
 */
public int getPais(){
    return pais;
}

/**
 * @return el id del cliente
 */
public int getId(){
    return id;
}

/**
 * @return la informacion del cliente
 */
public String toString(){
    return ("***CLIENTE*** Usuario: " + usuario +
        " \nContraseña: " + contraseña  + "\nNombre: " + nombre + "\nTelefono: " + telefono + "\nDireccion: " + direccion + "\nCuenta: " + cuenta + "\nPais: " + pais + "\nId: " + id);
}
    
    }

