package iza.nutrition.projectNutri.repository;

import iza.nutrition.projectNutri.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Optional<Paciente> findById(Long id);
    boolean existsPacienteByCpf(String cpf);
    boolean existsPacienteByEmail(String cpf);
    List<Paciente> findByNomeContainingIgnoreCase(String nome);
}
