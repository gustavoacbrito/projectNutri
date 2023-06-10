package iza.nutrition.projectNutri.service;

import iza.nutrition.projectNutri.model.Paciente;


import java.util.List;

public interface CadastroPacienteService {
    List<Paciente> listarTodosPacientes();
    Paciente buscarPacientesPorId(Long id);
    Paciente adicionar(Paciente paciente);
    List<Paciente> adicionarLista(List<Paciente> paciente);
    Paciente atualizarPaciente(Long id, Paciente paciente);
    Void deletarPaciente(Long id);
    List<Paciente> buscarPacientesPorNome(String nome);
}
