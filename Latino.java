import java.time.LocalDate;
public class Latino implements Idioma {
    public String saludar() {
        return" ¿Qué onda?, espero que estes pasando un dia chido. Bienvenido a tu tienda en línea de confianza en donde podrás encontrar tus productos favoritos. ¿Te puedo ayudar en algo? ";
    }

    public String despedirse() {
        return "Esperamos que todos tus productos estén chidos, aquí se rompió una taza y cada quien para su casa, vuelva pronto .";
    }
    public String completarCompra() {
        return "Es tuyo! Compra completada";
    }
    public String fecha() {
        return "Te lo enviaremos lo mas pronto posible! Fecha de entrega estimada:" + LocalDate.now().plusDays(3)+ "\n";
    }

    public String menu() {
        return "Qué deseas hacer?:\n1. Ver catálogo \n2. Relizar una compra\n3. Salir";
    }

    public String oferta() {
        return "¡Tenemos una oferta especial para ti! \n";
    }
}
