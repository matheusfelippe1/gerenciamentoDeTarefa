package com.example.gerenciamentodetarefas.pessoa.model;

import com.example.gerenciamentodetarefas.pessoa.dto.PessoaDto;
import com.example.gerenciamentodetarefas.tarefa.model.Tarefa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PESSOA")
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    //private List<Tarefa> listaDeTarefas;

    public static Pessoa converter(PessoaDto pessoaDto){
        var pessoa = new Pessoa();
        pessoa.setNome(pessoaDto.getNome());
        pessoa.setDepartamento(pessoaDto.getDepartamento());
        return pessoa;
    }

}
