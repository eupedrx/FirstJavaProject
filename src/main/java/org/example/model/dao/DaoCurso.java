package org.example.model.dao;

import java.util.ArrayList;
import org.example.model.Curso;

public class DaoCurso extends GenericDao<Curso> {
    public DaoCurso() {
        super(Curso.class);
    }
}