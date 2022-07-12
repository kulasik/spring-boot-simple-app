package com.kulasny.springbootcsv.model;

import javax.persistence.*;

@Entity
@Table(name = "magazynp")
public class WarehouseIn {

    @Id
    @Column(
            name = "nr_karty"
    )
    private String nrKarty;

    @Column(
            name = "data",
            nullable = false
    )
    private String data;

    @Column(
            name = "masa",
            nullable = false
    )
    private Double masa;

    @Column(
            name = "jedn",
            nullable = false
    )
    private String jedn;

    @Column(
            name = "firma",
            nullable = false
    )
    private String firma;

    @Column(
            name = "nr_mag",
            nullable = false
    )
    private Integer nrMag;

    @Column(
            name = "nr_odpadu",
            nullable = false
    )
    private Integer nrOdpadu;

    @Column(
            name = "nr_klienta",
            nullable = false
    )
    private Integer nrKlienta;

    @ManyToOne
    @JoinColumn(
            foreignKey = @ForeignKey(
                    foreignKeyDefinition = "FOREIGN KEY(nr_klienta) REFERENCES dostawcy(nr_klienta)"
            )
    )
    private Suppliers suppliers;

    @ManyToOne
    @JoinColumn(
            foreignKey = @ForeignKey(
                    foreignKeyDefinition = "FOREIGN KEY(nr_odpadu) REFERENCES slownik(nr_odpadu)"
            )
    )

    private Dictionary dictionary;

    public WarehouseIn(String nrKarty,
                       String data,
                       Double masa,
                       String jedn,
                       String firma,
                       Integer nrMag,
                       Integer nrOdpadu,
                       Integer nrKlienta
    ) {
        this.nrKarty = nrKarty;
        this.data = data;
        this.masa = masa;
        this.jedn = jedn;
        this.firma = firma;
        this.nrMag = nrMag;
        this.nrOdpadu = nrOdpadu;
        this.nrKlienta = nrKlienta;
    }

    public WarehouseIn() {
    }

    public String getNrKarty() {
        return nrKarty;
    }

    public void setNrKarty(String nrKarty) {
        this.nrKarty = nrKarty;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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

    public Integer getNrOdpadu() {
        return nrOdpadu;
    }

    public void setNrOdpadu(Integer nrOdpadu) {
        this.nrOdpadu = nrOdpadu;
    }

    public Integer getNrKlienta() {
        return nrKlienta;
    }

    public void setNrKlienta(Integer nrKlienta) {
        this.nrKlienta = nrKlienta;
    }

    @Override
    public String toString() {
        return "WarehouseIn{" +
                "nrKarty='" + nrKarty + '\'' +
                ", data='" + data + '\'' +
                ", masa=" + masa +
                ", jedn='" + jedn + '\'' +
                ", firma='" + firma + '\'' +
                ", nrMag=" + nrMag +
                ", nrOdpadu=" + nrOdpadu +
                ", nrKlienta=" + nrKlienta +
                '}';
    }
}
