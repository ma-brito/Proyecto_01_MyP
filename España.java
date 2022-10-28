import java.time.LocalDate;
import java.util.*;
public class España implements Idioma {
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
        return "Venga ya! Tenemos una oferta especial para ti!\n";
    }
    
}
