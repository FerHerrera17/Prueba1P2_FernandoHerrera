/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_fernandoherrera;

import java.util.Scanner;

/**
 *
 * @author herre
 */
public class Movie extends RentItem {
    private String estado = "ESTRENO";

    public Movie(int codigo, String nombre, int precio_renta) {
        super(codigo, nombre, precio_renta);
        
    }

    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString (){
        return this.toString() + "\nEstado: " + estado + " - Movie";
    }
    
    @Override
    public double pagoRenta (int dias){
        double precio1 = super.getPrecio_renta();
        
        if (estado.equalsIgnoreCase("ESTRENO") && dias > 2){
            return precio1 = dias*50;
        }
        else if (!estado.equalsIgnoreCase("ESTRENO") && dias > 5){
            return precio1 = dias * 30;
        }
        return precio1;
    }
    
    @Override
    public String subMenu (){
        return super.subMenu() + "\n2-Cambiar Estado";
    }
    
    @Override
    public void ejecutarOpcion (int opcion){
        Scanner read = new Scanner (System.in);
        if (opcion == 1){
            System.out.println(this.toString());
        }
        else if (opcion == 2){
            System.out.println("Ingrese el nuevo estado: ");
            String nuevo_estado = read.nextLine();
            this.setEstado(nuevo_estado);
        }
        else {
            System.out.println("Opcion no Valida");
        }
    }
    
    
    
    
    
    
}
