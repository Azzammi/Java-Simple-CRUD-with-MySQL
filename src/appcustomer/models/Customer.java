/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcustomer.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mmut-
 */
@Entity
@Table(name = "customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByKodecustomer", query = "SELECT c FROM Customer c WHERE c.kodecustomer = :kodecustomer")
    , @NamedQuery(name = "Customer.findByNamacustomer", query = "SELECT c FROM Customer c WHERE c.namacustomer = :namacustomer")
    , @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodecustomer")
    private String kodecustomer;
    @Basic(optional = false)
    @Column(name = "namacustomer")
    private String namacustomer;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public Customer() {
    }

    public Customer(String kodecustomer) {
        this.kodecustomer = kodecustomer;
    }

    public Customer(String kodecustomer, String namacustomer, String email) {
        this.kodecustomer = kodecustomer;
        this.namacustomer = namacustomer;
        this.email = email;
    }

    public String getKodecustomer() {
        return kodecustomer;
    }

    public void setKodecustomer(String kodecustomer) {
        this.kodecustomer = kodecustomer;
    }

    public String getNamacustomer() {
        return namacustomer;
    }

    public void setNamacustomer(String namacustomer) {
        this.namacustomer = namacustomer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodecustomer != null ? kodecustomer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.kodecustomer == null && other.kodecustomer != null) || (this.kodecustomer != null && !this.kodecustomer.equals(other.kodecustomer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appcustomer.models.Customer[ kodecustomer=" + kodecustomer + " ]";
    }
    
}
