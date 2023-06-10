package iza.nutrition.projectNutri.repository;

import iza.nutrition.projectNutri.model.Antropometria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;


public interface AntropometriaRepository extends JpaRepository<Antropometria, Long> {

    //    List<Antropometria> findByPacienteId(Integer paciente_id); //método mais simples de se fazer
    @Query(value = "SELECT * FROM antropometria WHERE paciente_id = :id", nativeQuery = true)
    List<Antropometria> findByPacienteId(@Param("id") Long id);

}
