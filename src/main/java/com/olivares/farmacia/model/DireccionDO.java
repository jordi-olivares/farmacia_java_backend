package com.olivares.farmacia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="DIRECCION")
public class DireccionDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PK_ID")
    private Long id;

    @Column(name="FK_CLIENTE_ID")
    private Long clienteId;

    @Column(name="DIRECCION")
    private String direccion;

    @Column(name="CODIGO_POSTAL")
    private String codigoPostal;

    public DireccionDO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
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
        DireccionDO other = (DireccionDO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DireccionDO [id=" + id + ", clienteId=" + clienteId + ", direccion=" + direccion + ", codigoPostal="
                + codigoPostal + "]";
    }
    
}
