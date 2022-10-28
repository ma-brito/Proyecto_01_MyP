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
    
}
