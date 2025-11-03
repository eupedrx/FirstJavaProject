package org.example.viewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import org.example.controller.CtrlIncluirAluno;
import org.example.model.Curso;
import org.example.model.ModelException;
import org.example.model.dao.DaoCurso;

public class JanelaAluno extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField tfMatricula;
    private JTextField tfNome;
    private JComboBox<Curso> cbCurso;
    private CtrlIncluirAluno controlador;

    public JanelaAluno() {
        this.controlador = new CtrlIncluirAluno();

        setTitle("Aluno");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 418, 266);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblMatricula = new JLabel("Matrícula:");
        lblMatricula.setBounds(32, 44, 65, 14);
        contentPane.add(lblMatricula);

        tfMatricula = new JTextField();
        tfMatricula.setBounds(107, 41, 206, 20);
        contentPane.add(tfMatricula);
        tfMatricula.setColumns(10);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(32, 86, 46, 14);
        contentPane.add(lblNome);

        tfNome = new JTextField();
        tfNome.setBounds(107, 83, 265, 20);
        contentPane.add(tfNome);
        tfNome.setColumns(10);

        JLabel lblCurso = new JLabel("Curso:");
        lblCurso.setBounds(32, 125, 89, 14);
        contentPane.add(lblCurso);

        DaoCurso daoCurso = new DaoCurso();
        cbCurso = new JComboBox<>(daoCurso.obterTodos().toArray(new Curso[0]));
        cbCurso.setBounds(107, 121, 265, 22);
        contentPane.add(cbCurso);

        JButton btOk = new JButton("Ok");
        btOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Curso cursoSelecionado = (Curso) cbCurso.getSelectedItem();
                    controlador.incluirAluno(Integer.parseInt(String.valueOf(Integer.parseInt(tfMatricula.getText()))), tfNome.getText(), cursoSelecionado);
                    JOptionPane.showMessageDialog(btOk, "Aluno Criado com sucesso!");
                    setVisible(false);
                } catch (ModelException | NumberFormatException e1) {
                    JOptionPane.showMessageDialog(btOk, "Erro: " + e1.getMessage());
                }
            }
        });
        btOk.setBounds(107, 176, 89, 23);
        contentPane.add(btOk);

        JButton btCancelar = new JButton("Cancelar");
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btCancelar.setBounds(283, 176, 89, 23);
        contentPane.add(btCancelar);
        this.setVisible(true);
    }
}