package org.example.controller;

import org.example.model.Aluno;
import org.example.model.dao.DaoAluno;

import java.util.List;

public class CtrlVerAluno {
    private DaoAluno daoAluno;

    public CtrlVerAluno() {
        this.daoAluno = new DaoAluno();
    }

    public List<Aluno> obterTodos() {
        return daoAluno.obterTodos();
    }
}
