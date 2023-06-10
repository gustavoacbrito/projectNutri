package iza.nutrition.projectNutri.dto;

import iza.nutrition.projectNutri.model.Antropometria;
import iza.nutrition.projectNutri.model.CircunferenciasCorporais;
import iza.nutrition.projectNutri.model.Dobras;
import iza.nutrition.projectNutri.model.Paciente;

import java.time.LocalDate;

public class AntropometriaDto{
    private LocalDate dataConsulta;
    private Double peso;
    private Double altura;
    private Double alturaSentado;
    private Double alturaDoJoelho;
    private Double dobraTripicital;
    private Double dobraAbdominal;
    private Double dobraAxilarMedia;
    private Double dobraToracica;
    private Double dobraSubescapular;
    private Double dobraCoxa;
    private Double dobraSuprailiaca;
    private Double pescoco;
    private Double ombro;
    private Double quadril;
    private Double bracoRelaxado;
    private Double bracoContraido;
    private Double Antebraco;
    private Double coxaProximal;
    private Double coxaMedial;
    private Double coxaDistal;
    private Double panturrilha;
    private Double torax;
    private Double cintura;
    private Double abdomen;
    private Long paciente_Id;

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAlturaSentado() {
        return alturaSentado;
    }

    public void setAlturaSentado(Double alturaSentado) {
        this.alturaSentado = alturaSentado;
    }

    public Double getAlturaDoJoelho() {
        return alturaDoJoelho;
    }

    public void setAlturaDoJoelho(Double alturaDoJoelho) {
        this.alturaDoJoelho = alturaDoJoelho;
    }

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
        return Antebraco;
    }

    public void setAntebraco(Double antebraco) {
        Antebraco = antebraco;
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

    public Long getPaciente_Id() {
        return paciente_Id;
    }

    public void setPaciente_Id(Long paciente_Id) {
        this.paciente_Id = paciente_Id;
    }

    public Antropometria toEntity() {

        Dobras dobras = new Dobras();
        dobras.setDobraTripicital(this.dobraTripicital);
        dobras.setDobraAbdominal(this.dobraAbdominal);
        dobras.setDobraAxilarMedia(this.dobraAxilarMedia);
        dobras.setDobraToracica(this.dobraToracica);
        dobras.setDobraSubescapular(this.dobraSubescapular);
        dobras.setDobraCoxa(this.dobraCoxa);
        dobras.setDobraSuprailiaca(this.dobraSuprailiaca);
        CircunferenciasCorporais circunferenciasCorporais = new CircunferenciasCorporais();
        circunferenciasCorporais.setPescoco(this.pescoco);
        circunferenciasCorporais.setOmbro(this.ombro);
        circunferenciasCorporais.setQuadril(this.quadril);
        circunferenciasCorporais.setBracoRelaxado(this.bracoRelaxado);
        circunferenciasCorporais.setBracoContraido(this.bracoContraido);
        circunferenciasCorporais.setAntebraco(this.Antebraco);
        circunferenciasCorporais.setCoxaProximal(this.coxaProximal);
        circunferenciasCorporais.setCoxaMedial(this.coxaMedial);
        circunferenciasCorporais.setCoxaDistal(this.coxaDistal);
        circunferenciasCorporais.setPanturrilha(this.panturrilha);
        circunferenciasCorporais.setTorax(this.torax);
        circunferenciasCorporais.setCintura(this.cintura);
        circunferenciasCorporais.setAbdomen(this.abdomen);
        Antropometria antropometria = new Antropometria();
        antropometria.setDataConsulta(this.dataConsulta);
        antropometria.setPeso(this.peso);
        antropometria.setAltura(this.altura);
        antropometria.setAlturaSentado(this.alturaSentado);
        antropometria.setAlturaDoJoelho(this.alturaDoJoelho);
        antropometria.setCircunferenciasCorporais(circunferenciasCorporais);
        antropometria.setDobras(dobras);
        antropometria.setPaciente(new Paciente(this.paciente_Id));
        return antropometria;
    }
}
