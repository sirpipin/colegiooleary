/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BasesDatos;

import Alumnos.datosAlumnos;

/**
 *
 * @author Andres Torres 
 */
public class ActualizaDatos {


datosAlumnos datos = new datosAlumnos();
    


/* Captura los datos Iniciales y los almacena en la clase datosAlumnos*/   /*Falta Agregarle el resto de la Columna*/
    
public void RecibeParaAlumno(String nombre, String apellido, String telefono, 
            String Direccion, String Status, int deuda, String email, String Comentario ){
    
    
    
    datos.setNombre(nombre);
    datos.setapellido(apellido);
    datos.setDireccion(Direccion);
    datos.setTelefono(telefono);
    datos.setstatus(Status);
    datos.setEmail(email);
    datos.setcomentario(Comentario);


    /*Completar Datos de la tabla Alumno*/
    
}
    
/*Compara los datos previamentes guardados y los compara con los nuevos posibles cambios*/

public void ComparDatosyActualizaAlumno(String nombre, String apellido, String telefono,
            String Direccion, String Status, int deuda, String email, String Comentario, String cedula){


           //Verifica valor por Valor


         if(nombre != datos.getNombre())
             datos.setNombre(nombre);

         else if(apellido !=datos.getapellido())
             datos.setapellido(apellido);

         else if(telefono != datos.getTelefono())
             datos.setTelefono(telefono);

         else if(Direccion != datos.getDireccion())
              datos.setDireccion(Direccion);

         else if(Status != datos.getstatus())
               datos.setstatus(Status);

         else if(email != datos.getEmail())
             datos.setEmail(email);

         else if(Comentario != datos.getcomentario())
                 datos.setcomentario(Comentario);


    String sql ="UPDATE alumnos SET nombre = '" + datos.getNombre() + "', apellido = '" + datos.getapellido() +
                 "', telefono = '" + datos.getTelefono() + "', direccion = '" + datos.getDireccion() +
                 "', status = '" + datos.getstatus() + "', email = '" + datos.getEmail() + "', comentarios ='" + datos.getcomentario() + "' where cedula = '" + cedula + "',    ";




    // ojo falta preparar los StamentResult

}


    
    
    
}
