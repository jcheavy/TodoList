package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import util.Comp;
import util.RoundedButon;
import util.StrFont;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JPanel panelCentro;
	private JPanel panelEsquerdo;
	private JPanel panelButons;
	
	
	private Date dataAtual;
	private JLabel lbldata;
	
	private JButton btAddProjeto;
	private JButton btAddTarefa;
	private JButton btBorder;
	private JButton btRouded;


	public TelaPrincipal() {

		 ImageIcon addIcon = new ImageIcon(getClass().getResource("/imagens/add.png"));
		 ImageIcon logo = new ImageIcon(getClass().getResource("/imagens/LogoHeavyUsers.png"));
        
		setLayout(new BorderLayout());
		setSize(1024, 728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setIconImage(logo.getImage());
		
		contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout());
		add(contentPane, BorderLayout.CENTER);

		// ** data atual do sistema **

		Date data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
		lbldata = new JLabel();
		lbldata.setFont(StrFont.taoma_14);
		lbldata.setForeground(Color.white);
		lbldata.setText("Data: " + formatador.format(data));

		panelButons = new JPanel();
		panelButons.setBackground(StrFont.azul_esc);

		panelCentro = new JPanel();		


		btAddProjeto = Comp.btQuad("Projeto");
		btAddProjeto.setIcon(addIcon);
        btAddTarefa = Comp.btQuad("T");
		btBorder = Comp.btBorda("=");
		btRouded = new RoundedButon(5, StrFont.bege);

		panelEsquerdo = new JPanel(new BorderLayout());
		panelEsquerdo.setPreferredSize(new Dimension(120, 727));
		panelEsquerdo.setBackground(StrFont.azul_esc);

			
		

		panelEsquerdo.add(lbldata, BorderLayout.BEFORE_FIRST_LINE);
		panelEsquerdo.add(panelButons, BorderLayout.CENTER);

		panelButons.add(btAddProjeto);
		panelButons.add(btAddTarefa);
		panelButons.add(btBorder);
		panelButons.add(btRouded);

	
		

		// Listeners
		
		btAddProjeto.addActionListener(ev -> {
			addProjeto();
			});
		
		btAddTarefa.addActionListener(ev -> {
			  addPanel();
			});
		

		this.add(panelEsquerdo, BorderLayout.WEST);	

		setVisible(true);
	}
	
	private void addPanel() {
		
		TarefaPanel panel = new TarefaPanel();
		//panels.add(panel);
		
		contentPane.add(panel);
		contentPane.revalidate();
		contentPane.repaint();
	}
	
	private void addProjeto() {
		
		new TelaDados();
//		ProjetoPanel quadro = new ProjetoPanel();
//		contentPane.add(quadro);
//		contentPane.revalidate();
//		contentPane.repaint();
	}
}
