package iza.nutrition.projectNutri.service;

import iza.nutrition.projectNutri.model.Antropometria;
import iza.nutrition.projectNutri.repository.AntropometriaRepository;

import java.util.List;

public interface CadastroAntropometriaService{
    List<Antropometria> listarTodosAntropometrias();
    Antropometria buscarAntropometriaPorId(Long id);
    List<Antropometria> listarAntropometriaPorPaciente(Long pacienteId);
    Antropometria adicionar(Antropometria antropometria);
    Antropometria atualizarAntropometria(Long id, Antropometria antropometria);
    Void deletarAntropometria(Long id);

}
