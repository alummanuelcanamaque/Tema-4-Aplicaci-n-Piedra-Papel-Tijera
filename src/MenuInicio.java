

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class MenuInicio extends javax.swing.JFrame {    
    int numero_Partidas;
    Color color;
    /**
     * Creates new form Main
     */
    public MenuInicio() {
        initComponents();
        setLocationRelativeTo(null);
        //Icono de la ventana
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage()); 
        //Rellenamos el campo del nombre automaticamente si no es la primera vez que se abre la ventana.
        if(!Juego.getNombre().contains("Jugador")){
            texto_Nombre.setText(Juego.getNombre());
        }
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_Jugar = new javax.swing.JButton();
        selector_Estilo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        texto_Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        selector_Partidas = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        selector_Color = new javax.swing.JComboBox();
        boton_Instrucciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Piedra Papel Tijeras");
        setMaximizedBounds(new java.awt.Rectangle(650, 452, 650, 452));
        setMinimumSize(new java.awt.Dimension(650, 452));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Jugar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boton_Jugar.setText("Jugar");
        boton_Jugar.setPreferredSize(new java.awt.Dimension(175, 37));
        boton_Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_JugarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_Jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 170, -1));

        selector_Estilo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        selector_Estilo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Piedra Papel Tijera", "Piedra Papel Tijera Lagarto Spock" }));
        getContentPane().add(selector_Estilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("Elige el estilo de juego:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 300, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("Introduzca su nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 200, -1));

        texto_Nombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(texto_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 110, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Selecciona el número de partidas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 190, -1));

        selector_Partidas.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        selector_Partidas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mejor de 3", "Mejor de 5", "Mejor de 9" }));
        getContentPane().add(selector_Partidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("Selecciona tu color:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        selector_Color.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Azul", "Rojo", "Verde", "Amarillo" }));
        getContentPane().add(selector_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        boton_Instrucciones.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton_Instrucciones.setText("Instrucciones");
        boton_Instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_InstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(boton_Instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_JugarActionPerformed
        //Comprobamos que el nombre introducido es correcto
        boolean correcto = true;        
        if(!texto_Nombre.getText().isEmpty() && (texto_Nombre.getText().length()<15)){
            Juego.setNombre(texto_Nombre.getText());
        }else{
            if(!texto_Nombre.getText().isEmpty() && (texto_Nombre.getText().length()>15)){
                JOptionPane.showMessageDialog(this,"Introduzca un nombre de 15 carácteres como máximo");
                texto_Nombre.setText("");
                correcto =  false;
            }else{
                Juego.setNombre("Jugador");
            }
            
        }
        //Si es correcto, establecemos el estilo de juego seleccionado y el numero de partidas
        if(correcto){            
            Juego.setEstiloJuego(selector_Estilo.getSelectedIndex());         

            switch(selector_Partidas.getSelectedIndex()){
                case 0:
                    numero_Partidas = 3;
                    break;
                case 1:
                    numero_Partidas = 5;
                    break;
                case 2:
                    numero_Partidas = 9;
                    break;            
                default:
                    numero_Partidas = 3;

            }
            Juego.setNumeroPartidas(numero_Partidas); 
            
            //Establecemos el color que se haya seleccionado.
            switch(selector_Color.getSelectedIndex()){
                case 0:
                    color = Color.BLUE;
                    break;
                case 1:
                    color = Color.RED;
                    break;
                case 2:
                    color = Color.GREEN;
                    break;
                case 3:
                    color = Color.YELLOW;
                    break;
                default:
                    color = Color.BLUE;
            } 

            Juego.setColor(color);
            
            //Mostramos la ventana del juego ocultando esta.
            this.setVisible(false);
            VentanaJuego ventanaJuego=new VentanaJuego();
            ventanaJuego.setVisible(true);
        }
         
    }//GEN-LAST:event_boton_JugarActionPerformed

    private void boton_InstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_InstruccionesActionPerformed
        //Creamos un panel para las instrucciones, le añadimo un JLabel con la imagen 
        //y mostramos un JOptionPane cada vez que se pulse el boton Instrucciones.
        JPanel contenedor=new JPanel();
        ImageIcon instrucciones = new ImageIcon(getClass().getClassLoader().getResource("imagenes/reglas.jpg"));                    
        contenedor.add(new JLabel(instrucciones));
        JOptionPane.showMessageDialog(this,contenedor,"Instrucciones",JOptionPane.PLAIN_MESSAGE,null);
        
    }//GEN-LAST:event_boton_InstruccionesActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Instrucciones;
    private javax.swing.JButton boton_Jugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox selector_Color;
    private javax.swing.JComboBox selector_Estilo;
    private javax.swing.JComboBox selector_Partidas;
    private javax.swing.JTextField texto_Nombre;
    // End of variables declaration//GEN-END:variables
}
