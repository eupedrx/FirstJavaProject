package controller;

import model.Aluno;
import model.Curso;
import model.ModelException;
import model.dao.DaoAluno;
import viewer.JanelaVerAluno;

public class CtrlVerAluno {

    public void abrirJanela(){

        JanelaVerAluno janela = new JanelaVerAluno();
        janela.setVisible(true);

    }

}
