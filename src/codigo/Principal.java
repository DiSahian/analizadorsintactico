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
