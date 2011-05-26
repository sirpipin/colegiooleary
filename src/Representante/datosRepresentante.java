
package Representante;


public class datosRepresentante {
    
    private String nombre;               private String email;
    private String apellido;             private String cedulaR;   
    private String fnacimiento;          private String celular;
    private String direccion;            private String telefono;
    private String telefonotrab;         private String prefesion;
    private String sexo;                 private String comentario;
               

    public String getfnacimiento(){
        return fnacimiento;
    }

    public void setfnacimiento(String fnacimiento){
        this.fnacimiento = fnacimiento;
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

    public String getcomentario(){
        return comentario;

    }

    public void setcomentario(String comentario){
        this.comentario = comentario;

    }

    public String getcedulaR(){
        return cedulaR;

    }

    public void setcedulaR(String cedulaR){
        this.cedulaR = cedulaR;

    }

    public String gettelefonoTrab(){
        
        return telefonotrab;
    }
    
    public void settelefonotrab(String telefonot){
        
        this.telefonotrab = telefonot;
    }
    
    public String getprofesion(){
        return prefesion;
    }
    
    public void setprefesion(String profesion){
        this.prefesion = profesion;
        
    }
    
       
    }

