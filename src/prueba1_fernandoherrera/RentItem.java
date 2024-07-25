/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_fernandoherrera;

/**
 *
 * @author herre
 */
public class RentItem {
    int codigo;
    String nombre;
    int precio_renta;
    int copias;

    public RentItem(int codigo, String nombre, int precio_renta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio_renta = precio_renta;
        this.copias = 0;
    }
    
    //Funcion toString 
    @Override
    public String toString (){
        return "Codigo: " + codigo + "\nNombre: " + nombre + "\nPrecio: " + precio_renta;
    }
    
    //Funciom Pago de Renta
    public double pagoRenta(int dias){
        return 0;
    }
    
    //Getters de los atributos de la clase
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio_renta() {
        return precio_renta;
    }
    
    public int getCopias(){
        return copias;
    }
    
    //Submenu
    public String subMenu(){
        return "1-Imprimir";
    }
    
    //Ejecutar
    public void ejecutarOpcion (int opcion){
        if (opcion == 1){
            System.out.println(this.toString());
        }
        else {
            System.out.println("Opcion no Valida");
        }
    }
}
