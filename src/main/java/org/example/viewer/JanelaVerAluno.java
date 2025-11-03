package org.example.viewer;

import org.example.model.Aluno;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.util.List;

import org.example.controller.CtrlVerAluno;

public class JanelaVerAluno extends JFrame {

    private CtrlVerAluno controlador;
    private JTable tabela;
    private DefaultTableModel modelo;
    private JButton btnFechar;

    public JanelaVerAluno() {

        this.controlador = new CtrlVerAluno();

        setTitle("Lista de Alunos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 207);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));


        modelo = new DefaultTableModel();
        modelo.addColumn("Matricula");
        modelo.addColumn("Nome");
        modelo.addColumn("Curso");

        tabela = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabela);
        contentPane.add(scrollPane, BorderLayout.CENTER);


        JPanel painelBotoes = new JPanel();
        contentPane.add(painelBotoes, BorderLayout.SOUTH);

        JButton btCancelar = new JButton("Cancelar");
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btCancelar.setBounds(283, 176, 89, 23);
        painelBotoes.add(btCancelar);

        List<Aluno> alunos = controlador.obterTodos();
        exibirAlunos(alunos);

        setVisible(true);
    }
    public void exibirAlunos(List<Aluno> alunos) {
        modelo.setRowCount(0);
        for (Aluno aluno : alunos) {
            modelo.addRow(new Object[]{
                    aluno.getMatricula(),
                    aluno.getNome(),
                    aluno.getCurso().getNome()
            });

        }
    }
}
