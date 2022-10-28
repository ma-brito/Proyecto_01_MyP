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

     /**
     * Muestra una cadena de error por excepción Number exception
     * @return cadena de error
     */
    public String numberException(){
        return "Vamos ya, ingresa un número";
    }

    /**
     * Muestra un mensaje de agregar al carrito
     * @return mensaje de agregar al carrito
     */
    public String agregadoCarrito(){
        return "Guay! Producto agregado al carrito";
    }

    /**
     * Muestra un mensaje de error por número no válido
     * @return mensaje de error por número no válido
     */
    public String noValido(){
        return "Vamos ya, ingresa un número válido";
    }

    /**
     * Muestra un mensaje de verificación de ceunta
     * @return mensaje de verificación de ceunta
     */
    public String verificacion(){
        return "***PASANDO A MODO SEGURO***\n Queremos verificar que eres el propietario de la cuenta\nPor favor ingresa tu numero de cuenta:";
    }

    /**
     * Muestra mensaje de saldo insuficiente
     * @return mensaje de saldo insuficiente
     */
    public String saldoInsuficiente(){
        return "Tio, lo siento, tu saldo es insuficiente para realizar esta compra";
    }

    /**
     * Muestra mensaje de cuenta rechazada
     * @return mensaje de cuenta rechazada
     */
    public String cuentaRechazada(){
        return "Numero de cuenta incorrecta. Adios";
    }

    /**
     * Muestra mensaje de compra exitosa
     * @return mensaje de compra exitosa
     */
    public String ticket(){
        return "Compra exitosa. Aquí esta tu ticket:";
    }

}
