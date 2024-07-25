/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_fernandoherrera;

import java.util.Calendar;

/**
 *
 * @author herre
 */
public class PS3Game extends RentItem {
    
    private Calendar fecha_publicacion = Calendar.getInstance();
    
    public PS3Game(int codigo, String nombre) {
        super(codigo, nombre, 50);
        this.fecha_publicacion = fecha_publicacion;
    }
    

    public Calendar getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Calendar fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }
    
    @Override
    public String toString (){
        return this.toString() + "- PS3 Game";
    }
    
    public void setFechaPublicacion (int year, int mes, int dia){
        this.fecha_publicacion.set(year, mes, dia);
    }
    
    @Override
    public double pagoRenta (int dia){
        return getPrecio_renta() * dia;
    }
    
}
