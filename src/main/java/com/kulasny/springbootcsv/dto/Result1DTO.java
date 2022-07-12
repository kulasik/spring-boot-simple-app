package com.kulasny.springbootcsv.dto;

import java.time.LocalDate;

public class Result1DTO {
    private String nrKarty;
    private LocalDate dataD;
    private Integer kod;
    private String jedn;
    private Integer firma;
    private String typ;
    private String nazwaSkrot;
    private Integer nrMag;
    private String opis;

    public Result1DTO(String nrKarty,
                      LocalDate dataD,
                      Integer kod,
                      String jedn,
                      Integer firma,
                      String typ,
                      String nazwaSkrot,
                      Integer nrMag,
                      String opis
    ) {
        this.nrKarty = nrKarty;
        this.dataD = dataD;
        this.kod = kod;
        this.jedn = jedn;
        this.firma = firma;
        this.typ = typ;
        this.nazwaSkrot = nazwaSkrot;
        this.nrMag = nrMag;
        this.opis = opis;
    }

    public String getNrKarty() {
        return nrKarty;
    }

    public LocalDate getDataD() {
        return dataD;
    }

    public Integer getKod() {
        return kod;
    }

    public String getJedn() {
        return jedn;
    }

    public Integer getFirma() {
        return firma;
    }

    public String getTyp() {
        return typ;
    }

    public String getNazwaSkrot() {
        return nazwaSkrot;
    }

    public Integer getNrMag() {
        return nrMag;
    }

    public String getOpis() {
        return opis;
    }

    public void setNrKarty(String nrKarty) {
        this.nrKarty = nrKarty;
    }

    public void setDataD(LocalDate dataD) {
        this.dataD = dataD;
    }

    public void setKod(Integer kod) {
        this.kod = kod;
    }

    public void setJedn(String jedn) {
        this.jedn = jedn;
    }

    public void setFirma(Integer firma) {
        this.firma = firma;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setNazwaSkrot(String nazwaSkrot) {
        this.nazwaSkrot = nazwaSkrot;
    }

    public void setNrMag(Integer nrMag) {
        this.nrMag = nrMag;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
