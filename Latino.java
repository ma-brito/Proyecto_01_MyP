import java.time.LocalDate;
public class Latino implements Idioma {

    /**
     * Saluda al usuario
     * @return saludo en el idioma
     */
    public String saludar() {
        return" ¿Qué onda?, espero que estes pasando un dia chido. Bienvenido a tu tienda en línea de confianza en donde podrás encontrar tus productos favoritos. ¿Te puedo ayudar en algo? ";
    }


    /**
     * Despedida al usuario
     * @return despedida en el idioma
     */
    public String despedirse() {
        return "Esperamos que todos tus productos estén chidos, aquí se rompió una taza y cada quien para su casa, vuelva pronto .";
    }

    /**
     * Muestra el total de la compra
     * @return total de la compra
     */
    public String completarCompra() {
        return "Es tuyo! Compra completada";
    }

    /**
     * Muestra la fecha de entrega
     * @return fecha de entrega
     */
    public String fecha() {
        return "Te lo enviaremos lo mas pronto posible! Fecha de entrega estimada:" + LocalDate.now().plusDays(3)+ "\n";
    }

    /**
     * Muestra el menu de opciones
     * @return menu de opciones
     */
    public String menu() {
        return "Qué deseas hacer?:\n1. Ver catálogo \n2. Relizar una compra\n3. Salir";
    }

    /**
     * Muestra un mensaje de oferta
     * @return oferta
     */
    public String oferta() {
        return "¡Tenemos una oferta especial para ti! \n";
    }

    /**
     * Muestra un mensaje de seleccion
     * @return mensaje de seleccion
     */
    public String seleccion() {
        return "Por favor selecciona el producto que deseas comprar:";
    }
    /**
     * Muestra un mensaje de opciones de compra
     * @return mensaje de opciones de compra
     */
    public String opcionesCompra() {
        return "¿Qué deseas hacer?:\n1. Agregar artículo a carrito \n2. Relizar la compra del carrito\n3. Salir";
    }

     /**
     * Muestra una cadena de error por excepción Number exception
     * @return cadena de error
     */
    public String numberException(){
        return "Por favor ingresa un número";
    }

    /**
     * Muestra un mensaje de agregar al carrito
     * @return mensaje de agregar al carrito
     */
    public String agregadoCarrito(){
        return "Ya casi es tuyo! Agregado al carrito";
    }

    /**
     * Muestra un mensaje de error por número no válido
     * @return mensaje de error por número no válido
     */
    public String noValido(){
        return "Chin! Por favor ingresa un numero valido";
    }

    /**
     * Muestra un mensaje de verificación de ceunta
     * @return mensaje de verificación de ceunta
     */
    public String verificacion(){
        return "***PASANDO A MODO SEGURO***\nVerificando cuenta...\nPor favor ingresa tu numero de cuenta:";
    }

    /**
     * Muestra mensaje de saldo insuficiente
     * @return mensaje de saldo insuficiente
     */
    public String saldoInsuficiente(){
        return "Chale! No tienes suficiente dinero en tu cuenta";
    }

    /**
     * Muestra mensaje de cuenta rechazada
     * @return mensaje de cuenta rechazada
     */
    public String cuentaRechazada(){
        return "Vaya, vaya, ese no es el numero de cuenta correcta. Adios";
    }


    /**
     * Muestra mensaje de ticket
     * @return mensaje deticket
     */
    public String ticket(){
        return "Aquí tienes tu ticket:";
    }

}
