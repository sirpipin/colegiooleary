/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BasesDatos;

/**
 *
 * @author andres
 */
public class StringQuery {
    
    
    // Query de tipo Count
    public String TablaAlumno = "select count(cedula) as Tregistro from alumnos";
    public String TablaDocente = "select count(iddocente) as Tregistro from docente";
    public String Tablaautores = "select count(idAutores) as Tregistro from autores";
    public String TablaDeudaAlumno = "select count(iddeuda) as Tregistro from DeudaAlumumnos";
    public String docuementosContables = "select count(iddocumento) as Tregistro from docuemtosContable";
    public String documentosAcademicos = "select count(iddocumento) as Tregistro from documentosAcademicos";
    public String editoriales = "select count(idEditoria;) as Tregistro from editorials";
    public String infoacadoc = "select count(iddocente) as Tregistro from infoacadoc";
    public String inscricion = "select count(inIcripcion) as Tregistro from inscripcion";
    public String isbnAutor = "select count(idAutor) as Tregistro from isbnAutor";
    public String productos = "select count(iddoselect) as Tregistro from docente";
    public String Proveedores = "select count(idproductos) as Tregistro from productos";
    public String Representantes = "select count(cedulaR) as Tregistro from representante";
    public String tipoDeudas = "select count(iddeuda) as Tregistro from tipodeDeudas";
    public String titulos = "select count(isbn) as Tregistro from tutulos";
    public String proveedores = "select count(idproveedor) as Tregistro from proveedores";


    //Query para Buscar 

    

    

}
