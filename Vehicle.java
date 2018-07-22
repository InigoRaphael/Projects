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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Rymar
 */
@Entity
@Table(name = "vehicle", catalog = "VRS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v"),
    @NamedQuery(name = "Vehicle.findByVehicleID", query = "SELECT v FROM Vehicle v WHERE v.vehicleID = :vehicleID"),
    @NamedQuery(name = "Vehicle.findByCustomerID", query = "SELECT v FROM Vehicle v WHERE v.customerID = :customerID"),
    @NamedQuery(name = "Vehicle.findByModel", query = "SELECT v FROM Vehicle v WHERE v.model = :model"),
    @NamedQuery(name = "Vehicle.findByManufacturer", query = "SELECT v FROM Vehicle v WHERE v.manufacturer = :manufacturer"),
    @NamedQuery(name = "Vehicle.findByPlateNo", query = "SELECT v FROM Vehicle v WHERE v.plateNo = :plateNo")})
public class Vehicle implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VehicleID")
    private Integer vehicleID;
    @Column(name = "CustomerID")
    private Integer customerID;
    @Column(name = "Model")
    private String model;
    @Column(name = "Manufacturer")
    private String manufacturer;
    @Column(name = "PlateNo")
    private String plateNo;
    @Lob
    @Column(name = "Image")
    private byte[] image;

    public Vehicle() {
    }

    public Vehicle(Integer vehicleID) {
        this.vehicleID = vehicleID;
    }

    public Integer getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Integer vehicleID) {
        Integer oldVehicleID = this.vehicleID;
        this.vehicleID = vehicleID;
        changeSupport.firePropertyChange("vehicleID", oldVehicleID, vehicleID);
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        Integer oldCustomerID = this.customerID;
        this.customerID = customerID;
        changeSupport.firePropertyChange("customerID", oldCustomerID, customerID);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String oldModel = this.model;
        this.model = model;
        changeSupport.firePropertyChange("model", oldModel, model);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        String oldManufacturer = this.manufacturer;
        this.manufacturer = manufacturer;
        changeSupport.firePropertyChange("manufacturer", oldManufacturer, manufacturer);
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        String oldPlateNo = this.plateNo;
        this.plateNo = plateNo;
        changeSupport.firePropertyChange("plateNo", oldPlateNo, plateNo);
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        byte[] oldImage = this.image;
        this.image = image;
        changeSupport.firePropertyChange("image", oldImage, image);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehicleID != null ? vehicleID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) object;
        if ((this.vehicleID == null && other.vehicleID != null) || (this.vehicleID != null && !this.vehicleID.equals(other.vehicleID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "repairshop.Vehicle[ vehicleID=" + vehicleID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
