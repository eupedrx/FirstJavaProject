package viewer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.CtrlVerAluno;

public class JanelaVerAluno extends JFrame {

    private CtrlVerAluno controlador;
    private JButton btnFechar;

    public JanelaVerAluno() {

        this.controlador = new CtrlVerAluno();

        setTitle("Lista de Alunos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 600, 400);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));


        btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnFechar.setBounds(10, 53, 119, 10);
        contentPane.add(btnFechar);

        setVisible(true);
    }

}
