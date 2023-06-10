package iza.nutrition.projectNutri.dto;


import iza.nutrition.projectNutri.model.Endereco;
import iza.nutrition.projectNutri.model.Paciente;

import java.time.LocalDate;

public class PacienteDto {
    private String nome;
    private LocalDate dataNascimento;
    private String genero;
    private String cpf;
    private String celular;
    private String email;
    private String instagram;
    private String logradouro;
    private String numero;
    private String cep;
    private String complemento;
    private String cidade;
    private String estado;
    private String pais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
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

    public Paciente toEntity() {
        Endereco endereco = new Endereco();
        endereco.setLogradouro(this.logradouro);
        endereco.setNumero(this.numero);
        endereco.setCep(this.cep);
        endereco.setComplemento(this.complemento);
        endereco.setCidade(this.cidade);
        endereco.setEstado(this.estado);
        endereco.setPais(this.pais);
        Paciente paciente = new Paciente();
        paciente.setNome(this.nome);
        paciente.setDataNascimento(this.dataNascimento);
        paciente.setGenero(this.genero);
        paciente.setCpf(this.cpf);
        paciente.setCelular(this.celular);
        paciente.setEmail(this.email);
        paciente.setInstagram(this.instagram);
        paciente.setEndereco(endereco);
        return paciente;
    }
}
