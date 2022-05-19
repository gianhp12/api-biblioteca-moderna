package rest.controller;

import entity.Aluno;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import repository.Alunos;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private Alunos alunos;

    public AlunoController(Alunos alunos) {
        this.alunos = alunos;
    }

    @GetMapping("{cpf}")
    public Aluno getAlunoById(@PathVariable Integer cpf) {
        return alunos
                .findById(cpf)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Aluno não encontrado"));
    }
}
