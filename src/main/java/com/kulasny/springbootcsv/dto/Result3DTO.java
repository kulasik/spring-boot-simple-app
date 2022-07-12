package com.kulasny.springbootcsv.dto;

import java.util.Map;

public class Result3DTO {
    private Integer nrKlienta;
    private Integer kodOdpadu;
    private Map<String,Integer> sumaOdpadow;

    public Result3DTO(Integer nrKlienta,
                      Integer kodOdpadu,
                      Map<String, Integer> sumaOdpadow
    ) {
        this.nrKlienta = nrKlienta;
        this.kodOdpadu = kodOdpadu;
        this.sumaOdpadow = sumaOdpadow;
    }

    public Integer getNrKlienta() {
        return nrKlienta;
    }

    public void setNrKlienta(Integer nrKlienta) {
        this.nrKlienta = nrKlienta;
    }

    public Integer getKodOdpadu() {
        return kodOdpadu;
    }

    public void setKodOdpadu(Integer kodOdpadu) {
        this.kodOdpadu = kodOdpadu;
    }

    public Map<String, Integer> getSumaOdpadow() {
        return sumaOdpadow;
    }

    public void setSumaOdpadow(Map<String, Integer> sumaOdpadow) {
        this.sumaOdpadow = sumaOdpadow;
    }
}
