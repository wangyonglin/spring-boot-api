package com.wangyonglin.domain;
import javax.persistence.*;

@Entity
@Table(name = "customer_manager_table")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "phome")
    private String phome;
    @Column(name = "address")
    private String address;

    @Column(name = "datatime")
    private String datatime;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "enabled")
    private String enabled;

    public Customer() {
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhome() {
        return phome;
    }

    public void setPhome(String phome) {
        this.phome = phome;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phome='" + phome + '\'' +
                ", address='" + address + '\'' +
                ", datatime='" + datatime + '\'' +
                ", remarks='" + remarks + '\'' +
                ", enabled='" + enabled + '\'' +
                '}';
    }
}
