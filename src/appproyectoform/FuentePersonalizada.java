/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appproyectoform;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.InputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author CHAPTOPS TACTIC
 */
public class FuentePersonalizada {
    public static Font fuentePersonalizada(){
        try {
            String ruta = "Fuentes/VIDEOPHREAK.ttf";
 
            InputStream is = FuentePersonalizada.class.getClassLoader().getResourceAsStream(ruta);
            
            if (is == null) {
                throw new RuntimeException("No se encontró la fuente en la ruta: " + ruta);
            }
            
            // Crear la fuente indicando el formato (en este caso TRUETYPE_FONT)
            Font fuente = Font.createFont(Font.TRUETYPE_FONT, is);
            return fuente.deriveFont(18f); // Opcional: ajustar el tamaño
        } catch (Exception e) {
            System.out.println("No se pudo cargar");
        }
        return new Font("Serif", Font.PLAIN, 12);
    }
}
