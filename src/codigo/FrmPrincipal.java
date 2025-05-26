/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

import codigo.Lexer;
import codigo.Tokens;
import static codigo.Tokens.ACCESO;
import static codigo.Tokens.ALIAS;
import static codigo.Tokens.ALTO;
import static codigo.Tokens.ARGUMENTO;
import static codigo.Tokens.ARREGLOS;
import static codigo.Tokens.BLOCKCHAIN;
import static codigo.Tokens.CICLO;
import static codigo.Tokens.COMA;
import static codigo.Tokens.CONCURRENCIA;
import static codigo.Tokens.CONJUNTOS;
import static codigo.Tokens.CONTEXTO;
import static codigo.Tokens.CONTROL_FLOW;
import static codigo.Tokens.DATOS_BOOLEANOS;
import static codigo.Tokens.DATOS_CARACTERES;
import static codigo.Tokens.DATOS_COBOL;
import static codigo.Tokens.DATOS_DECIMALES;
import static codigo.Tokens.DATOS_ENTEROS;
import static codigo.Tokens.DATOS_NULOS;
import static codigo.Tokens.DATOS_TEXTO;
import static codigo.Tokens.DEBUG;
import static codigo.Tokens.DECLARAR;
import static codigo.Tokens.DICCIONARIOS;
import static codigo.Tokens.ENTRADA_Y_SALIDA;
import static codigo.Tokens.ERROR;
import static codigo.Tokens.ESTRUCTURAS;
import static codigo.Tokens.EXCEPCIONES;
import static codigo.Tokens.GENERICOS;
import static codigo.Tokens.HARDWARE;
import static codigo.Tokens.HERENCIA;
import static codigo.Tokens.INTERFACES_GRAFICAS;
import static codigo.Tokens.MANEJO_DE_MEMORIA;
import static codigo.Tokens.MODULARIDAD;
import static codigo.Tokens.OPERADOR;
import static codigo.Tokens.OPERADORES_LOGICOS;
import static codigo.Tokens.OPERADORES_RELACIONALES;
import static codigo.Tokens.PATRONES_DE_DISENO;
import static codigo.Tokens.PERSISTENCIA;
import static codigo.Tokens.PRECISION;
import static codigo.Tokens.REDES;
import static codigo.Tokens.REFERENCIA;
import static codigo.Tokens.REFLEXION;
import static codigo.Tokens.RETORNO;
import static codigo.Tokens.SALTO;
import static codigo.Tokens.SEGURIDAD;
import static codigo.Tokens.SERIALIZACION;
import static codigo.Tokens.SI;
import static codigo.Tokens.SINO;
import static codigo.Tokens.SWITCH;
import static codigo.Tokens.TESTING;
import static codigo.Tokens.TIEMPO;
import static codigo.Tokens.ID;
import static codigo.Tokens.NUM;
import static codigo.Tokens.OPERADORES_ARITMETICOS;
import static codigo.Tokens.COMILLAS;
import static codigo.Tokens.INC_DEC;
import static codigo.Tokens.PAR_IZQ;
import static codigo.Tokens.PAR_DER;
import static codigo.Tokens.LLAVE_IZQ;
import static codigo.Tokens.LLAVE_DER;
import static codigo.Tokens.CORCH_IZQ;
import static codigo.Tokens.CORCH_DER;
import static codigo.Tokens.IGUAL;
import static codigo.Tokens.PUNTO_COMA;
import static codigo.Tokens.COMILLAS;
import static codigo.Tokens.CONCURRENCIA;
import static codigo.Tokens.CONJUNTOS;
import static codigo.Tokens.CONTEXTO;
import static codigo.Tokens.CONTROL_FLOW;
import static codigo.Tokens.CORCH_DER;
import static codigo.Tokens.CORCH_IZQ;
import static codigo.Tokens.DATOS_BOOLEANOS;
import static codigo.Tokens.DATOS_CARACTERES;
import static codigo.Tokens.DATOS_COBOL;
import static codigo.Tokens.DATOS_DECIMALES;
import static codigo.Tokens.DATOS_ENTEROS;
import static codigo.Tokens.DATOS_NULOS;
import static codigo.Tokens.DATOS_TEXTO;
import static codigo.Tokens.DEBUG;
import static codigo.Tokens.DECLARAR;
import static codigo.Tokens.DICCIONARIOS;
import static codigo.Tokens.DOS_PUNTOS;
import static codigo.Tokens.ENTRADA_Y_SALIDA;
import static codigo.Tokens.ERROR;
import static codigo.Tokens.ESTRUCTURAS;
import static codigo.Tokens.EXCEPCIONES;
import static codigo.Tokens.FIN;
import static codigo.Tokens.INICIO;
import static codigo.Tokens.GENERICOS;
import static codigo.Tokens.HARDWARE;
import static codigo.Tokens.HERENCIA;
import static codigo.Tokens.ID;
import static codigo.Tokens.IGUAL;
import static codigo.Tokens.INC_DEC;
import static codigo.Tokens.INICIO;
import static codigo.Tokens.INTERFACES_GRAFICAS;
import static codigo.Tokens.LLAVE_DER;
import static codigo.Tokens.LLAVE_IZQ;
import static codigo.Tokens.MANEJO_DE_MEMORIA;
import static codigo.Tokens.MODULARIDAD;
import static codigo.Tokens.NUM;
import static codigo.Tokens.OPERADOR;
import static codigo.Tokens.OPERADORES_ARITMETICOS;
import static codigo.Tokens.OPERADORES_LOGICOS;
import static codigo.Tokens.OPERADORES_RELACIONALES;
import static codigo.Tokens.PAR_DER;
import static codigo.Tokens.PAR_IZQ;
import static codigo.Tokens.PATRONES_DE_DISENO;
import static codigo.Tokens.PERSISTENCIA;
import static codigo.Tokens.PRECISION;
import static codigo.Tokens.PUNTO_COMA;
import static codigo.Tokens.REDES;
import static codigo.Tokens.REFERENCIA;
import static codigo.Tokens.REFLEXION;
import static codigo.Tokens.RETORNO;
import static codigo.Tokens.SALTAR;
import static codigo.Tokens.SALTO;
import static codigo.Tokens.SEGURIDAD;
import static codigo.Tokens.SERIALIZACION;
import static codigo.Tokens.SI;
import static codigo.Tokens.SINO;
import static codigo.Tokens.SWITCH;
import static codigo.Tokens.TESTING;
import static codigo.Tokens.TIEMPO;


