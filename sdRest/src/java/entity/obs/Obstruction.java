/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.obs;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Facundo
 */
@Entity
@Table(name = "obstruction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Obstruction.findAll", query = "SELECT o FROM Obstruction o"),
    @NamedQuery(name = "Obstruction.findByIdobstruction", query = "SELECT o FROM Obstruction o WHERE o.idobstruction = :idobstruction"),
    @NamedQuery(name = "Obstruction.findByObstructionlocation", query = "SELECT o FROM Obstruction o WHERE o.obstructionlocation = :obstructionlocation"),
    @NamedQuery(name = "Obstruction.findByObstructiondate", query = "SELECT o FROM Obstruction o WHERE o.obstructiondate = :obstructiondate"),
    //@NamedQuery(name = "Obstruction.find", query = "INSERT INTO Obstruction (idobstruction)VALUES(8)"),
    @NamedQuery(name = "Obstruction.findByObstructiondescription", query = "SELECT o FROM Obstruction o WHERE o.obstructiondescription = :obstructiondescription")})
public class Obstruction implements Serializable {
    @Column(name = "lng")
    private Float lng;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Lat")
    private Float lat;
   // @Column(name = "lat")
   // private Integer lat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
   // @Column(name = "long")

  //  @Size(max = 45)
  //  @Column(name = "obstructioncol")
    //private String obstructioncol;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idobstruction")
    private Integer idobstruction;
    @Size(max = 255)
    @Column(name = "obstructionlocation")
    private String obstructionlocation;
    @Column(name = "obstructiondate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date obstructiondate;
    @Size(max = 255)
    @Column(name = "obstructiondescription")
    private String obstructiondescription;

    public Obstruction() {
    }

    public Obstruction(Integer idobstruction) {
        this.idobstruction = idobstruction;
    }

    public Integer getIdobstruction() {
        return idobstruction;
    }

    public void setIdobstruction(Integer idobstruction) {
        this.idobstruction = idobstruction;
    }

    public String getObstructionlocation() {
        return obstructionlocation;
    }

    public void setObstructionlocation(String obstructionlocation) {
        this.obstructionlocation = obstructionlocation;
    }

    public Date getObstructiondate() {
        return obstructiondate;
    }

    public void setObstructiondate(Date obstructiondate) {
        this.obstructiondate = obstructiondate;
    }

    public String getObstructiondescription() {
        return obstructiondescription;
    }

    public void setObstructiondescription(String obstructiondescription) {
        this.obstructiondescription = obstructiondescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idobstruction != null ? idobstruction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Obstruction)) {
            return false;
        }
        Obstruction other = (Obstruction) object;
        if ((this.idobstruction == null && other.idobstruction != null) || (this.idobstruction != null && !this.idobstruction.equals(other.idobstruction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.obs.Obstruction[ idobstruction=" + idobstruction + " ]";
    }
    
    public void up(){
        
    }


    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }
}
