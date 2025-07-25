/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jalt2
 */
@Entity
@Table(name = "computadoras")
public class ComputadoraDominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "direccionIP")
    private String direccionIP;
    
    @Column(name = "numeroComputadora")
    private String numeroComputadora;
    
    @Column(name = "estatus")
    private String estatus;

    //Lista de softwares
    
    //Relacion 1:1 con alumno
    
    //Realcion N:M con laboratorio
    
    public ComputadoraDominio() {
    }

    public ComputadoraDominio(Long id, String direccionIP, String numeroComputadora, String estatus) {
        this.id = id;
        this.direccionIP = direccionIP;
        this.numeroComputadora = numeroComputadora;
        this.estatus = estatus;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getNumeroComputadora() {
        return numeroComputadora;
    }

    public void setNumeroComputadora(String numeroComputadora) {
        this.numeroComputadora = numeroComputadora;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComputadoraDominio)) {
            return false;
        }
        ComputadoraDominio other = (ComputadoraDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ComputadoraDominio[ id=" + id + " ]";
    }
    
}
