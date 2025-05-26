<<<<<<< Updated upstream
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author disah
 */
public class Principal {

    
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:/Users/disah/OneDrive/Desktop/ASv5/src/codigo/Lexer.flex";
                        //C:\Users\disah\OneDrive\Desktop\ASv5
        String ruta2 = "C:/Users/disah/OneDrive/Desktop/ASv5/src/codigo/LexerCup.flex";
                        //C:/Users/disah/OneDrive/Desktop/ANALIZADOR_SIN/ASv2
        String[] rutaS = {"-parser", "Sintax", "-interface", "C:/Users/disah/OneDrive/Desktop/ASv5/src/codigo/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws Exception{
    File archivo;
        archivo = new File(ruta1);
    JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
    //Generar parte sintactica
        JFlex.Main.generate(archivo);
    java_cup.Main.main(rutaS);
    
    
    Path rutaSym = Paths.get("C:/Users/disah/OneDrive/Desktop/ASv5/src/codigo/sym.java");
    if (Files.exists(rutaSym)){
        Files.delete(rutaSym);
    }
    //mover archivos pq se generan fuera del paquete de codigo
        Files.move(Paths.get("C:/Users/disah/OneDrive/Desktop/ASv5/sym.java"), 
                Paths.get("C:/Users/disah/OneDrive/Desktop/ASv5/src/codigo/sym.java")
        );
        
        
    Path rutaSin = Paths.get("C:/Users/disah/OneDrive/Desktop/ASv5/src/codigo/Sintax.java");
    if (Files.exists(rutaSin)){
        Files.delete(rutaSin);
    }    
        Files.move(Paths.get("C:/Users/disah/OneDrive/Desktop/ASv5/Sintax.java"), 
                Paths.get("C:/Users/disah/OneDrive/Desktop/ASv5/src/codigo/Sintax.java")
        );
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author disah
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        String ruta = "E:/proyectos_activos/analizadorsintactico/src/codigo/LexerCup.flex";
        String rutal = "E:/proyectos_activos/analizadorsintactico/src/codigo/Lexer.flex";
        // C:/Users/disah/OneDrive/Desktop/ANALIZADOR_SIN/ASv2
        String[] rutaS = { "-parser", "parser", "E:/proyectos_activos/analizadorsintactico/src/codigo/Sintax.cup" };
        generar(rutal,ruta, rutaS);
    }

    public static void generar(String rutaLexer, String rutaCL, String[] rutaS) throws Exception {
        // Generar parte sintactica
        jflex.Main.generate(new String[] { rutaLexer });
        jflex.Main.generate(new String[] { rutaCL });
        java_cup.Main.main(rutaS);
    }
}
>>>>>>> Stashed changes
