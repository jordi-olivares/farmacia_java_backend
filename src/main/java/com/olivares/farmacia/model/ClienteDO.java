package com.olivares.farmacia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "CLIENTE")
public class ClienteDO {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="PK_ID")
    private Long id;
    
    @Column(name="NOMBRE")
    private String nombre;

    @Column(name="APELLIDO_PATERNO")
    private String apellidoPATERNO;

    @Column(name="APELLIDO_MATERNO")
    private String apellidoMaterno;

    @Column(name="CORREO")
    private String correo;

    @Column(name="CONTRASENA")
    private String contrasena;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ClienteDO() {
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ClienteDO other = (ClienteDO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidoPATERNO=" + apellidoPATERNO
                + ", apellidoMaterno=" + apellidoMaterno + ", correo=" + correo + ", contraseña=" + contrasena + "]";
    }

    
}
