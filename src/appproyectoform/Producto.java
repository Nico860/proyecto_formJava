/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appproyectoform;

/**
 *
 * @author CHAPTOPS TACTIC
 */
public class Producto {
    //se definen los atributos
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    
    //se construye el constructor
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    //se definen los metodos

    public boolean descontar_de_stock(int cantidad){
        //se valida que haiga stock suficiente
        if(cantidad > stock) return false;
        //se descuenta del stock
        stock -= cantidad;
        return true;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
}
