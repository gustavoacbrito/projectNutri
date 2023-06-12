package iza.nutrition.projectNutri.service.serviceImp;

import iza.nutrition.projectNutri.exception.BusinessRulesException;
import iza.nutrition.projectNutri.exception.MensagensErro;
import iza.nutrition.projectNutri.model.Antropometria;
import iza.nutrition.projectNutri.repository.AntropometriaRepository;
import iza.nutrition.projectNutri.repository.PacienteRepository;
import iza.nutrition.projectNutri.service.CadastroAntropometriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CadastroAntropometriaServiceImpl implements CadastroAntropometriaService {

    @Autowired
    private AntropometriaRepository antropometriaRepository;
    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<Antropometria> listarTodosAntropometrias() {
        return antropometriaRepository.findAll();
    }

    @Override
    public Antropometria buscarAntropometriaPorId(Long id) {
        Optional<Antropometria> antropometria = antropometriaRepository.findById(id);
        if (!antropometria.isPresent()) {
            throw new NoSuchElementException(MensagensErro.REGISTRO_NAO_ENCONTRADO);
        } else {
            return antropometria.get();
        }
    }

    @Override
    public Antropometria adicionar(Antropometria antropometria) {
        var idPaciente = antropometria.getPaciente().getId();
        var paciente = pacienteRepository.findById(idPaciente);
        if (!paciente.isPresent()) {
            throw new BusinessRulesException(MensagensErro.CADASTRO_NAO_REALIZADO);
        } else {
            return antropometriaRepository.save(antropometria);
        }
    }

    @Override
    public Antropometria atualizarAntropometria(Long id, Antropometria antropometria) {
        Optional<Antropometria> antropometriaBd = antropometriaRepository.findById(id);
        if (antropometriaBd.isPresent()) {
            antropometriaRepository.save(antropometria);
        } else {
            throw new NoSuchElementException(MensagensErro.REGISTRO_NAO_ENCONTRADO);
        }
        return antropometria;
    }

    @Override
    public Void deletarAntropometria(Long id) {
        if (antropometriaRepository.findById(id).isPresent()) {
            antropometriaRepository.deleteById(id);
        } else {
            throw new NoSuchElementException(MensagensErro.REGISTRO_NAO_ENCONTRADO);
        }
        return null;
    }

    @Override
    public List<Antropometria> listarAntropometriaPorPaciente(Long pacienteId) {
        var antropometrias = antropometriaRepository.findByPacienteId(pacienteId);
        var paciente = pacienteRepository.findById(pacienteId);
        if(!paciente.isPresent()){
            throw new NoSuchElementException(MensagensErro.REGISTRO_NAO_ENCONTRADO);
        }else if (antropometrias.isEmpty()) {
            throw new NoSuchElementException(MensagensErro.PACIENTE_SEM_ANTROPOMETRIAS);
        } else {
            return antropometrias;
        }
    }
}
