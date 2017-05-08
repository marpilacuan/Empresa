/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mar-G
 */
@Entity
@Table(name = "DEPARTAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d")
    , @NamedQuery(name = "Departamento.findByCodDep", query = "SELECT d FROM Departamento d WHERE d.codDep = :codDep")
    , @NamedQuery(name = "Departamento.findByNombreDep", query = "SELECT d FROM Departamento d WHERE d.nombreDep = :nombreDep")
    , @NamedQuery(name = "Departamento.findByLocalizacion", query = "SELECT d FROM Departamento d WHERE d.localizacion = :localizacion")})
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_DEP")
    private Integer codDep;
    @Size(max = 40)
    @Column(name = "NOMBRE_DEP")
    private String nombreDep;
    @Size(max = 40)
    @Column(name = "LOCALIZACION")
    private String localizacion;

    public Departamento() {
    }

    public Departamento(Integer codDep) {
        this.codDep = codDep;
    }

    public Integer getCodDep() {
        return codDep;
    }

    public void setCodDep(Integer codDep) {
        this.codDep = codDep;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDep != null ? codDep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.codDep == null && other.codDep != null) || (this.codDep != null && !this.codDep.equals(other.codDep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Departamento[ codDep=" + codDep + " ]";
    }
    
}
