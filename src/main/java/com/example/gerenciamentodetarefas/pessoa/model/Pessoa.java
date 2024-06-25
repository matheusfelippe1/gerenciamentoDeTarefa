package com.example.gerenciamentodetarefas.pessoa.model;

import com.example.gerenciamentodetarefas.tarefa.model.Tarefa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private Integer id;
    private String nome;
    private String departamento;
    private List<Tarefa> listaDeTarefas;

}
