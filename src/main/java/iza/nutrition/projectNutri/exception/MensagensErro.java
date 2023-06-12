package iza.nutrition.projectNutri.exception;

public class MensagensErro {
    public static final String REGISTRO_NAO_ENCONTRADO = "O registro solicitado não foi encontrado.";
    public static final String REGISTRO_JA_EXISTENTE = "Um registro com mesmo CPF/Email já existe no banco de dados.";
    public static final String CADASTRO_NAO_REALIZADO = "Não foi possível cadastrar as informações antropométricas para esse paciente devido à inexistência de registros do paciente no banco de dados.";
    public static final String PACIENTE_SEM_ANTROPOMETRIAS = "Não existem registros de antropometrias para este paciente";
}

