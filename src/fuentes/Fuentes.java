/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuentes;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.InputStream;

/**
 *
 * @author moran
 */
public class Fuentes {
    
        public static Font cargarFuentes(String rutaRecurso, float tamano){ 
            Font fuente = null;
            try {
                
                InputStream is = Fuentes.class.getResourceAsStream(rutaRecurso);
                
                if (is == null){
                    return new Font("Arial", Font.PLAIN, (int) tamano);
                }
                
                fuente = Font.createFont(Font.TRUETYPE_FONT, is);
                
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                ge.registerFont(fuente);
                
                fuente = fuente.deriveFont(tamano);
                
            } catch (Exception e){
                e.printStackTrace();
                fuente = new Font("Arial", Font.PLAIN, (int) tamano);
            }
            return fuente;
        }
    
}
