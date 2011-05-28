/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.*/
 

package BasesDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author andres*/
 


public class Sincroniza {
    

    mysql conexion = new mysql();
    Connection conectaRemoto = null;
    Connection conectaLocal = null;
    int registrosR = 0;
    int registrosL = 0;
    int difenreciaReg = 0;


    String nombre = "";
    String apellido = "";
    String cedula = "";
    String direccion = "";
    String email = "";
    String celular = "";
    String telefono = "";


    // Verifica que mel servidor remoto este conectado.
    public boolean VerificaRemoto(){

    if( (conectaRemoto = conexion.getConexion()) == null)
         return false;

    else
        return true;

    }



    //Verifica que el servidor local halla arrancado
    public boolean VerificaLocal(){

    if( (conectaLocal = conexion.getConexionLocal()) == null)
         return false;

    else
        return true;

    }



    // realiza la comparacion de  ambas BD Remota y Local
    public void SincronizaBD(){

        try{

        StringQuery query = new StringQuery();


       //Busquedas en el Servidor remoto
       PreparedStatement RdocenteR =conectaRemoto.prepareStatement(query.TablaDocente);
       ResultSet NumRegR = RdocenteR.executeQuery();         
       
       
        while(NumRegR.next()){    /*Captura el valor*/
           registrosR = NumRegR.getInt("Tregistro");
          }
           //conectaRemoto.close();

       //Busqueda en el Servidor Local
        PreparedStatement RdocenteL =conectaLocal.prepareStatement(query.TablaDocente);
        ResultSet NumRegL = RdocenteL.executeQuery();       
        

          while(NumRegL.next()){ /*Captura el valor*/
           registrosL = NumRegL.getInt("Tregistro");
            }
         //conectaLocal.close();


           if(registrosR == registrosL)
           JOptionPane.showMessageDialog(null, "Las Tablas Docente tienes los mismo registros!!!");

           else if(registrosR < registrosL){   /*Se estuvo solo trabajando de manera Local*/

               difenreciaReg = registrosL - registrosR;

       JOptionPane.showMessageDialog(null,"La Tablas  Docente Local tienes"+" "+ difenreciaReg +" "+"Registros mas que la Table Docente Remota desea Actualizaralas?");

               
           

           //for(int reg = difenreciaReg; reg <= registrosL ; reg ++)

          String sql = "SELECT *FROM docente";
          PreparedStatement RdocenteLDif =conectaLocal.prepareStatement(sql);
          ResultSet RegistrosLocales = RdocenteLDif.executeQuery();

          //>= '"+difenreciaReg+"'


          int valor = 0;
          while(RegistrosLocales.next()){

                nombre = RegistrosLocales.getString("nombre");
                apellido = RegistrosLocales.getString("apellido");
                cedula = RegistrosLocales.getString("cedula");
                direccion = RegistrosLocales.getString("direccion");
                email = RegistrosLocales.getString("email");
                celular = RegistrosLocales.getString("celular");
                telefono = RegistrosLocales.getString("telefono");

          String sql2 = "INSERT INTO docente VALUES('"+nombre+"', '"+apellido+"', '"+cedula+"','"+direccion+"', '"+celular+"', '"+email+"', '"+telefono+"')";
          PreparedStatement RdocenteRFaltante =conectaRemoto.prepareStatement(sql2);
         // ResultSet RegistrosRemotos = RdocenteRFaltante.executeUpdate();
          RdocenteRFaltante.executeUpdate();

            valor++;
                
            }

               conectaRemoto.close();
               conectaLocal.close();

               JOptionPane.showMessageDialog(null,"Sincronizadas con exitos la bases de datos!!!");


           }

    }// fin de el else if actualizar servidor remoto


        catch (SQLException e)
		{
	          JOptionPane.showMessageDialog(null,e.getMessage(),"Error con el Proceso de Sincronizacion", JOptionPane.ERROR_MESSAGE);
		}


    }// Fin del Metodo Sincronizar bases de Datos


}

