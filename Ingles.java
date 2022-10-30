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
     * Muestra un mensaje de seleccion
     * @return mensaje de seleccion
     */
    public String seleccion(){
        return "Please select the number in the catalog of the item that you'd like to buy";	
    }

    /**
     * Muestra un mensaje de oferta
     * @return oferta
     */
    public String oferta(){
        return "We have a special offer for you!\n";
    }
  
    /**
     * Muestra un mensaje de opciones de compra
     * @return mensaje de opciones de compra
     */
    public String opcionesCompra(){
        return "Select an option:\n1. Add to cart \n2. Buy cart\n3. Exit";
    }

     /**
     * Muestra una cadena de error por excepción Number exception
     * @return cadena de error
     */
    public String numberException(){
        return "Please enter a valid number";
    }

    /**
     * Muestra un mensaje de agregar al carrito
     * @return mensaje de agregar al carrito
     */
    public String agregadoCarrito(){
        return "Item added to cart";
    }

    /**
     * Muestra un mensaje de error por número no válido
     * @return mensaje de error por número no válido
     */
    public String noValido(){
        return "Please enter a valid number";
    }

    /**
     * Muestra un mensaje de verificación de ceunta
     * @return mensaje de verificación de ceunta
     */
    public String verificacion(){
        return "***ENTERGIN SAFE MODE***\nVerifying account...\nPlease enter your account number";
    }

    /**
     * Muestra mensaje de saldo insuficiente
     * @return mensaje de saldo insuficiente
     */
    public String saldoInsuficiente(){
        return "Insufficient funds";
    }

    /**
     * Muestra mensaje de cuenta rechazada
     * @return mensaje de cuenta rechazada
     */
    public String cuentaRechazada(){
        return "The account number that was provided does not match the actual number, exiting...";
    }

     /**
     * Muestra mensaje de ticket
     * @return mensaje de ticket
     */
    public String ticket(){
        return "Here is your ticket, thank you for your purchase";
    }

     /**
     * Muestra mensaje de total de compra
     * @return mensaje de total de compra
     */
    public String total(){
        return "Your total is: ";
    }

}
