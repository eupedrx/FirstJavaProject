package org.example.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Aluno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricula", nullable = false)
    private int matricula;

    @Column(name = "nome", nullable = false)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "curso_codigo")
    private Curso curso;




    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", curso=" + curso +
                '}';
    }


    public Aluno() {

    }

    public Aluno(int matricula, String nome, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public static void validarMatricula(Integer matricula) throws ModelException {
        if (matricula <= 0)
            throw new ModelException("A matrícula do aluno deve ser maior que zero!");
    }

    public static void validarNome(String nome) throws ModelException {
        if (nome == null || nome.length() == 0)
            throw new ModelException("O nome do aluno não pode ser nulo!");
    }

    public static void validarCurso(Curso curso) throws ModelException {
        if (curso == null)
            throw new ModelException("O aluno deve estar obrigatoriamente matriculado em um curso!");
    }
}