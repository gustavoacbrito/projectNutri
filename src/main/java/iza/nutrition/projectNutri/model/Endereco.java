package iza.nutrition.projectNutri.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    @Column(nullable = false)
    private String logradouro;
    @Column(nullable = false)
    private String numero;
    @Column(nullable = false)
    private String cep;
    @Column(nullable = false)
    private String complemento;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private String pais;

    public Endereco() {
    }

    public Endereco(String logradouro,
                    String numero,
                    String cep,
                    String complemento,
                    String cidade,
                    String estado,
                    String pais) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
