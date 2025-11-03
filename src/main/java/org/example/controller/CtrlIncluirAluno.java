package org.example.controller;

import org.example.model.Aluno;
import org.example.model.Curso;
import org.example.model.ModelException;
import org.example.model.dao.DaoAluno;

public class CtrlIncluirAluno {

    public void incluirAluno(int matricula, String nome, Curso curso) throws ModelException, NumberFormatException {
        // Cria o objeto do modelo
        Aluno novoAluno = new Aluno(matricula, nome, curso);

        // Adiciona o objeto através do DAO
        DaoAluno dao = new DaoAluno();
        dao.adicionar(novoAluno);
    }
}