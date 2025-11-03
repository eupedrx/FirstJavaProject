package org.example.model.dao;

import java.util.ArrayList;
import org.example.model.Aluno;
import org.example.model.Curso;

public class DaoAluno extends GenericDao<Aluno> {
    public DaoAluno() {
        super(Aluno.class);
    }

}