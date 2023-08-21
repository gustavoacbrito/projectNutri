package iza.nutrition.projectNutri.controller;


import iza.nutrition.projectNutri.model.Antropometria;
import iza.nutrition.projectNutri.dto.AntropometriaDto;
import iza.nutrition.projectNutri.repository.PacienteRepository;
import iza.nutrition.projectNutri.service.serviceImp.CadastroAntropometriaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class AntropometriaController {

    @Autowired
    private CadastroAntropometriaServiceImpl cadastroAntropometriaService;
    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping("/antropometria")
    public List<Antropometria> listarAntropometrias() {
        return cadastroAntropometriaService.listarTodosAntropometrias();
    }

    @GetMapping("/antropometria/{id}")
    public Antropometria listarPorId(@PathVariable Long id) {
        return cadastroAntropometriaService.buscarAntropometriaPorId(id);
    }

    @GetMapping("/antropometria/paciente/{pacienteId}")
    public List<Antropometria> listarAntropometriaPorPaciente  (@PathVariable("pacienteId") Long pacienteId) {
        return cadastroAntropometriaService.listarAntropometriaPorPaciente(pacienteId);
    }

    @PostMapping("/antropometria")
    public ResponseEntity<String> adicionarAntropometria(@RequestBody @Valid AntropometriaDto antropometriaDto) {
        var antropometria = antropometriaDto.toEntity();
        cadastroAntropometriaService.adicionar(antropometria);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Antropometria id nº"
                        + antropometria.getId() + " do paciente "
                        + antropometria.getPaciente().getNome() + " saved successfully.");
    }
    @PutMapping("/antropometria/atualizacao/{id}")
    public ResponseEntity<Antropometria> atualizarAntropometria(@PathVariable Long id,@RequestBody @Valid AntropometriaDto antropometriaDto){
        Antropometria antropometria = antropometriaDto.toEntity();
        antropometria.setId(id);
        Antropometria antropometriaAtualizada = cadastroAntropometriaService.atualizarAntropometria(id,antropometria);
        return ResponseEntity.status(HttpStatus.OK).body(antropometriaAtualizada);
    }
    @DeleteMapping("/antropometria/{id}")
    public ResponseEntity<Void> deletarAntropometria(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(cadastroAntropometriaService.deletarAntropometria(id));
    }

}