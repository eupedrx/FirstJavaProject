package controller;

import model.Aluno;
import model.Curso;
import model.ModelException;
import model.dao.DaoAluno;

public class CtrlIncluirAluno {

    public void incluirAluno(String matriculaStr, String nome, Curso curso) throws ModelException, NumberFormatException {
        // Converte a matrícula para inteiro
        int matricula = Integer.parseInt(matriculaStr);

        // Cria o objeto do modelo
        Aluno novoAluno = new Aluno(matricula, nome, curso);

        // Adiciona o objeto através do DAO
        DaoAluno dao = new DaoAluno();
        dao.adicionar(novoAluno);
    }
}