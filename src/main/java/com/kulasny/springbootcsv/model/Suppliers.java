package com.kulasny.springbootcsv.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dostawcy")
public class Suppliers {

    @Id
    @Column(
            name = "nr_klienta"
    )
    private Integer nrKlienta;

    @Column(
            name = "miasto",
            nullable = false
    )
    private String miasto;

    @Column(
            name = "ulica",
            nullable = false
    )
    private String ulica;

    @Column(
            name = "nazwa_skrot",
            nullable = false
    )
    private String nazwaSkrot;


    @OneToMany(mappedBy = "suppliers")
    private Set<WarehouseIn> warehouseInSet;

    public Suppliers(Integer nrKlienta,
                     String miasto,
                     String ulica,
                     String nazwaSkrot
    ) {
        this.nrKlienta = nrKlienta;
        this.miasto = miasto;
        this.ulica = ulica;
        this.nazwaSkrot = nazwaSkrot;
    }

    public Suppliers() {
    }

    public Integer getNrKlienta() {
        return nrKlienta;
    }

    public void setNrKlienta(Integer nrKlienta) {
        this.nrKlienta = nrKlienta;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNazwaSkrot() {
        return nazwaSkrot;
    }

    public void setNazwaSkrot(String nazwaSkrot) {
        this.nazwaSkrot = nazwaSkrot;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                "nrKlienta=" + nrKlienta +
                ", miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", nazwaSkrot='" + nazwaSkrot + '\'' +
                '}';
    }
}
