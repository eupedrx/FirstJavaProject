package viewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JanelaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public JanelaPrincipal() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btCurso = new JButton("Curso");
		btCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JanelaCurso();
			}
		});
		btCurso.setBounds(33, 53, 119, 66);
		contentPane.add(btCurso);

		JButton btAluno = new JButton("Aluno");
		btAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JanelaAluno();
			}
		});
		btAluno.setBounds(195, 53, 119, 66);
		contentPane.add(btAluno);

		JButton btVerAluno = new JButton("VerAluno");
		btVerAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {new JanelaVerAluno();}
		});
		btVerAluno.setBounds(350, 53, 119, 66);
		contentPane.add(btVerAluno);

		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btFechar.setBounds(526, 53, 80, 66);
		contentPane.add(btFechar);

		this.setVisible(true);
	}
}