package com.olivares.farmacia.commons;

public class ClienteGetRequestVO {
    
    
    //private Long id;
    private String nombre;
    private String apellidoPATERNO;
    private String apellidoMaterno;
    private String correo;
    //private String contrasena;
    /*public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }*/
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPATERNO() {
        return apellidoPATERNO;
    }
    public void setApellidoPATERNO(String apellidoPATERNO) {
        this.apellidoPATERNO = apellidoPATERNO;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /*public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }*/
    @Override
    public String toString() {
        return "ClienteVO [nombre=" + nombre + ", apellidoPATERNO=" + apellidoPATERNO
                + ", apellidoMaterno=" + apellidoMaterno + ", correo=" + correo  +  "]";
    }

    
}
