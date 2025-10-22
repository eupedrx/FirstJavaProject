package model;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private ArrayList<Aluno> listaAlunos;

    public Curso(int codigo, String nome) throws ModelException {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.listaAlunos = new ArrayList<Aluno>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws ModelException {
        Curso.validarCodigo(codigo);
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ModelException {
        Curso.validarNome(nome);
        this.nome = nome;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return new ArrayList<>(this.listaAlunos);
    }

    public boolean adicionarAluno(Aluno novo) throws ModelException {
        if (novo == null)
            throw new ModelException("O aluno não pode ser nulo.");
        return this.listaAlunos.add(novo);
    }

    public boolean removerAluno(Aluno ex) throws ModelException {
        if (ex == null)
            throw new ModelException("O aluno não pode ser nulo.");
        return this.listaAlunos.remove(ex);
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public static void validarCodigo(int codigo) throws ModelException {
        if (codigo <= 0)
            throw new ModelException("O código do curso deve ser maior que zero!");
    }

    public static void validarNome(String nome) throws ModelException {
        if (nome == null || nome.length() == 0)
            throw new ModelException("O nome do curso não pode ser nulo!");
    }
}