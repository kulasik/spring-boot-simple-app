package com.kulasny.springbootcsv.dto;

import java.time.LocalDate;

public class Result2DTO {
    private String nrKarty;
    private LocalDate dataW;
    private Integer kod;
    private Integer firma;
    private String nazwaSkrot;
    private String typ;
    private String opis;

    public Result2DTO(String nrKarty,
                      LocalDate dataW,
                      Integer kod,
                      Integer firma,
                      String nazwaSkrot,
                      String typ,
                      String opis
    ) {
        this.nrKarty = nrKarty;
        this.dataW = dataW;
        this.kod = kod;
        this.firma = firma;
        this.nazwaSkrot = nazwaSkrot;
        this.typ = typ;
        this.opis = opis;
    }

    public String getNrKarty() {
        return nrKarty;
    }

    public void setNrKarty(String nrKarty) {
        this.nrKarty = nrKarty;
    }

    public LocalDate getDataW() {
        return dataW;
    }

    public void setDataW(LocalDate dataW) {
        this.dataW = dataW;
    }

    public Integer getKod() {
        return kod;
    }

    public void setKod(Integer kod) {
        this.kod = kod;
    }

    public Integer getFirma() {
        return firma;
    }

    public void setFirma(Integer firma) {
        this.firma = firma;
    }

    public String getNazwaSkrot() {
        return nazwaSkrot;
    }

    public void setNazwaSkrot(String nazwaSkrot) {
        this.nazwaSkrot = nazwaSkrot;
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
}
