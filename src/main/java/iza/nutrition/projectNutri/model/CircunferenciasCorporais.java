package iza.nutrition.projectNutri.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class CircunferenciasCorporais {
    private Double pescoco;
    private Double ombro;
    private Double quadril;
    private Double bracoRelaxado;
    private Double bracoContraido;
    private Double antebraco;
    private Double coxaProximal;
    private Double coxaMedial;
    private Double coxaDistal;
    private Double panturrilha;
    private Double torax;
    private Double cintura;
    private Double abdomen;

    public Double getPescoco() {
        return pescoco;
    }

    public void setPescoco(Double pescoco) {
        this.pescoco = pescoco;
    }

    public Double getOmbro() {
        return ombro;
    }

    public void setOmbro(Double ombro) {
        this.ombro = ombro;
    }

    public Double getQuadril() {
        return quadril;
    }

    public void setQuadril(Double quadril) {
        this.quadril = quadril;
    }

    public Double getBracoRelaxado() {
        return bracoRelaxado;
    }

    public void setBracoRelaxado(Double bracoRelaxado) {
        this.bracoRelaxado = bracoRelaxado;
    }

    public Double getBracoContraido() {
        return bracoContraido;
    }

    public void setBracoContraido(Double bracoContraido) {
        this.bracoContraido = bracoContraido;
    }

    public Double getAntebraco() {
        return antebraco;
    }

    public void setAntebraco(Double antebraco) {
        this.antebraco = antebraco;
    }

    public Double getCoxaProximal() {
        return coxaProximal;
    }

    public void setCoxaProximal(Double coxaProximal) {
        this.coxaProximal = coxaProximal;
    }

    public Double getCoxaMedial() {
        return coxaMedial;
    }

    public void setCoxaMedial(Double coxaMedial) {
        this.coxaMedial = coxaMedial;
    }

    public Double getCoxaDistal() {
        return coxaDistal;
    }

    public void setCoxaDistal(Double coxaDistal) {
        this.coxaDistal = coxaDistal;
    }

    public Double getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(Double panturrilha) {
        this.panturrilha = panturrilha;
    }

    public Double getTorax() {
        return torax;
    }

    public void setTorax(Double torax) {
        this.torax = torax;
    }

    public Double getCintura() {
        return cintura;
    }

    public void setCintura(Double cintura) {
        this.cintura = cintura;
    }

    public Double getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(Double abdomen) {
        this.abdomen = abdomen;
    }
}
