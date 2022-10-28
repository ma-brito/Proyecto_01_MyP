import java.time.LocalDate;
public class Ingles implements Idioma{
     /**
     * Saluda al usuario
     * @return saludo en el idioma
     */
    public String saludar(){
        return "Hello, welcome to your trusted online store where you can find your favorite products, can I help you with anything?";
    }
    /**
     * Despedida al usuario
     * @return despedida en el idioma
     */
    public String despedirse(){
        return "We hope that all your products are cool, here a cup broke and everyone to their house, come back soon.";
    }

     /**
     * Muestra el total de la compra
     * @return total de la compra
     */
    public String completarCompra(){
        return "It's yours! Purchase completed";
    }

    /**
     * Muestra la fecha de entrega
     * @return fecha de entrega
     */
    public String fecha(){
        return "We will send it to you as soon as possible! Estimated delivery date:" +LocalDate.now().plusDays(3) + "\n";
    }

    /**
     * Muestra el menu de opciones
     * @return menu de opciones
     */
    public String menu(){
        return "Select an option:\n1. See catalog \n2. Make a purchase\n3. Exit";
    }

    /**
     * Muestra un mensaje de oferta
     * @return oferta
     */
    public String oferta(){
        return "We have a special offer for you!\n";
    }
  
}
