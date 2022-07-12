package com.kulasny.springbootcsv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "magazynW")
public class WarehouseOut {
    @Id
    private String nrKarty;

    @Column(
            nullable = false
    )
    private LocalDate data;

    @Column(
            nullable = false
    )
    private Double masa;

    @Column(
            nullable = false
    )
    private String jedn;

    @Column(
            nullable = false
    )
    private String firma;

    @Column(
            nullable = false
    )
    private Integer nrMag;

    @Column(
            nullable = false
    )
    private Integer nrKlienta;

    public WarehouseOut(String nrKarty,
                        LocalDate data,
                        Double masa,
                        String jedn,
                        String firma,
                        Integer nrMag,
                        Integer nrKlienta
    ){
        this.nrKarty = nrKarty;
        this.data = data;
        this.masa = masa;
        this.jedn = jedn;
        this.firma = firma;
        this.nrMag = nrMag;
        this.nrKlienta = nrKlienta;
    }

    public WarehouseOut() {
    }

    public String getNrKarty() {
        return nrKarty;
    }

    public void setNrKarty(String nrKarty) {
        this.nrKarty = nrKarty;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getMasa() {
        return masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public String getJedn() {
        return jedn;
    }

    public void setJedn(String jedn) {
        this.jedn = jedn;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Integer getNrMag() {
        return nrMag;
    }

    public void setNrMag(Integer nrMag) {
        this.nrMag = nrMag;
    }

    public Integer getNrKlienta() {
        return nrKlienta;
    }

    public void setNrKlienta(Integer nrKlienta) {
        this.nrKlienta = nrKlienta;
    }

    @Override
    public String toString() {
        return "WarehouseOut{" +
                "nrKarty='" + nrKarty + '\'' +
                ", data=" + data +
                ", masa=" + masa +
                ", jedn='" + jedn + '\'' +
                ", firma='" + firma + '\'' +
                ", nrMag=" + nrMag +
                ", nrKlienta=" + nrKlienta +
                '}';
    }
}
