public class Producto{
        
        private String nombre;
        private double precio;
        private int departamento;
        private String codigoBarras;
    
        /**
         * Constructor de la clase Producto
         * @param nombre
         * @param precio
         * @param departamento
         * @param codigoBarras
         */
        public Producto(String nombre, double precio, int departamento, String codigoBarras){
            this.nombre = nombre;
            this.precio = precio;
            this.departamento = departamento;
            this.codigoBarras = codigoBarras;
        }
    
        /**
         * @return la informacion del producto
         */
        public String toString(){
            return ("***ARTICULO*** Nombre: " + nombre +
                " \nPrecio: " + precio  + "\nCodigo de Barras: " + codigoBarras);

        }
        
        /**
         * @return el precio del producto
         */
        public double getPrecio(){
            return precio;
        }

        public double getPrecioDescuento(int i){
            if(i==1){
                return precio*0.9;
            }
            else if(i==2){
                return precio*0.8;
            }
            else if(i==3){
                return precio*0.7;
            }
            return precio;
        }

        /**
         * @return el nombre del producto
         */
        public String getCodigoBarras(){
            return codigoBarras;
        }

        /**
         * @return el departamento del producto
         */
        public int getDepartamento(){
            return departamento;
        }
        
        /**
         * @return el nombre del producto
         */
        public String getNombre(){
            return nombre;
        }



}