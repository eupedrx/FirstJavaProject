package org.example.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
public class Curso implements Serializable {
    @Id
    @Column(name = "codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(name = "nome", nullable = false)
    private String nome;
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Aluno> listaAlunos;



    public Curso() {

    }

    public Curso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
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