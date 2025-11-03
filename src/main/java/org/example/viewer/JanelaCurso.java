package org.example.viewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import org.example.controller.CtrlIncluirCurso;
import org.example.model.Curso;
import org.example.model.ModelException;

public class JanelaCurso extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField tfCodigo;
    private JTextField tfNome;
    private CtrlIncluirCurso controlador;

    public JanelaCurso() {
        this.controlador = new CtrlIncluirCurso();

        setTitle("Curso");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 418, 246);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(32, 44, 46, 14);
        contentPane.add(lblCodigo);

        tfCodigo = new JTextField();
        tfCodigo.setBounds(88, 41, 86, 20);
        contentPane.add(tfCodigo);
        tfCodigo.setColumns(10);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(32, 86, 46, 14);
        contentPane.add(lblNome);

        tfNome = new JTextField();
        tfNome.setBounds(88, 83, 265, 20);
        contentPane.add(tfNome);
        tfNome.setColumns(30);

        JButton btOk = new JButton("Ok");
        btOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    controlador.incluirCurso(Integer.parseInt(String.valueOf((tfCodigo.getText()))), tfNome.getText());
                    Curso curso = controlador.getCurso(tfCodigo.getText(), tfNome.getText());
                    JOptionPane.showMessageDialog(btOk, "Curso Criado com sucesso!");
                    setVisible(false);
                } catch (ModelException | NumberFormatException e1) {
                    JOptionPane.showMessageDialog(btOk, "Erro: " + e1.getMessage());
                }
            }
        });
        btOk.setBounds(88, 141, 89, 23);
        contentPane.add(btOk);

        JButton btCancelar = new JButton("Cancelar");
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btCancelar.setBounds(264, 141, 89, 23);
        contentPane.add(btCancelar);
        this.setVisible(true);
    }
}