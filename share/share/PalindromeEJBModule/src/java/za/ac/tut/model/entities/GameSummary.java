/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Student
 */
@Entity
public class GameSummary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer totNumbersChecked;
    private Integer totNumOfPalindromes;
    private Integer totNumOfNonPalindromes;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date creationDate;

    public GameSummary() {
    }

    public GameSummary(Integer id, Integer totNumbersChecked, Integer totNumOfPalindromes, Integer totNumOfNonPalindromes, Date creationDate) {
        this.id = id;
        this.totNumbersChecked = totNumbersChecked;
        this.totNumOfPalindromes = totNumOfPalindromes;
        this.totNumOfNonPalindromes = totNumOfNonPalindromes;
        this.creationDate = creationDate;
    }

    public GameSummary(Integer totNumbersChecked, Integer totNumOfPalindromes, Integer totNumOfNonPalindromes, Date creationDate) {
        this.totNumbersChecked = totNumbersChecked;
        this.totNumOfPalindromes = totNumOfPalindromes;
        this.totNumOfNonPalindromes = totNumOfNonPalindromes;
        this.creationDate = creationDate;
    }

    public Integer getTotNumbersChecked() {
        return totNumbersChecked;
    }

    public void setTotNumbersChecked(Integer totNumbersChecked) {
        this.totNumbersChecked = totNumbersChecked;
    }

    public Integer getTotNumOfPalindromes() {
        return totNumOfPalindromes;
    }

    public void setTotNumOfPalindromes(Integer totNumOfPalindromes) {
        this.totNumOfPalindromes = totNumOfPalindromes;
    }

    public Integer getTotNumOfNonPalindromes() {
        return totNumOfNonPalindromes;
    }

    public void setTotNumOfNonPalindromes(Integer totNumOfNonPalindromes) {
        this.totNumOfNonPalindromes = totNumOfNonPalindromes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof GameSummary)) {
            return false;
        }
        GameSummary other = (GameSummary) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.model.entities.GameSummary[ id=" + id + " ]";
    }
    
}
