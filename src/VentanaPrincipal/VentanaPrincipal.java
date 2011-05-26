package VentanaPrincipal;


import Alumnos.ventanabuscarAlumno;
import BasesDatos.Sincroniza;
import Docente.InformacionDocente;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {
   
    public VentanaPrincipal() {
        super("Ventana Principal");
    
        setSize(1000,500);
        initComponents();
         setVisible(true);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        PanelCentralVentaPrincipal = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        datosAlumno = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        SeleccionDocum = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        MenuBarColegio = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        ImprimirM = new javax.swing.JMenuItem();
        salirM = new javax.swing.JMenuItem();
        gestionA = new javax.swing.JMenu();
        alumnoM = new javax.swing.JMenu();
        InforAM = new javax.swing.JMenuItem();
        BuscarAM = new javax.swing.JMenuItem();
        HorariosM = new javax.swing.JMenuItem();
        comportamientoM = new javax.swing.JMenuItem();
        ausentismoAM = new javax.swing.JMenuItem();
        DocenteM = new javax.swing.JMenu();
        InfoDM = new javax.swing.JMenuItem();
        ausentismoDM = new javax.swing.JMenuItem();
        gestionE = new javax.swing.JMenu();
        parametrosM = new javax.swing.JMenu();
        documentocCM = new javax.swing.JMenuItem();
        gruposM = new javax.swing.JMenuItem();
        conceptoCM = new javax.swing.JMenuItem();
        DeudasM = new javax.swing.JMenuItem();
        odenPM = new javax.swing.JMenu();
        aplicaOPM = new javax.swing.JMenuItem();
        pagoM = new javax.swing.JMenuItem();
        inventarioM = new javax.swing.JMenuItem();
        gestionB = new javax.swing.JMenu();
        AdministracionBM = new javax.swing.JMenuItem();
        ConsultaLM = new javax.swing.JMenuItem();
        presatamoAM = new javax.swing.JMenuItem();
        ayudaf1M = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        soportetecnicoM = new javax.swing.JMenuItem();
        acercaSOFEM = new javax.swing.JMenuItem();
        registro = new javax.swing.JMenu();
        registroM = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana principal");
        setBackground(new java.awt.Color(204, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        PanelCentralVentaPrincipal.setBackground(new java.awt.Color(204, 255, 255));

        jPanel5.setBackground(new java.awt.Color(167, 203, 203));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jButton7.setForeground(new java.awt.Color(51, 51, 255));
        jButton7.setText("Cambiar Usuario");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Software de Gestion Escolar SOFE c.a");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 572, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel1)))
        );

        jDesktopPane1.setBackground(new java.awt.Color(234, 247, 247));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 255), null, java.awt.Color.orange));

        javax.swing.GroupLayout PanelCentralVentaPrincipalLayout = new javax.swing.GroupLayout(PanelCentralVentaPrincipal);
        PanelCentralVentaPrincipal.setLayout(PanelCentralVentaPrincipalLayout);
        PanelCentralVentaPrincipalLayout.setHorizontalGroup(
            PanelCentralVentaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelCentralVentaPrincipalLayout.setVerticalGroup(
            PanelCentralVentaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralVentaPrincipalLayout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(167, 203, 203));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Barra de Acceso rapido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 102))); // NOI18N
        jPanel2.setToolTipText("Barra de Acceso Rapido");

        datosAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnos.png"))); // NOI18N
        datosAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosAlumnoActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/explorador.png"))); // NOI18N

        SeleccionDocum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favoritos.png"))); // NOI18N
        SeleccionDocum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionDocumActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pegar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(datosAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jButton3)
                .addGap(117, 117, 117)
                .addComponent(SeleccionDocum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeleccionDocum, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(datosAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        MenuBarColegio.setBackground(new java.awt.Color(153, 204, 255));

        archivo.setForeground(new java.awt.Color(0, 0, 255));
        archivo.setMnemonic('A');
        archivo.setText("Archivo");
        archivo.setMargin(new java.awt.Insets(0, 0, 0, 10));

        ImprimirM.setForeground(new java.awt.Color(51, 51, 255));
        ImprimirM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        ImprimirM.setText("Imprimir");
        archivo.add(ImprimirM);

        salirM.setForeground(new java.awt.Color(255, 51, 51));
        salirM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        salirM.setMnemonic('S');
        salirM.setText("Salir");
        salirM.setMargin(new java.awt.Insets(5, 0, 5, 0));
        salirM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMActionPerformed(evt);
            }
        });
        archivo.add(salirM);

        MenuBarColegio.add(archivo);

        gestionA.setForeground(new java.awt.Color(51, 51, 255));
        gestionA.setText("Gestion Academica");
        gestionA.setMargin(new java.awt.Insets(0, 0, 0, 10));

        alumnoM.setForeground(new java.awt.Color(51, 51, 255));
        alumnoM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnos.png"))); // NOI18N
        alumnoM.setText("Alumno");

        InforAM.setForeground(new java.awt.Color(51, 51, 255));
        InforAM.setText("Informacion Alumno");
        InforAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InforAMActionPerformed(evt);
            }
        });
        alumnoM.add(InforAM);

        BuscarAM.setForeground(new java.awt.Color(51, 51, 255));
        BuscarAM.setText("Buscar Alumno");
        alumnoM.add(BuscarAM);

        HorariosM.setForeground(new java.awt.Color(51, 51, 255));
        HorariosM.setText("Horarios");
        alumnoM.add(HorariosM);

        comportamientoM.setForeground(new java.awt.Color(51, 51, 255));
        comportamientoM.setText("Comportamiento");
        alumnoM.add(comportamientoM);

        ausentismoAM.setForeground(new java.awt.Color(255, 51, 51));
        ausentismoAM.setText("Ausentismo");
        alumnoM.add(ausentismoAM);

        gestionA.add(alumnoM);

        DocenteM.setForeground(new java.awt.Color(51, 51, 255));
        DocenteM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/docentes.jpg"))); // NOI18N
        DocenteM.setText("Docente");

        InfoDM.setForeground(new java.awt.Color(51, 51, 255));
        InfoDM.setText("Informacion Docente");
        InfoDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoDMActionPerformed(evt);
            }
        });
        DocenteM.add(InfoDM);

        ausentismoDM.setForeground(new java.awt.Color(255, 0, 102));
        ausentismoDM.setText("Ausentismo");
        DocenteM.add(ausentismoDM);

        gestionA.add(DocenteM);

        MenuBarColegio.add(gestionA);

        gestionE.setForeground(new java.awt.Color(51, 51, 255));
        gestionE.setText("Gestion Economica");
        gestionE.setMargin(new java.awt.Insets(0, 0, 0, 10));

        parametrosM.setForeground(new java.awt.Color(51, 51, 255));
        parametrosM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sistema.png"))); // NOI18N
        parametrosM.setText("Parametros");

        documentocCM.setForeground(new java.awt.Color(51, 51, 255));
        documentocCM.setText("Documentos Contables");
        parametrosM.add(documentocCM);

        gruposM.setForeground(new java.awt.Color(51, 51, 255));
        gruposM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reloj.png"))); // NOI18N
        gruposM.setText("Grupos");
        parametrosM.add(gruposM);

        conceptoCM.setForeground(new java.awt.Color(51, 51, 255));
        conceptoCM.setText("Concepto de Cobros");
        parametrosM.add(conceptoCM);

        DeudasM.setForeground(new java.awt.Color(204, 0, 51));
        DeudasM.setText("Deudas");
        DeudasM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeudasMActionPerformed(evt);
            }
        });
        parametrosM.add(DeudasM);

        gestionE.add(parametrosM);

        odenPM.setForeground(new java.awt.Color(51, 51, 255));
        odenPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pegar.png"))); // NOI18N
        odenPM.setText("Ordenes de Pagos");

        aplicaOPM.setForeground(new java.awt.Color(51, 51, 255));
        aplicaOPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/expulsar.png"))); // NOI18N
        aplicaOPM.setText("Aplicar Orden de Pago");
        odenPM.add(aplicaOPM);

        pagoM.setForeground(new java.awt.Color(51, 51, 255));
        pagoM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pago.jpg"))); // NOI18N
        pagoM.setText("Pagos");
        odenPM.add(pagoM);

        inventarioM.setForeground(new java.awt.Color(51, 51, 255));
        inventarioM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estadistica.png"))); // NOI18N
        inventarioM.setText("Inventario");
        odenPM.add(inventarioM);

        gestionE.add(odenPM);

        MenuBarColegio.add(gestionE);

        gestionB.setForeground(new java.awt.Color(51, 51, 255));
        gestionB.setText("Gestion de Biblioteca");
        gestionB.setMargin(new java.awt.Insets(0, 0, 0, 10));

        AdministracionBM.setForeground(new java.awt.Color(51, 51, 255));
        AdministracionBM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion.gif"))); // NOI18N
        AdministracionBM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministracionBMActionPerformed(evt);
            }
        });
        gestionB.add(AdministracionBM);

        ConsultaLM.setForeground(new java.awt.Color(51, 51, 255));
        ConsultaLM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        ConsultaLM.setText("Consultas");
        ConsultaLM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaLMActionPerformed(evt);
            }
        });
        gestionB.add(ConsultaLM);

        presatamoAM.setForeground(new java.awt.Color(51, 51, 255));
        presatamoAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prestamoA.png"))); // NOI18N
        presatamoAM.setText("Prestamos Alumnos");
        gestionB.add(presatamoAM);

        MenuBarColegio.add(gestionB);

        ayudaf1M.setForeground(new java.awt.Color(51, 51, 255));
        ayudaf1M.setText("Ayuda");
        ayudaf1M.setMargin(new java.awt.Insets(0, 0, 0, 10));

        jMenuItem1.setForeground(new java.awt.Color(51, 51, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        jMenuItem1.setText("Ayuda F1");
        ayudaf1M.add(jMenuItem1);

        soportetecnicoM.setForeground(new java.awt.Color(51, 51, 255));
        soportetecnicoM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configurar.png"))); // NOI18N
        soportetecnicoM.setText("Soporte Tecnico");
        ayudaf1M.add(soportetecnicoM);

        acercaSOFEM.setForeground(new java.awt.Color(0, 204, 51));
        acercaSOFEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/duda_1.png"))); // NOI18N
        acercaSOFEM.setText("Acerca de SOFE");
        acercaSOFEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaSOFEMActionPerformed(evt);
            }
        });
        ayudaf1M.add(acercaSOFEM);

        MenuBarColegio.add(ayudaf1M);

        registro.setForeground(new java.awt.Color(51, 51, 255));
        registro.setText("Registro");

        registroM.setFont(new java.awt.Font("Meiryo", 3, 12));
        registroM.setForeground(new java.awt.Color(51, 204, 255));
        registroM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bloqueado.png"))); // NOI18N
        registroM.setText("Registrar");
        registro.add(registroM);

        MenuBarColegio.add(registro);

        setJMenuBar(MenuBarColegio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelCentralVentaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCentralVentaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Manejo de Eventos
    private void salirMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMActionPerformed

        System.exit(0);
    }//GEN-LAST:event_salirMActionPerformed

    private void acercaSOFEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaSOFEMActionPerformed
    JOptionPane.showMessageDialog(null,"Software desarrollado para la Asingnatura\n"
                                   + " DESARROLLO DEL SOFTWARE I");
            
    }//GEN-LAST:event_acercaSOFEMActionPerformed

    
    private void InforAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InforAMActionPerformed
           //adminisraAlumno ventanaIn = new adminisraAlumno ("Datos de Alumnos", true, true,true,true);
           //jDesktopPane1.add(ventanaIn);


    }//GEN-LAST:event_InforAMActionPerformed

    private void InfoDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoDMActionPerformed
       InformacionDocente dialogoD = new InformacionDocente();      
        dialogoD.setLocationRelativeTo(null);
        dialogoD.setVisible(true);
    }//GEN-LAST:event_InfoDMActionPerformed

    private void AdministracionBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministracionBMActionPerformed
       
        // ManejodLibros ventanaLi = new ManejodLibros("Libros",true,true,true,true);
        // jDesktopPane1.add(ventanaLi);
         
        
    }//GEN-LAST:event_AdministracionBMActionPerformed

    private void ConsultaLMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaLMActionPerformed


       // EjempBasedDatos autor = new EjempBasedDatos();
        //autor.setLocationRelativeTo(null);

    }//GEN-LAST:event_ConsultaLMActionPerformed

    private void datosAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosAlumnoActionPerformed
       ventanabuscarAlumno ventanaAlumno = new ventanabuscarAlumno();
        ventanaAlumno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaAlumno.setLocationRelativeTo(null);

    }//GEN-LAST:event_datosAlumnoActionPerformed

    private void SeleccionDocumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionDocumActionPerformed
// ManejodLibros ventanaDoc = new ManejodLibros("Documentos",true,true,true,true);
        // jDesktopPane1.add(ventanaDoc);


    }//GEN-LAST:event_SeleccionDocumActionPerformed

    private void DeudasMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeudasMActionPerformed
      /* DeudaAlumno ventanaDeuda = new DeudaAlumno();*/
  


    }//GEN-LAST:event_DeudasMActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        /*CabiarUsuario ventanaClave = new CabiarUsuario(true);
        ventanaClave.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaClave.setLocationRelativeTo(null);*/
}//GEN-LAST:event_jButton7ActionPerformed


    public static void main(String args[]) {
       VentanaPrincipal apli = new VentanaPrincipal();
       apli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       apli.setLocationRelativeTo(null);

       Sincroniza  sincronizaSof = new Sincroniza();


       if(sincronizaSof.VerificaLocal() && sincronizaSof.VerificaRemoto())
           JOptionPane.showMessageDialog(null, "Se trabajara Con Doble Respaldo: Local-Remoto");
       else if(!sincronizaSof.VerificaRemoto())
            JOptionPane.showMessageDialog(null, "Se trabajara con el servidor Local");
       else if(!sincronizaSof.VerificaLocal())
           JOptionPane.showMessageDialog(null, "Se trabajara solo con el servidor Remoto");

       else
           JOptionPane.showMessageDialog(null, "Se logro conectar con ningun Servidor!!");


      //Sincronizar las tablas de Los Docentes

       sincronizaSof.SincronizaBD();



    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdministracionBM;
    private javax.swing.JMenuItem BuscarAM;
    private javax.swing.JMenuItem ConsultaLM;
    private javax.swing.JMenuItem DeudasM;
    private javax.swing.JMenu DocenteM;
    private javax.swing.JMenuItem HorariosM;
    private javax.swing.JMenuItem ImprimirM;
    private javax.swing.JMenuItem InfoDM;
    private javax.swing.JMenuItem InforAM;
    private javax.swing.JMenuBar MenuBarColegio;
    private javax.swing.JPanel PanelCentralVentaPrincipal;
    private javax.swing.JButton SeleccionDocum;
    private javax.swing.JMenuItem acercaSOFEM;
    private javax.swing.JMenu alumnoM;
    private javax.swing.JMenuItem aplicaOPM;
    private javax.swing.JMenu archivo;
    private javax.swing.JMenuItem ausentismoAM;
    private javax.swing.JMenuItem ausentismoDM;
    private javax.swing.JMenu ayudaf1M;
    private javax.swing.JMenuItem comportamientoM;
    private javax.swing.JMenuItem conceptoCM;
    private javax.swing.JButton datosAlumno;
    private javax.swing.JMenuItem documentocCM;
    private javax.swing.JMenu gestionA;
    private javax.swing.JMenu gestionB;
    private javax.swing.JMenu gestionE;
    private javax.swing.JMenuItem gruposM;
    private javax.swing.JMenuItem inventarioM;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JMenu odenPM;
    private javax.swing.JMenuItem pagoM;
    private javax.swing.JMenu parametrosM;
    private javax.swing.JMenuItem presatamoAM;
    private javax.swing.JMenu registro;
    private javax.swing.JMenuItem registroM;
    private javax.swing.JMenuItem salirM;
    private javax.swing.JMenuItem soportetecnicoM;
    // End of variables declaration//GEN-END:variables

}
