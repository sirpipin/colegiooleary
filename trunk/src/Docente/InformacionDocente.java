package Docente;


import BasesDatos.mysql;
import validaciones.validaciones;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.SwingWorker;


public class InformacionDocente extends javax.swing.JDialog implements  
                                        PropertyChangeListener {
    private Object diaND;
    private Object anoND;
     private Task task;

    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == null ? evt.getPropertyName() == null : "progress".equals(evt.getPropertyName())) {
            int progress = (Integer) evt.getNewValue();
            barraProgreso.setValue(progress);
            // task.getProgress()));
        }
    }

    /** Creates new form InformacionDocente */

     class Task extends SwingWorker <Void , Void> {

        @SuppressWarnings("SleepWhileHoldingLock")
        public Void doInBackground() {
            Random random = new Random();
            int progress = 0;
            //Inicializao Progreso
            setProgress(0);
            while (progress < 100) {
                //Sleep for up to one second.
                try {
                    Thread.sleep(random.nextInt(500));
                } catch (InterruptedException ignore) {}
                //Make random progress.
                progress += random.nextInt(10);
                setProgress(Math.min(progress, 100));
            }
             return null;
        }
           

    }

   

     public InformacionDocente() {
        setTitle("Docentes");
         initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tomarFoto = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        celularD = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        direccionD2 = new javax.swing.JTextField();
        direccionD3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        nombreD1 = new javax.swing.JTextField();
        apellidoD1 = new javax.swing.JTextField();
        cedulaD1 = new javax.swing.JTextField();
        direccionD1 = new javax.swing.JTextField();
        celularD1 = new javax.swing.JTextField();
        emailD1 = new javax.swing.JTextField();
        telefonoD1 = new javax.swing.JTextField();
        diaND1 = new javax.swing.JComboBox();
        mesND1 = new javax.swing.JComboBox();
        anoND1 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        buscarDocente = new javax.swing.JButton();
        menErro = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        capturaEstatus = new javax.swing.JTextField();
        barraProgreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos del Docente");
        setBackground(new java.awt.Color(204, 255, 255));
        setLocationByPlatform(true);
        setName("InformacionDocente"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Docente"));

        tomarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foto.png"))); // NOI18N
        tomarFoto.setToolTipText("Fotografia");

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        agregar.setToolTipText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        modificar.setToolTipText("Guardar");

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        eliminar.setToolTipText("Borrar");

        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rehacer.png"))); // NOI18N
        actualizar.setToolTipText("Modificar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(167, 203, 203));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion academica", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Grado:");

        jLabel2.setText("Area:");

        jLabel3.setText("Seccion:");

        jLabel8.setText("Profesion:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maematica", "Lenguaje", "Historia", "Biologia", "Deporte", "Computacion", "Algebra", "Geografia", "Ingles", "Csc. Naturales", "Historia universal" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Informacion de identificacion dentro de la Institucion");

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Perfil Profesional");

        jLabel25.setText("Institucion donde trabajo:");

        jLabel26.setText("Tiempo:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(161, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(direccionD2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, 0, 181, Short.MAX_VALUE)))))
                        .addGap(160, 160, 160))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(celularD, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addGap(165, 165, 165))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(direccionD3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addGap(154, 154, 154))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(332, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(celularD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(direccionD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(direccionD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(167, 203, 203));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel17.setText("Nombre:");

        jLabel18.setText("Apellido:");

        jLabel19.setText("Cedula:");

        jLabel20.setText("Direccion:");

        jLabel21.setText("Fecha Nac:");

        jLabel22.setText("Celular");

        jLabel23.setText("Telefono:");

        jLabel24.setText("Email:");

        nombreD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreD1ActionPerformed(evt);
            }
        });

        telefonoD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoD1ActionPerformed(evt);
            }
        });

        diaND1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mesND1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "enero", "febreo", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));

        anoND1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001" }));

        jLabel27.setForeground(new java.awt.Color(51, 51, 255));
        jLabel27.setText("Datos Basicos de identificacion");

        buscarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscarDocente.setToolTipText("BUSCAR");
        buscarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDocenteActionPerformed(evt);
            }
        });

        menErro.setText("-");

        Status.setText("Status:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel22)
                                    .addComponent(Status))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(diaND1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesND1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(anoND1, 0, 74, Short.MAX_VALUE))
                                    .addComponent(telefonoD1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(emailD1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(celularD1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(capturaEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel17))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(apellidoD1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(cedulaD1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(direccionD1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(buscarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addContainerGap(282, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(menErro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(nombreD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(apellidoD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(cedulaD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(direccionD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(diaND1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mesND1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(anoND1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(celularD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(telefonoD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(buscarDocente)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capturaEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status))
                .addGap(31, 31, 31)
                .addComponent(menErro)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        barraProgreso.setForeground(new java.awt.Color(0, 153, 0));
        barraProgreso.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(tomarFoto)
                .addGap(59, 59, 59)
                .addComponent(agregar)
                .addGap(44, 44, 44)
                .addComponent(modificar)
                .addGap(39, 39, 39)
                .addComponent(eliminar)
                .addGap(44, 44, 44)
                .addComponent(actualizar)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(813, Short.MAX_VALUE)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualizar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(modificar)
                        .addComponent(agregar)
                        .addComponent(tomarFoto)
                        .addComponent(eliminar)))
                .addGap(59, 59, 59)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarActionPerformed

    private void nombreD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreD1ActionPerformed

    private void telefonoD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoD1ActionPerformed

    private void buscarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDocenteActionPerformed
        BuscarDocente dialogo  = new BuscarDocente();
            dialogo.setVisible(true);
    }//GEN-LAST:event_buscarDocenteActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
          // AGREGAR UN NUEVO DOCENTE A LAS TABLAS.

        agregar.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();
  
          validaciones vali = new validaciones();
          datosDocentes datos = new datosDocentes();

         
          try{
             int sw = 0;
             mysql conexion= new mysql();
	     Connection conn=null;
             Connection conLocal = null;
             
             if(  (conn = conexion.getConexion()) == null && (conLocal = conexion.getConexionLocal()) == null){
                    menErro.setText("ERROR GRAVE AL CONECTARSE CON LOS SERVIDORES\n"
                                   + "COMUNIQUESE CON LA GERENCIA DE SISTEMAS");
                    System.exit(1);
             }
    
             
                          
              while(sw == 0){
                 datos.setNombre(nombreD1.getText());
                  if (vali.nombreAlfabetico(datos.getNombre())==false || datos.getNombre().length()<1){
                       menErro.setText("Revise Datos: Solo se aceptan Letras");
                  }
                  else{
                   sw = 1;

              }

        }

          sw = 0;
                        while(sw == 0){
                        datos.setapellido(apellidoD1.getText());
                       /* if(vali.nombreAlfabetico(apellido)==false || apellido.length()<1){
                            menErro.setText("Revise Datos: Solo se aceptan Letras");
                        }
                        else{*/
                            sw = 1;
                        //}
        }

             sw = 0;
                        while(sw ==0){
                            datos.setcedula(cedulaD1.getText());
                       /* if( cedula.length()<1){
                            menErro.setText("Revise Datos: debe colocar la ceula");
                        }
                        else{*/
                                sw =1;
                       // }

                 }

              sw = 0;

                          while(sw == 0){
                                datos.setDireccion(direccionD1.getText());
                       /* if( direccion.length()<1){
                            menErro.setText("Revise Datos: debe colocar alguna direccion");
                        }
                        else{*/
                                sw =1;
                      //  }


                    }

                 sw = 0;

                while(sw == 0){
                                datos.setTelefono(telefonoD1.getText());
                      /*  if( telefono.length()<1){
                            menErro.setText("Revise Datos: debe Ingresar un Numero telefonico");
                        }
                        else{*/
                                sw =1;
                      //  }


                    }

                 sw = 0;

                 while(sw == 0){
                                datos.setcelular(celularD1.getText());
                       /* if( celular.length()<1){
                            menErro.setText("Revise Datos: debe Ingresar un Numero telefonico");
                        }
                        else{*/
                                sw =1;
                       // }


                    }

                 sw = 0;

                 while(sw == 0){
                                datos.setEmail(emailD1.getText());
                     /*   if( email.length()<1 || vali.validacionEmail(email) ){
                            menErro.setText("Revise Datos: Debe Ingresar una Direccion de Correo Electronico");
                        }
                        else{*/
                                sw =1;
                       // }


                    }

                 sw = 0;

             while(sw == 0){
                               /* num = nDocente.getText();
                       /* if( email.length()<1 || vali.validacionNumerica(num) ){
                            menErro.setText("Revise Datos: Debe Ingresar un dato numerico");
                        }
                        else{*/
                             //   Iddocente =  Integer.parseInt(num);
                                sw =1;
                      //  }


                    }
                 
             if((conn = conexion.getConexion()) != null) {
             String sqlRemoto = "INSERT INTO docente (nombre, apellido, cedula,direccion,email,celular,telefono) VALUES('" + datos.getNombre() + "', '" + datos.getapellido() + "', '" + datos.getcedula() + "','" + datos.getDireccion() + "', '" + datos.getcelular() + "', '" + datos.getEmail() + "', '" + datos.getTelefono() + "')";
             PreparedStatement ps2=conn.prepareStatement(sqlRemoto);
             ps2.executeUpdate();
             conn.close();
             
             }
             else{
                 JOptionPane.showMessageDialog(null,"Se trabajara de Manera Local");
              }

             if((conLocal = conexion.getConexionLocal()) != null){
              String sqlLocal = "INSERT INTO docente (nombre, apellido, cedula,direccion,email,celular,telefono) VALUES('" + datos.getNombre() + "', '" + datos.getapellido() + "', '" + datos.getcedula() + "','" + datos.getDireccion() + "', '" + datos.getcelular() + "', '" + datos.getEmail() + "', '" + datos.getTelefono() + "')";
              PreparedStatement ps3=conLocal.prepareStatement(sqlLocal);
              ps3.executeUpdate();
              conLocal.close();
              }
             else
             {
               JOptionPane.showMessageDialog(null,"No se pudo almacenar en el servidor Local");
             }
                
                Toolkit.getDefaultToolkit().beep();
                 agregar.setEnabled(true);
                 setCursor(null);

          }

                   catch (SQLException e)
		{
	          JOptionPane.showMessageDialog(null,e.getMessage(),"Error Ingresando los Datos", JOptionPane.ERROR_MESSAGE);
		}

    }//GEN-LAST:event_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Status;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox anoND1;
    private javax.swing.JTextField apellidoD1;
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton buscarDocente;
    private javax.swing.JTextField capturaEstatus;
    private javax.swing.JTextField cedulaD1;
    private javax.swing.JTextField celularD;
    private javax.swing.JTextField celularD1;
    private javax.swing.JComboBox diaND1;
    private javax.swing.JTextField direccionD1;
    private javax.swing.JTextField direccionD2;
    private javax.swing.JTextField direccionD3;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField emailD1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel menErro;
    private javax.swing.JComboBox mesND1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombreD1;
    private javax.swing.JTextField telefonoD1;
    private javax.swing.JButton tomarFoto;
    // End of variables declaration//GEN-END:variables

}