import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import java.util.HashMap;
import java_cup.runtime.Symbol;

/**
 *
 * @author disah
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private static HashMap<String, Integer> mapaIds = new HashMap<>();

public static int insertID(String id) {
    if (!mapaIds.containsKey(id)) {
        mapaIds.put(id, mapaIds.size());
    }
    return mapaIds.get(id);
}

    
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();
        btnAbrir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnAnalizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAnalizar2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtResultado2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jScrollPane1.setForeground(new java.awt.Color(204, 255, 204));

        txtMostrar.setBackground(new java.awt.Color(255, 204, 204));
        txtMostrar.setColumns(20);
        txtMostrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtMostrar.setForeground(new java.awt.Color(0, 153, 204));
        txtMostrar.setRows(5);
        jScrollPane1.setViewportView(txtMostrar);

        btnAbrir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(153, 153, 255));
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecciona tu archivo");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbrir)
                .addGap(24, 24, 24))
        );

        jScrollPane3.setForeground(new java.awt.Color(204, 255, 204));

        txtResultado.setBackground(new java.awt.Color(255, 204, 204));
        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(0, 153, 204));
        txtResultado.setRows(5);
        jScrollPane3.setViewportView(txtResultado);

        btnAnalizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAnalizar.setForeground(new java.awt.Color(153, 153, 255));
        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Analizador Léxico");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnalizar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnAnalizar2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAnalizar2.setForeground(new java.awt.Color(153, 153, 255));
        btnAnalizar2.setText("Analizar");
        btnAnalizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizar2ActionPerformed(evt);
            }
        });

        jScrollPane4.setForeground(new java.awt.Color(204, 255, 204));

        txtResultado2.setBackground(new java.awt.Color(255, 204, 204));
        txtResultado2.setColumns(20);
        txtResultado2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtResultado2.setForeground(new java.awt.Color(0, 153, 204));
        txtResultado2.setRows(5);
        jScrollPane4.setViewportView(txtResultado2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Analizador Sintáctico");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 98, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(88, 88, 88))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnalizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnalizar2)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ANALISISLEXICO() throws IOException{
    //contador de lineas
        int contador = 1;
    
    //Extraer lo del texto que se abrió.    
    String extract = (String) txtMostrar.getText();
    //Se pasa al lexer
    Lexer lexer = new Lexer (new StringReader (extract));
    //Parte visual del análisis
    String resultado = "LINEA" + contador + "\t\tSIMBOLO\n";
    
    while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    txtResultado.setText(resultado);
                    return;
                }
                switch (tokens) {
    case ERROR:
        resultado += lexer.lexeme + ": Símbolo no definido\n";
        break;

    case ACCESO: case ALIAS: case ALTO: case ARGUMENTO: 
    case ARREGLOS: case BLOCKCHAIN: case CICLO:
    case CONCURRENCIA: case CONJUNTOS: case CONTEXTO:
    case CONTROL_FLOW: case DATOS_BOOLEANOS: case DATOS_CARACTERES:
    case DATOS_COBOL: case DATOS_DECIMALES: case DATOS_ENTEROS:
    case DATOS_NULOS: case DATOS_TEXTO: case DEBUG: 
    case DECLARAR: case DICCIONARIOS: case ENTRADA_Y_SALIDA:
    case ESTRUCTURAS: case EXCEPCIONES: case GENERICOS:
    case HARDWARE: case HERENCIA: case INTERFACES_GRAFICAS: 
    case MANEJO_DE_MEMORIA:
    case MODULARIDAD: case OPERADOR: case OPERADORES_ARITMETICOS:
    case OPERADORES_LOGICOS: case OPERADORES_RELACIONALES: 
    case PATRONES_DE_DISENO: case PERSISTENCIA:
    case PRECISION: case REDES: case REFERENCIA: case REFLEXION:
    case RETORNO: case SALTO: case SEGURIDAD: case SERIALIZACION:
    case SI: case SINO: case SWITCH: case TESTING:
    case TIEMPO: case COMILLAS: case INC_DEC: case PAR_IZQ: case PAR_DER:
    case LLAVE_IZQ: case LLAVE_DER: case CORCH_IZQ: case CORCH_DER:
    case IGUAL: case PUNTO_COMA: case COMA: case DOS_PUNTOS: case INICIO:
    case FIN: case SALTAR:
        resultado += lexer.lexeme + " - Token: " + tokens + "\n";
        break;

    case NUM:
        resultado += lexer.lexeme + " : es un número \n";
        break;

    case ID:
        int position = insertID(lexer.lexeme);
        resultado += lexer.lexeme + " : es un identificador - Valor atrib: " + position + "\n";
        break;

    default:
        resultado += lexer.lexeme + " - Token no reconocido: " + tokens + "\n";
        break;
        }
            }
                }
    
    
    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser elegirarchivo = new JFileChooser();
        elegirarchivo.showOpenDialog(null);
        File archivo = new File(elegirarchivo.getSelectedFile().getAbsolutePath());
        
        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtMostrar.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        // TODO add your handling code here:
        try {
            ANALISISLEXICO();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnAnalizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizar2ActionPerformed
        // TODO add your handling code here:
    String ST = txtMostrar.getText();
    Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));
    
    try {
        s.parse();
        // Si todo es correcto
        txtResultado2.setText("Sintáxis correcta");
        txtResultado2.setForeground(new Color(82, 183, 136));
    } catch (Exception ex) {
        // Obtener información del error
        String errorMessage = "Sintáxis INCORRECTA";
        
        // Verificar si es un error de sintaxis (ParseException)
        if (ex instanceof Exception) { // o ParseException si estás usando JavaCUP
            Symbol NF = s.getS();
            errorMessage += ", Línea: " + (NF.right + 1) + 
                           " Columna: " + (NF.left + 1) + 
                           ", Texto: \"" + NF.value + "\"";
            
            // Intentar obtener lo que se esperaba
            if (ex.getMessage() != null) {
                errorMessage += "\nSe esperaba: " + extractExpectedTokens(ex.getMessage());
            }
        } else {
            errorMessage += ": " + ex.getMessage();
        }
        
        txtResultado2.setText(errorMessage);
        txtResultado2.setForeground(new Color(255, 105, 97));
    }
}

// Método auxiliar para extraer los tokens esperados del mensaje de error
private String extractExpectedTokens(String errorMessage) {
    // Este método depende de cómo JavaCUP formatea los mensajes de error
    // Por lo general, los mensajes contienen "Syntax error: expected X, Y or Z"
    
    // Ejemplo de implementación básica:
    if (errorMessage.contains("expected")) {
        return errorMessage.substring(errorMessage.indexOf("expected") + 8);
    }
    return "No se pudo determinar qué se esperaba";
    }//GEN-LAST:event_btnAnalizar2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnAnalizar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtMostrar;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextArea txtResultado2;
    // End of variables declaration//GEN-END:variables
}
