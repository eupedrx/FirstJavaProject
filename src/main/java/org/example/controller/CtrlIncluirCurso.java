package org.example.controller;

import org.example.model.Curso;
import org.example.model.ModelException;
import org.example.model.dao.DaoCurso;


public class CtrlIncluirCurso {

    public void incluirCurso(int codigo, String nome) throws ModelException, NumberFormatException {

        // Cria o objeto do modelo, podendo lançar ModelException
        Curso novoCurso = new Curso(codigo, nome);

        // Adiciona o objeto através do DAO
        DaoCurso dao = new DaoCurso();
        dao.adicionar(novoCurso);
    }

    public Curso getCurso(String codigoStr, String nome) throws ModelException, NumberFormatException {
        int codigo = Integer.parseInt(codigoStr);
        return new Curso(codigo, nome);
    }
}



