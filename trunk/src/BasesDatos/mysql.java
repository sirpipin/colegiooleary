
package BasesDatos;
import java.sql.*;
import javax.swing.JOptionPane;

public class mysql {

   private final String controlador = "com.mysql.jdbc.Driver";
   private final String url = "jdbc:mysql://servidortorres.sytes.net:3306/colegioOleary";
   private final String usuario ="andres";
   private final String root = "root";
   private final String clave = "14491267";
   private final String urlLocal = "jdbc:mysql://localhost:3306/colegioOleary";


   public mysql(){
       
       try{

           // Cargas la clase del Controlado
           Class.forName(controlador);

       } // Fin del Try

       catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null,e.getMessage(),"Error al cargar Controlador", JOptionPane.ERROR_MESSAGE);

           System.exit(1);

          }
    }


       public Connection getConexion() // Se conecta de manea remota
       {
            Connection conexion = null;
           try
		{
			conexion = DriverManager.getConnection(url,usuario,clave);
		}
		catch( SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage(),"Error al Conectarse con Base de datos Remota", JOptionPane.ERROR_MESSAGE);
             //System.exit(1);
       }


		return conexion;
	}


      public Connection getConexionLocal()  // Se conecta de manera Local
       {
            Connection conexion = null;

            try{

                conexion = DriverManager.getConnection(urlLocal,root,clave);

            }

             catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error al Conectarse con Base de datos Local", JOptionPane.ERROR_MESSAGE);
             //System.exit(1);

               }

		return conexion;
	}

}




