package com.kulasny.springbootcsv.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "slownik")
public class Dictionary {

    @Column(
            name = "gr",
            nullable = false
    )
    private String gr;

    @Column(
            name = "podgr",
            nullable = false
    )
    private String podgr;

    @Column(
            name = "rodz",
            nullable = false
    )
    private String rodz;

    @Column(
            name = "typ",
            nullable = false
    )
    private String typ;

    @Column(
            name = "opis",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String opis;

    @Id
    @Column(
            name = "nr_odpadu"
    )
    private Integer nrOdpadu;

    @OneToMany(mappedBy = "dictionary")
    private Set<WarehouseIn> warehouseInSet;

    public Dictionary(String gr,
                      String podgr,
                      String rodz,
                      String typ,
                      String opis,
                      Integer nrOdpadu
    ) {
        this.gr = gr;
        this.podgr = podgr;
        this.rodz = rodz;
        this.typ = typ;
        this.opis = opis;
        this.nrOdpadu = nrOdpadu;
    }

    public Dictionary() {
    }

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public String getPodgr() {
        return podgr;
    }

    public void setPodgr(String podgr) {
        this.podgr = podgr;
    }

    public String getRodz() {
        return rodz;
    }

    public void setRodz(String rodz) {
        this.rodz = rodz;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Integer getNrOdpadu() {
        return nrOdpadu;
    }

    public void setNrOdpadu(Integer nrOdpadu) {
        this.nrOdpadu = nrOdpadu;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "gr='" + gr + '\'' +
                ", podgr='" + podgr + '\'' +
                ", rodz='" + rodz + '\'' +
                ", typ='" + typ + '\'' +
                ", opis='" + opis + '\'' +
                ", nrOdpadu=" + nrOdpadu +
                '}';
    }
}
