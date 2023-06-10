package iza.nutrition.projectNutri.service.serviceImp;

import iza.nutrition.projectNutri.exception.BusinessRulesException;
import iza.nutrition.projectNutri.model.Paciente;
import iza.nutrition.projectNutri.repository.PacienteRepository;
import iza.nutrition.projectNutri.service.CadastroPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CadastroPacienteServiceImpl implements CadastroPacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> listarTodosPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente buscarPacientesPorId(Long id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        if (paciente.isPresent()) {
            return paciente.get();
        } else {
            throw new NoSuchElementException("Paciente não encontrado com o ID: " + id);
        }
    }
    public List<Paciente> buscarPacientesPorNome(String nome) {
        return pacienteRepository.findByNomeContainingIgnoreCase(nome);
    }

    @Override
    public Paciente adicionar(Paciente paciente) {
        String cpf = paciente.getCpf();
        String email = paciente.getEmail();
        if (pacienteRepository.existsPacienteByCpf(cpf) || pacienteRepository.existsPacienteByEmail(email)) {
            throw new BusinessRulesException("Paciente com esse CPF ou Email já se encontra cadastrado no banco de dados.");
        } else {
            return pacienteRepository.save(paciente);
        }
    }

    @Override
    public List<Paciente> adicionarLista(List<Paciente> paciente) { //implementação para facilitar o teste de cadastro, será apagada
        pacienteRepository.saveAll(paciente);
        return paciente;
    }

    @Override
    public Paciente atualizarPaciente(Long id, Paciente paciente) {
        Optional<Paciente> pacienteBd = pacienteRepository.findById(id);
        if (pacienteBd.isPresent()) {
            pacienteRepository.save(paciente);
        }else{
            throw new NoSuchElementException("Não foi possível atualizar. Paciente não encontrado no banco de dados.");
        }
        return paciente;
    }

    @Override
    public Void deletarPaciente(Long id) {
        if (pacienteRepository.findById(id).isPresent()) {
            pacienteRepository.deleteById(id);
        }else{
            throw new NoSuchElementException("Não foi possível deletar paciente. Paciente não encontrado com o ID: " + id);
        }
        return null;
    }
}
