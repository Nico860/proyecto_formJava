/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appproyectoform;

/**
 *
 * @author CHAPTOPS TACTIC
 */

public class Venta {
    //se definen los atributos de la clase
    private String codigo;
    private Producto producto;
    private int cantidad;
    
    //se construye el constructor

    public Venta(String codigo,Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad; 
        this.codigo = codigo;
    }
    
    //se definen los metodos 
    public double total(){
        //devuelve el precio total de la venta
        return (double)cantidad * producto.getPrecio();
    }
    
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
}
