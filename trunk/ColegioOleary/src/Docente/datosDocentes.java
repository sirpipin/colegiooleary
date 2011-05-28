
package Docente;


public class datosDocentes {


    private String nombre;               private String email;   
    private String apellido;             private String status;
    private String nacimiento;           private String celular;
    private String direccion;            private String telefono; 
    private String sexo;                 private String comentario;
    private String cedula;
                
                
    public String getfnacimiento(){
        return nacimiento;
    }

    public void setfnacimiento(String fnacimiento){
        this.nacimiento = fnacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getcelular(){
        return celular;
    }

    public void setcelular(String celular){
        this.celular = celular;

    }

   

    public String getstatus(){
        return status;
    }

    public void setstatus(String status){
        this.status = status;

    }

    
    public String getcomentario(){
        return comentario;

    }

    public void setcomentario(String comentario){
        this.comentario = comentario;

    }

    public String getcedula(){
        return cedula;

    }

    public void setcedula(String cedula){
        this.cedula = cedula;

    }


}
 
   
