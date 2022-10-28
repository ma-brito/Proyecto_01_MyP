import java.time.LocalDate;
public class Espana implements Idioma {
    /**
     * Saluda al usuario
     * @return saludo en el idioma
     */
    public String saludar(){
        return "Buenas chaval, espero que la estes pasando muy guay. Bienvenido a tu tienda en línea de confianza en donde podrás encontrar tus productos favoritos. ¿Te puedo ayudar en algo tio?\n";
    }
    /**
     * Despedida al usuario
     * @return despedida en el idioma
     */
    public String despedirse(){
        return "Esperamos que todos tus productos te hayan molado\n";
    }

     /**
     * Muestra el total de la compra
     * @return total de la compra
     */
    public String completarCompra(){
        return "muchas gracias, por tu compra. Ha sido completada\n";
    }

    /**
     * Muestra la fecha de entrega
     * @return fecha de entrega
     */
    public String fecha(){
        return "Fecha de entrega estimada:\n"+LocalDate.now().plusDays(3) + "\n";
    }

    /**
     * Muestra el menu de opciones
     * @return menu de opciones
     */
    public String menu(){
        return "Tio, qué deseas hacer?:\n1. Ver catálogo \n2. Relizar una compra\n3. Salir";
    }

    /**
     * Muestra un mensaje de oferta
     * @return oferta
     */
    public String oferta(){
        return "Bravo! Tenemos una oferta especial para ti!\n";
    }


    /**
     * Muestra un mensaje de seleccion
     * @return mensaje de seleccion
     */
    public String seleccion(){
        return "Chaval, selecciona el producto que deseas comprar:";
    }
/**
     * Muestra un mensaje de opciones de compra
     * @return mensaje de opciones de compra
     */
    public String opcionesCompra() {
        return "¿Qué deseas hacer?:\n1. Agregar un producto al carrito \n2. Relizar una compra\n3. Salir";
    }
}
