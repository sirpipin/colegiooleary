/*
 * Validacion de String
 */

package validaciones;

public class Valida
{
   // valida nombre
   public static boolean validaNombre( String nombre )
   {
      return nombre.matches( "[A-Z][a-zA-Z]*" );
   } // fin del metodo validaNombre

   // valida apellido
   public static boolean validaApellido( String apellido )
   {
      return apellido.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
   } // fin del metodo validaApellido

   // valida direccion
   public static boolean validaDireccion( String direccion )
   {
      return direccion.matches(
         "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
   } // fin de metoso validaDireccion

   // valida Ciudad
   public static boolean validaCiudad( String ciudad )
   {
      return ciudad.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
   } // fin del metodo validaCiudad

   // valida Estado
   public static boolean validaEstado( String estado )
   {
      return estado.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) ;
   } // fin del metodo validaEstado

   // valida zip
   public static boolean validaZip( String zip )
   {
      return zip.matches( "\\d{5}" );
   } // fin del Metodo validaZip

   // valida telefono
   public static boolean validaTelefono( String telefono )
   {
      return telefono.matches( "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" );
   } // fin del metodo valida Telefono
} // fin de la clase valida

