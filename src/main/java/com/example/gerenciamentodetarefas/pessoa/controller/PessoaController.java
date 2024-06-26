package com.example.gerenciamentodetarefas.pessoa.controller;

import com.example.gerenciamentodetarefas.pessoa.dto.PessoaDto;
import com.example.gerenciamentodetarefas.pessoa.model.Pessoa;
import com.example.gerenciamentodetarefas.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    public void salvar(@RequestBody PessoaDto pessoaDto){
        var pessoa = Pessoa.converter(pessoaDto);
        pessoaRepository.save(pessoa);
    }


}
