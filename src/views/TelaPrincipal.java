package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import util.StrFont;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JPanel PanelEsquerdo;
	private Date dataAtual;
	private JLabel lbldata;

	public TelaPrincipal() {

//		contentPane = new JPanel();
//		setContentPane(contentPane);

		setLayout(new BorderLayout());
		setSize(1024, 728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		// ** data atual do sistema **

		Date data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);	
		lbldata = new JLabel();
		lbldata.setFont(StrFont.taoma_14);
		lbldata.setForeground(Color.white);
		lbldata.setText("Data: "+formatador.format(data));
		
		

		PanelEsquerdo = new JPanel(new BorderLayout());
		PanelEsquerdo.setPreferredSize(new Dimension(120, 727));
		PanelEsquerdo.setBackground(StrFont.verde);
		PanelEsquerdo.add(lbldata, BorderLayout.BEFORE_FIRST_LINE);
		
		this.add(PanelEsquerdo, BorderLayout.WEST);

		setVisible(true);
	}
}
