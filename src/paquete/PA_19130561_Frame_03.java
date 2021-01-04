
package paquete;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


class PA_19130561_Frame_03 extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    avion avioncito;
    carro carrito;
    helicoptero helicopterito;
    motocicleta moto;
    PA_19130561_Frame_03a open;
    PA_19130561_Frame_03b des;
    vehiculo[] objetos  = new vehiculo[4];
    
    public PA_19130561_Frame_03() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Proyecto 3 - Alfredo Reza Jara");
        modelo = (DefaultTableModel) this.tabla.getModel();
    }
    
    public void guardar_objetos(vehiculo obj, int pos){
        objetos[pos] = obj;
    }
    
    public vehiculo[] obtener_objetos(){
        return objetos;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_cargar = new javax.swing.JButton();
        boton_info = new javax.swing.JButton();
        boton_diagrama = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        area_info = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        Representacion = new javax.swing.JLabel();
        boton_desfile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_cargar.setText("Cargar");
        boton_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cargarActionPerformed(evt);
            }
        });

        boton_info.setText("Mostrar Informacion");
        boton_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_infoActionPerformed(evt);
            }
        });

        boton_diagrama.setText("Diagrama");
        boton_diagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_diagramaActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Clase", "Modelo", "Atributo 1", "Atributo 2"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        area_info.setEditable(false);
        area_info.setColumns(20);
        area_info.setRows(5);
        jScrollPane2.setViewportView(area_info);

        jLabel1.setText("Datos Obtenidos");

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Representacion.setText("Representacion:");

        boton_desfile.setText("Desfile");
        boton_desfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_desfileActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/Captura.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(boton_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_info, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_diagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_desfile, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Representacion)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_cargar)
                    .addComponent(boton_info)
                    .addComponent(boton_diagrama)
                    .addComponent(boton_desfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Representacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cargarActionPerformed
        //objeto de clases - llenando la tabla
        avioncito = new avion();
        carrito = new carro();
        helicopterito = new helicoptero();
        moto = new motocicleta();
        
        //primer objeto
        modelo.setValueAt("carro", 0, 0);
        modelo.setValueAt(carrito.getModelo(), 0, 1);
        modelo.setValueAt(carrito.getTipo(), 0, 2);
        modelo.setValueAt(carrito.getNumRuedas(), 0, 3);
        this.guardar_objetos(carrito, 0);
        //segundo objeto
        modelo.setValueAt("moto", 1, 0);
        modelo.setValueAt(moto.getModelo(), 1, 1);
        modelo.setValueAt(moto.getMotor(), 1, 2);
        modelo.setValueAt(moto.getNumRuedas(), 1, 3);
        this.guardar_objetos(moto, 1);
        //tercer objeto 
        modelo.setValueAt("avion", 2, 0);
        modelo.setValueAt(avioncito.getModelo(), 2, 1);
        modelo.setValueAt(avioncito.getTurbinas(), 2, 2);
        modelo.setValueAt(avioncito.getVelMaxima(), 2, 3);
        this.guardar_objetos(avioncito, 2);
        //cuarto objeto
        modelo.setValueAt("helicoptero", 3, 0);
        modelo.setValueAt(helicopterito.getModelo(), 3, 1);
        modelo.setValueAt(helicopterito.getAsientos(), 3, 2);
        modelo.setValueAt(helicopterito.getVelMaxima(), 3, 3);
        guardar_objetos(helicopterito, 3);
        
        System.out.println(objetos[0].info());
    }//GEN-LAST:event_boton_cargarActionPerformed

    private void boton_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_infoActionPerformed
        String dato;
        try {
           dato = String.valueOf(modelo.getValueAt(tabla.getSelectedRow(), 0)); 
           switch(dato){
                case "carro":
                    area_info.setText("");
                    area_info.append(carrito.info());
                    carrito.dibujar(this.panel, 0);                    
                    break;
                
                case "moto":
                    area_info.setText("");
                    area_info.append(moto.info());
                    moto.dibujar(this.panel, 0); 
                    break;
                
                case "avion":
                    area_info.setText("");
                    area_info.append(avioncito.info());
                    avioncito.dibujar(this.panel, 0);
                    break;
                
                case "helicoptero":
                    area_info.setText("");
                    area_info.append(helicopterito.info());
                    helicopterito.dibujar(this.panel,0);
                    break;
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione con el mouse una fila de la tabla"+ "\nError: "+e);
        }
        
       
            
    }//GEN-LAST:event_boton_infoActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaMouseClicked

    private void boton_diagramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_diagramaActionPerformed
        open = new PA_19130561_Frame_03a();
        open.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_boton_diagramaActionPerformed

    private void boton_desfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_desfileActionPerformed
        des = new PA_19130561_Frame_03b(this);
        des.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_boton_desfileActionPerformed

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
            java.util.logging.Logger.getLogger(PA_19130561_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PA_19130561_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PA_19130561_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PA_19130561_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PA_19130561_Frame_03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Representacion;
    private javax.swing.JTextArea area_info;
    private javax.swing.JButton boton_cargar;
    private javax.swing.JButton boton_desfile;
    private javax.swing.JButton boton_diagrama;
    private javax.swing.JButton boton_info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}