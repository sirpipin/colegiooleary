package Docente;


import BasesDatos.ActualizaDatos;
import BasesDatos.mysql;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class BuscarDocente extends javax.swing.JDialog implements
                                        PropertyChangeListener{
    private Task task;

    class Task extends SwingWorker <Void , Void> {

        public Void doInBackground() {
            Random random = new Random();
            int progress = 0;
            //Inicializao Progreso
            setProgress(0);
            while (progress < 100) {
                //Sleep for up to one second.
                try {
                   
                    Thread.sleep(random.nextInt(100));
                } catch (InterruptedException ignore) {}
                //Make random progress.
                progress += random.nextInt(10);
                setProgress(Math.min(progress, 100));
            }
             return null;
        }


    }

    BuscarDocente() {
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        celular = new javax.swing.JLabel();
        idDocente = new javax.swing.JLabel();
        mostraNomb = new javax.swing.JLabel();
        mostraApe = new javax.swing.JLabel();
        mosraCed = new javax.swing.JLabel();
        mostrarDirecc = new javax.swing.JLabel();
        mostrarTel = new javax.swing.JLabel();
        mostrarCel = new javax.swing.JLabel();
        mostrarTotalDocentes = new javax.swing.JLabel();
        telefono1 = new javax.swing.JLabel();
        mostrarimail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mostrarId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        capturaStatus = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        capturaCedula = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        barraProgreso = new javax.swing.JProgressBar();
        Actualiza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscador de  Docente");
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        setModal(true);
        setName("BuscadoDocente"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(167, 203, 203));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Docente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        nombre.setText("Nombre:");

        apellido.setText("Apellido:");

        cedula.setText("Cedula:");

        direccion.setText("Direccion:");

        telefono.setText("Telefono:");

        celular.setText("Celular:");

        idDocente.setText("Total-Docentes:");

        mostraNomb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mostraApe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mosraCed.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mostrarDirecc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mostrarTel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mostrarCel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mostrarTotalDocentes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        telefono1.setText("Email:");

        mostrarimail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Docente N°:");

        mostrarId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Status:");

        capturaStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cedula)
                        .addGap(18, 18, 18)
                        .addComponent(mosraCed, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(direccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mostrarDirecc, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombre)
                                    .addComponent(apellido))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mostraNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mostraApe, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(idDocente)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mostrarId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mostrarTotalDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(capturaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(celular)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono)
                                    .addComponent(telefono1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mostrarimail, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(mostrarCel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mostrarTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombre)
                                .addComponent(mostraNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idDocente))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(mostraApe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mostrarTotalDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mosraCed, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addComponent(cedula, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                            .addGap(28, 28, 28))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(capturaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(direccion)
                    .addComponent(mostrarDirecc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telefono1)
                    .addComponent(mostrarimail, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telefono)
                    .addComponent(mostrarTel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(celular)
                    .addComponent(mostrarCel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Aceptar.png"))); // NOI18N
        jButton1.setToolTipText("BUSCAR");

        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        Limpiar.setToolTipText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        Buscar.setBorder(null);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        barraProgreso.setForeground(new java.awt.Color(0, 153, 0));
        barraProgreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barraProgreso.setStringPainted(true);

        Actualiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        Actualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(Limpiar)
                .addGap(18, 18, 18)
                .addComponent(Actualiza)
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(capturaCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(455, Short.MAX_VALUE)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(capturaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Limpiar))
                        .addGap(22, 22, 22)
                        .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Actualiza)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
       
        mysql conexion= new mysql();
	Connection conRemota=null;
        Connection conLocal = null;

                   String cadena = "";
                   if(evt.getSource() == Buscar);
                  cadena = capturaCedula.getText();
        try{
            
        conRemota = conexion.getConexion();
        conLocal = conexion.getConexionLocal();
        
        Buscar.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();
      
         if((conRemota = conexion.getConexion()) != null) {
                         
            String sql1 = "SELECT * FROM docente where cedula= '"+cadena+"'";
            String sq12 = "SELECT  count(iddocente) as Tregistro from docente";
            
            PreparedStatement remoto  = conRemota.prepareStatement(sql1);
            PreparedStatement ConteoRemoto  = conRemota.prepareStatement(sq12);
            ResultSet datosRemoto = remoto.executeQuery();
            ResultSet conteoRemoto = ConteoRemoto.executeQuery();

             while(conteoRemoto.next()){

            int idDocente = conteoRemoto.getInt("Tregistro");
            String cadena2 = String.valueOf(idDocente);
            mostrarTotalDocentes.setText(cadena2);
            }
            conteoRemoto.close();

             while (datosRemoto.next()){
                int id = datosRemoto.getInt("Iddocente");
                String nombre = datosRemoto.getString("nombre");
                String apellido = datosRemoto.getString("apellido");
                String cedula = datosRemoto.getString("cedula");
                String direccion = datosRemoto.getString("direccion");
                String email = datosRemoto.getString("email");
                String celular = datosRemoto.getString("celular");
                String telefono = datosRemoto.getString("telefono");
                String Status = datosRemoto.getString("status");

                mostraNomb.setText(nombre);
                mostraApe.setText(apellido);
                mosraCed.setText(cedula);
                mostrarDirecc.setText(direccion);
                mostrarimail.setText(email);
                mostrarCel.setText(celular);
                mostrarTel.setText(telefono);
                String id2 = String.valueOf(id);
                mostrarId.setText(id2);
                capturaStatus.setText(Status);
                
ActualizaDatos ActualizaDocente =  new ActualizaDatos();
             
 ActualizaDocente.RecibeDocente(mostraNomb.getText(),mostraApe.getText(),capturaCedula.getText(),
        mostrarDirecc.getText(),mostrarimail.getText(),mostrarCel.getText(),mostrarTel.getText(),
        capturaStatus.getText()); 
                
            }

            datosRemoto.close();

             }
             else{
                 JOptionPane.showMessageDialog(null,"Se Buscara en el servidor LOCAL");
              }

             if((conLocal = conexion.getConexionLocal()) != null){

            String sql1 = "SELECT * FROM docente where cedula= '"+cadena+"'";
            String sq12 = "SELECT  count(iddocente) as Tregistro from docente";

            PreparedStatement  serviLocal = conLocal.prepareStatement(sql1);
            PreparedStatement  ConteoLocal  = conLocal.prepareStatement(sq12);
            ResultSet datosLocal = serviLocal.executeQuery();
            ResultSet conteoLocal = ConteoLocal.executeQuery();

            while(conteoLocal.next()){
            int idDocente = conteoLocal.getInt("Tregistro");
            String cadena2 = String.valueOf(idDocente);
            mostrarTotalDocentes.setText(cadena2);
            }
            conteoLocal.close();

 while (datosLocal.next()){

                int id = datosLocal.getInt("Iddocente");
                String nombre = datosLocal.getString("nombre");
                String apellido = datosLocal.getString("apellido");
                String cedula = datosLocal.getString("cedula");
                String direccion = datosLocal.getString("direccion");
                String email = datosLocal.getString("email");
                String celular = datosLocal.getString("celular");
                String telefono = datosLocal.getString("telefono");
                String Status = datosLocal.getString("status");

                mostraNomb.setText(nombre);
                mostraApe.setText(apellido);
                mosraCed.setText(cedula);
                mostrarDirecc.setText(direccion);
                mostrarimail.setText(email);
                mostrarCel.setText(celular);
                mostrarTel.setText(telefono);
                String id2 = String.valueOf(id);
                mostrarId.setText(id2);
                capturaStatus.setText(Status);
                
ActualizaDatos ActualizaDocente =  new ActualizaDatos();
             
 ActualizaDocente.RecibeDocente(mostraNomb.getText(),mostraApe.getText(),capturaCedula.getText(),
        mostrarDirecc.getText(),mostrarimail.getText(),mostrarCel.getText(),mostrarTel.getText(),
       capturaStatus.getText());
                
           
            }

            datosLocal.close();
              }
             else
             {
               JOptionPane.showMessageDialog(null,"No se logro conecta con el servidor");
             }
          
         Toolkit.getDefaultToolkit().beep();
          Buscar.setEnabled(true);
          setCursor(null);

        }// Fin del try

        catch(SQLException e)
		{
	          JOptionPane.showMessageDialog(null,e.getMessage(),"Error Igresando los Datos", JOptionPane.ERROR_MESSAGE);
		}

    }//GEN-LAST:event_BuscarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed

                mostrarTotalDocentes.setText("");
                mostraNomb.setText("");
                mostraApe.setText("");
                mosraCed.setText("");
                mostrarDirecc.setText("");
                mostrarimail.setText("");
                mostrarCel.setText("");
                mostrarTel.setText("");
               capturaCedula.setText("Ingrese Numero de cedula");
               mostrarId.setText("");
               capturaStatus.setText("");

    }//GEN-LAST:event_LimpiarActionPerformed

    private void ActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizaActionPerformed
    
    mysql conexion= new mysql();
    Connection conRemota=null;
    Connection conLocal = null;    

        
ActualizaDatos ActualizaDocente =  new ActualizaDatos();
                                           
 
 ActualizaDocente.comparaActualizaDocentes(mostraNomb.getText(),mostraApe.getText(),capturaCedula.getText(),
                                mostrarDirecc.getText(),mostrarimail.getText(),mostrarCel.getText(),mostrarTel.getText(),
                                capturaStatus.getText());
                              
        
 try{
            
        conRemota = conexion.getConexion();
        conLocal = conexion.getConexionLocal();
        datosDocentes datosD = new datosDocentes();
        
        Actualiza.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();
      
         if((conRemota = conexion.getConexion()) != null) {
          String sql ="UPDATE alumnos SET nombre = '" + datosD.getNombre() + "', apellido = '" + datosD.getapellido() +
                 "', telefono = '" + datosD.getTelefono() + "',celular ='" + datosD.getcelular() +"', direccion = '" + datosD.getDireccion() +
                 "', status = '" + datosD.getstatus() + "', email = '" + datosD.getEmail()
                 + "', comentarios ='" + datosD.getcomentario() + "' where cedula = '" + datosD.getcedula() + "',";   
         
         PreparedStatement remoto  = conRemota.prepareStatement(sql); 
         remoto.executeUpdate();
         conRemota.close();
                          
         }
 
             
 
              else{
                 JOptionPane.showMessageDialog(null,"Se Actualizara solo el Servidor: LOCAL");
              }
 
           if((conLocal = conexion.getConexionLocal()) != null){
             String sql ="UPDATE alumnos SET nombre = '" + datosD.getNombre() + "', apellido = '" + datosD.getapellido() +
                 "', telefono = '" + datosD.getTelefono() + "',celular ='" + datosD.getcelular() +"', direccion = '" + datosD.getDireccion() +
                 "', status = '" + datosD.getstatus() + "', email = '" + datosD.getEmail()
                 + "', comentarios ='" + datosD.getcomentario() + "' where cedula = '" + datosD.getcedula() + "',";  
           
               PreparedStatement Local  = conLocal.prepareStatement(sql); 
               Local.executeUpdate();
               conLocal.close();
                              
           }
        else{
                 JOptionPane.showMessageDialog(null,"No se logro Actualizar el Servidor Remoto");
              }


      Toolkit.getDefaultToolkit().beep();
          Buscar.setEnabled(true);
          setCursor(null);

        }// Fin del try

        catch(SQLException e)
		{
	          JOptionPane.showMessageDialog(null,e.getMessage(),"Error Igresando los Datos", JOptionPane.ERROR_MESSAGE);
		}
        
// TODO add your handling code here:
    }//GEN-LAST:event_ActualizaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualiza;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel apellido;
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JTextField capturaCedula;
    private javax.swing.JLabel capturaStatus;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel idDocente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mosraCed;
    private javax.swing.JLabel mostraApe;
    private javax.swing.JLabel mostraNomb;
    private javax.swing.JLabel mostrarCel;
    private javax.swing.JLabel mostrarDirecc;
    private javax.swing.JLabel mostrarId;
    private javax.swing.JLabel mostrarTel;
    private javax.swing.JLabel mostrarTotalDocentes;
    private javax.swing.JLabel mostrarimail;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefono1;
    // End of variables declaration//GEN-END:variables

    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == null ? evt.getPropertyName() == null : "progress".equals(evt.getPropertyName())) {
            int progress = (Integer) evt.getNewValue();
            barraProgreso.setValue(progress);

        }
    }

}
