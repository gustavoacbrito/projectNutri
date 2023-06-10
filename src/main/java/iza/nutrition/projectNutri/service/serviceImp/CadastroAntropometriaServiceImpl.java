package iza.nutrition.projectNutri.service.serviceImp;

import iza.nutrition.projectNutri.exception.BusinessRulesException;
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
            throw new NoSuchElementException("Antropometria não encontrada no banco de dados");
        } else {
            return antropometria.get();
        }
    }

    @Override
    public Antropometria adicionar(Antropometria antropometria) {
        var idPaciente = antropometria.getPaciente().getId();
        var paciente = pacienteRepository.findById(idPaciente);
        if (!paciente.isPresent()) {
            throw new BusinessRulesException("Não foi possivel cadastrar antropometria para esse paciente pois ele não existe no banco de dados");
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
            throw new NoSuchElementException("Não foi possível atualizar. Antropometria não encontrada no banco de dados.");
        }
        return antropometria;
    }

    @Override
    public Void deletarAntropometria(Long id) {
        if (antropometriaRepository.findById(id).isPresent()) {
            antropometriaRepository.deleteById(id);
        } else {
            throw new NoSuchElementException("Não foi possível deletar antropometria. Antropometria não encontrada com o ID: " + id);
        }
        return null;
    }

    @Override
    public List<Antropometria> listarAntropometriaPorPaciente(Long pacienteId) {
        var antropometrias = antropometriaRepository.findByPacienteId(pacienteId);
        var paciente = pacienteRepository.findById(pacienteId);
        if(!paciente.isPresent()){
            throw new NoSuchElementException("Esse paciente não existe no bando de dados");
        }else if (antropometrias.isEmpty()) {
            throw new NoSuchElementException("Esse paciente não possui antropometrias");
        } else {
            return antropometrias;
        }
    }
}
