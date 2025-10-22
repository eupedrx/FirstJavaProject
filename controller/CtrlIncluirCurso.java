package controller;

import model.Curso;
import model.ModelException;
import model.dao.DaoCurso;

public class CtrlIncluirCurso {

    public void incluirCurso(String codigoStr, String nome) throws ModelException, NumberFormatException {
        // Converte o código para inteiro, podendo lançar NumberFormatException
        int codigo = Integer.parseInt(codigoStr);

        // Cria o objeto do modelo, podendo lançar ModelException
        Curso novoCurso = new Curso(codigo, nome);

        // Adiciona o objeto através do DAO
        DaoCurso dao = new DaoCurso();
        dao.adicionar(novoCurso);
    }
}