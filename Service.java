/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repairshop;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Rymar
 */
@Entity
@Table(name = "service", catalog = "VRS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Service.findAll", query = "SELECT s FROM Service s"),
    @NamedQuery(name = "Service.findByServiceID", query = "SELECT s FROM Service s WHERE s.serviceID = :serviceID"),
    @NamedQuery(name = "Service.findByVehicleID", query = "SELECT s FROM Service s WHERE s.vehicleID = :vehicleID"),
    @NamedQuery(name = "Service.findByServiceName", query = "SELECT s FROM Service s WHERE s.serviceName = :serviceName")})
public class Service implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ServiceID")
    private Integer serviceID;
    @Column(name = "VehicleID")
    private Integer vehicleID;
    @Column(name = "ServiceName")
    private String serviceName;

    public Service() {
    }

    public Service(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public Integer getServiceID() {
        return serviceID;
    }

    public void setServiceID(Integer serviceID) {
        Integer oldServiceID = this.serviceID;
        this.serviceID = serviceID;
        changeSupport.firePropertyChange("serviceID", oldServiceID, serviceID);
    }

    public Integer getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Integer vehicleID) {
        Integer oldVehicleID = this.vehicleID;
        this.vehicleID = vehicleID;
        changeSupport.firePropertyChange("vehicleID", oldVehicleID, vehicleID);
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        String oldServiceName = this.serviceName;
        this.serviceName = serviceName;
        changeSupport.firePropertyChange("serviceName", oldServiceName, serviceName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceID != null ? serviceID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Service)) {
            return false;
        }
        Service other = (Service) object;
        if ((this.serviceID == null && other.serviceID != null) || (this.serviceID != null && !this.serviceID.equals(other.serviceID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "repairshop.Service[ serviceID=" + serviceID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
