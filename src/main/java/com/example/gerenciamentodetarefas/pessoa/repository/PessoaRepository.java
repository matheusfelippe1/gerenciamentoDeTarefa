package com.example.gerenciamentodetarefas.pessoa.repository;

import com.example.gerenciamentodetarefas.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {


}
