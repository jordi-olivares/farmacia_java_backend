package com.olivares.farmacia.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="REL_MARCA_PROVEEDOR")
public class RelMarcaProveedorDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_ID")
    private Long id;
    
    /*@Column(name = "FK_MARCA_ID")
    private Long marcaId;

    @Column(name = "FK_PROVEEDOR_ID")
    private Long proveedorId;*/

    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private MarcDO marca;

    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private ProveedorDO proveedor;

    public RelMarcaProveedorDO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MarcDO getMarca() {
        return marca;
    }

    public void setMarca(MarcDO marca) {
        this.marca = marca;
    }

    public ProveedorDO getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorDO proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "RelMarcaProveedorDO [id=" + id + ", marca=" + marca + ", proveedor=" + proveedor + "]";
    }

    

    
}
