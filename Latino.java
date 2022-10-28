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
        return "¿Qué deseas hacer?:\n1. Ver catálogo \n2. Relizar una compra\n3. Salir";
    }
}
