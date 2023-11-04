package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.DateFormat;
import java.util.Date;

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
	private JPanel panelQuadro;
	
	private Date dataAtual;
	private JLabel lbldata;
	private JButton btAdd;
	


	private JButton btBorder;
	private JButton btRouded;


	public TelaPrincipal() {


		setLayout(new BorderLayout());
		setSize(1024, 728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
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


		btAdd = Comp.btQuad("+");
		btBorder = Comp.btBorda("=");
		btRouded = new RoundedButon(5, StrFont.bege);

		panelEsquerdo = new JPanel(new BorderLayout());
		panelEsquerdo.setPreferredSize(new Dimension(120, 727));
		panelEsquerdo.setBackground(StrFont.azul_esc);

		panelQuadro = new PanelQuadro();		
		

		panelEsquerdo.add(lbldata, BorderLayout.BEFORE_FIRST_LINE);
		panelEsquerdo.add(panelButons, BorderLayout.CENTER);

		panelButons.add(btAdd);
		panelButons.add(btBorder);
		panelButons.add(btRouded);

	
		

		// Listeners

//		btAdd.addActionListener(new ActionListener() {			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});

		btAdd.addActionListener(ev -> {
		  addPanel();
		});

		this.add(panelEsquerdo, BorderLayout.WEST);
		// this.add(panelCentro, BorderLayout.CENTER);
		// this.add(panelQuadro, BorderLayout.CENTER);
		//this.add(pnTrio, BorderLayout.CENTER);

		setVisible(true);
	}
	
	private void addPanel() {
		
		TarefaPanel panel = new TarefaPanel();
		//panels.add(panel);
		
		contentPane.add(panel);
		contentPane.revalidate();
		contentPane.repaint();
	}
}
