package org.example.viewer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JanelaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	//// Imagens

	// Aluno
	ImageIcon iconAluno = new ImageIcon("src/main/resources/aluno.png");
	Image imgAluno = iconAluno.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
	ImageIcon iconAlunoScaled = new ImageIcon(imgAluno);

	// Curso
	ImageIcon iconCurso = new ImageIcon("src/main/resources/curso.png");
	Image imgCurso = iconCurso.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
	ImageIcon iconCursoScaled = new ImageIcon(imgCurso);

	// Ver Aluno
	ImageIcon iconVerAluno = new ImageIcon("src/main/resources/ver_aluno.png");
	Image imgVerAluno = iconVerAluno.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
	ImageIcon iconVerAlunoScaled = new ImageIcon(imgVerAluno);

	// Fechar
	ImageIcon iconFechar = new ImageIcon("src/main/resources/fechar.png");
	Image imgFechar = iconFechar.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
	ImageIcon iconFecharScaled = new ImageIcon(imgFechar);

	public JanelaPrincipal() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btCurso = new JButton("Curso", iconCursoScaled);
		btCurso.setHorizontalAlignment(SwingConstants.RIGHT);
		btCurso.setIconTextGap(10);
		btCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JanelaCurso();
			}
		});
		btCurso.setBounds(33, 53, 120, 66);
		contentPane.add(btCurso);

		JButton btAluno = new JButton("Aluno", iconAlunoScaled);
		btAluno.setHorizontalTextPosition(SwingConstants.RIGHT);
		btAluno.setIconTextGap(10);
		btAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JanelaAluno();
			}
		});
		btAluno.setBounds(195, 53, 120, 66);
		contentPane.add(btAluno);

		JButton btVerAluno = new JButton("Ver Alunos", iconVerAlunoScaled);
		btVerAluno.setHorizontalTextPosition(SwingConstants.RIGHT);
		btVerAluno.setIconTextGap(10);
		btVerAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {new JanelaVerAluno();}
		});
		btVerAluno.setBounds(350, 53, 135, 66);
		contentPane.add(btVerAluno);

		JButton btFechar = new JButton("Fechar", iconFecharScaled);
		btFechar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btFechar.setIconTextGap(10);
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btFechar.setBounds(526, 53, 120, 66);
		contentPane.add(btFechar);

		this.setVisible(true);
	}
}