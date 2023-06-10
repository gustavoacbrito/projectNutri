package iza.nutrition.projectNutri.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "antropometria")
public class Antropometria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private LocalDate dataConsulta;
    @Column(nullable = false)
    private Double peso;
    @Column(nullable = false)
    private Double altura;
    @Column(nullable = false)
    private Double alturaSentado;
    @Column(nullable = false)
    private Double alturaDoJoelho;
    @Embedded
    private Dobras dobras;
    @Embedded
    private CircunferenciasCorporais circunferenciasCorporais;
    @ManyToOne
    private Paciente paciente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Dobras getDobras() {
        return dobras;
    }

    public void setDobras(Dobras dobras) {
        this.dobras = dobras;
    }

    public CircunferenciasCorporais getCircunferenciasCorporais() {
        return circunferenciasCorporais;
    }

    public void setCircunferenciasCorporais(CircunferenciasCorporais circunferenciasCorporais) {
        this.circunferenciasCorporais = circunferenciasCorporais;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
