package iza.nutrition.projectNutri.controller;

import iza.nutrition.projectNutri.model.Paciente;
import iza.nutrition.projectNutri.dto.PacienteDto;
import iza.nutrition.projectNutri.service.serviceImp.CadastroPacienteServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private CadastroPacienteServiceImpl pacienteService;

    @GetMapping
    public List<Paciente> listarTodosPacientes() {
        return pacienteService.listarTodosPacientes();
    }

    @GetMapping("/paciente/{nome}")
    public List<Paciente> buscarPacientesPorNomeContendo(@Valid @PathVariable String nome) {
        return pacienteService.buscarPacientesPorNome(nome);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> buscarPacientePorId(@PathVariable Long id) {
        Paciente paciente = pacienteService.buscarPacientesPorId(id);
        return ResponseEntity.status(HttpStatus.OK).body(paciente);
    }

    @PostMapping
    public ResponseEntity<Paciente> adicionar(@RequestBody @Valid  PacienteDto pacienteDto) {
        Paciente paciente = pacienteService.adicionar(pacienteDto.toEntity());
        return ResponseEntity.status(HttpStatus.CREATED).body(paciente);
    }

    @PostMapping("/lista")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Paciente> adicionarLista(@RequestBody @Valid List<PacienteDto> pacienteDto) {
        List<Paciente> pacientes = new ArrayList<>();
        for (PacienteDto p : pacienteDto) {
            pacientes.add(p.toEntity());
        }
        return pacienteService.adicionarLista(pacientes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Paciente> atualizarPaciente(@PathVariable Long id, @RequestBody @Valid PacienteDto pacienteDto) {
        Paciente paciente = pacienteDto.toEntity();
        paciente.setId(id);
        Paciente pacienteAtualizado = pacienteService.atualizarPaciente(id, paciente);
        return ResponseEntity.status(HttpStatus.OK).body(pacienteAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPaciente(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(pacienteService.deletarPaciente(id));
    }
}
