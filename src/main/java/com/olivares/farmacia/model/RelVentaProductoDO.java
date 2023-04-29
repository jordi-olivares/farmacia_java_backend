package com.olivares.farmacia.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="REL_VENTA_PRODUCTO")
public class RelVentaProductoDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PK_ID")
    private Long id;

    /*@Column(name = "FK_VENTA_ID")
    private Long ventaId;

    @Column(name = "FK_PRODUCTO_ID")
    private Long productoId;*/

    @ManyToOne(optional = false, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private VentaDO venta;

    @ManyToOne(optional = false, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private ProductoDO producto;

    public RelVentaProductoDO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VentaDO getVenta() {
        return venta;
    }

    public void setVenta(VentaDO venta) {
        this.venta = venta;
    }

    public ProductoDO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDO producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "RelVentaProductoDO [id=" + id + ", venta=" + venta + ", producto=" + producto + "]";
    }

    
    
    
}
