public interface Idioma {
    /**
     * Saluda al usuario
     * @return saludo en el idioma
     */
    public String saludar();
    /**
     * Despedida al usuario
     * @return despedida en el idioma
     */
    public String despedirse();

     /**
     * Muestra el total de la compra
     * @return total de la compra
     */
    public String completarCompra();

    /**
     * Muestra la fecha de entrega
     * @return fecha de entrega
     */
    public String fecha();

    /**
     * Muestra el menu de opciones
     * @return menu de opciones
     */
    public String menu();

    /**
     * Muestra un mensaje de oferta
     * @return oferta
     */
    public String oferta();

    /**
     * Muestra un mensaje de seleccion
     * @return mensaje de seleccion
     */
    public String seleccion();

    /**
     * Muestra un mensaje de opciones de compra
     * @return mensaje de opciones de compra
     */
    public String opcionesCompra();
    
    /**
     * Muestra una cadena de error por excepción Number exception
     * @return cadena de error
     */
    public String numberException();

    /**
     * Muestra un mensaje de agregar al carrito
     * @return mensaje de agregar al carrito
     */
    public String agregadoCarrito();

    /**
     * Muestra un mensaje de error por número no válido
     * @return mensaje de error por número no válido
     */
    public String noValido();

    /**
     * Muestra un mensaje de verificación de ceunta
     * @return mensaje de verificación de ceunta
     */
    public String verificacion();

    /**
     * Muestra mensaje de saldo insuficiente
     * @return mensaje de saldo insuficiente
     */
    public String saldoInsuficiente();

    /**
     * Muestra mensaje de cuenta rechazada
     * @return mensaje de cuenta rechazada
     */
    public String cuentaRechazada();

     /**
     * Muestra mensaje de ticket
     * @return mensaje de ticket
     */
    public String ticket();

}
