package com.example.gerenciamentodetarefas.tarefa.model;

import com.example.gerenciamentodetarefas.pessoa.model.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tarefa {
    private Integer id;
    private String  titulo;
    private String descricao;
    private LocalDate prazo;
    private String departamento;
    private LocalTime duracao;
    Pessoa pessoa;
    private Boolean tarefaFinalizada;
}
