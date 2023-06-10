package iza.nutrition.projectNutri.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Dobras {
    private Double dobraTripicital;
    private Double dobraAbdominal;
    private Double dobraAxilarMedia;
    private Double dobraToracica;
    private Double dobraSubescapular;
    private Double dobraCoxa;
    private Double dobraSuprailiaca;

    public Double getDobraTripicital() {
        return dobraTripicital;
    }

    public void setDobraTripicital(Double dobraTripicital) {
        this.dobraTripicital = dobraTripicital;
    }

    public Double getDobraAbdominal() {
        return dobraAbdominal;
    }

    public void setDobraAbdominal(Double dobraAbdominal) {
        this.dobraAbdominal = dobraAbdominal;
    }

    public Double getDobraAxilarMedia() {
        return dobraAxilarMedia;
    }

    public void setDobraAxilarMedia(Double dobraAxilarMedia) {
        this.dobraAxilarMedia = dobraAxilarMedia;
    }

    public Double getDobraToracica() {
        return dobraToracica;
    }

    public void setDobraToracica(Double dobraToracica) {
        this.dobraToracica = dobraToracica;
    }

    public Double getDobraSubescapular() {
        return dobraSubescapular;
    }

    public void setDobraSubescapular(Double dobraSubescapular) {
        this.dobraSubescapular = dobraSubescapular;
    }

    public Double getDobraCoxa() {
        return dobraCoxa;
    }

    public void setDobraCoxa(Double dobraCoxa) {
        this.dobraCoxa = dobraCoxa;
    }

    public Double getDobraSuprailiaca() {
        return dobraSuprailiaca;
    }

    public void setDobraSuprailiaca(Double dobraSuprailiaca) {
        this.dobraSuprailiaca = dobraSuprailiaca;
    }
}
