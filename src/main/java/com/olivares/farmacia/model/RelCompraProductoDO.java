package com.olivares.farmacia.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "REL_COMPRA_PRODUCTO")
public class RelCompraProductoDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_ID")
    private Long id;
    
    /*@Column(name = "FK_COMPRA_ID")
    private Long compraId;

    @Column(name = "FK_PRODUCTO_ID")
    private Long productoId;*/

    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    private CompraDO compra;
    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    private ProductoDO producto;

    public RelCompraProductoDO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompraDO getCompra() {
        return compra;
    }

    public void setCompra(CompraDO compra) {
        this.compra = compra;
    }

    public ProductoDO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDO producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "RelCompraProductoDO [id=" + id + ", compra=" + compra + ", producto=" + producto + "]";
    }

    
    

    
}
