package iza.nutrition.projectNutri.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;
import java.util.Objects;

@Entity // This tells Hibernate to make a table out of this class
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String nome;
    @Column
    @NotNull
    @Past
    private LocalDate dataNascimento;
    @Column
    @NotBlank
    private String genero;
    @Column
    @NotBlank
    private String cpf;
    @Column
    @NotBlank
    private String celular;
    @Column
    @NotBlank
    @Email
    private String email;
    @Column
    private String instagram;
    @Column
    @Embedded
    private Endereco endereco;

    public Paciente() {
    }

    public Paciente(Long id) {
        this.id = id;
    }

    public Paciente(Long id, String nome, LocalDate dataNascimento, String genero, String cpf, String celular, String email, String instagram, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
        this.instagram = instagram;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(id, paciente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}