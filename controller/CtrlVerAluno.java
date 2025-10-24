package controller;

import model.Aluno;
import model.dao.DaoAluno;
import model.ModelException;
import viewer.JanelaVerAluno;
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
