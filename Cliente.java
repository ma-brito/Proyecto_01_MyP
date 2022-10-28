public class Cliente{
private String usuario;
private String contrasena;
private String nombre;
private String telefono;
private String direccion;
private int cuenta;
private int pais;
private int id;
private double saldo;

/**
 * Constructor de la clase Cliente
 * @param usuario
 * @param contrasena
 * @param nombre
 * @param telefono
 * @param direccion
 * @param cuenta
 * @param pais
 * @param id
 */
public Cliente(String usuario, String contrasena, String nombre, String telefono, String direccion, int cuenta, int pais, int id, double saldo){
    this.saldo = saldo;
    this.usuario = usuario;
    this.contrasena = contrasena;
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
 * @return la contrasena del cliente
 */
public String getContrasena(){
    return contrasena;
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
        " \nContrasena: " + contrasena  + "\nNombre: " + nombre + "\nTelefono: " + telefono + "\nDireccion: " + direccion + "\nCuenta: " + cuenta + "\nPais: " + pais + "\nId: " + id);
}

public boolean completarCompra(double precio){
    //simulando un sistema seguro.
    System.out.println("***VERIFICANDO DATOS...***" + 
                        "\n***DATOS VERIFICADOS...***");
                        System.out.println("a");
    if(saldo >= precio){
        saldo -= precio;
        System.out.println("***COMPRA COMPLETADA***");
        return true;
    }else{
        System.out.println("***SALDO INSUFICIENTE***");
        return false;
    }
}
    
    }

