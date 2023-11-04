package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TarefaPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel titulo;
	private JLabel descricao;
	private int offsetX, offsetY;
	private Color color;
	private JButton btColorChoose;
	private JComboBox cBoxFont;
	
	PanelMenu panelMenu;

	public TarefaPanel() {

		String[] fontFamily = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		this.setPreferredSize(new Dimension(210, 100));
		this.setLayout(new BorderLayout());

		titulo = new JLabel("Titulo");
		descricao = new JLabel("Um breve descição da tarefa");

		btColorChoose = new JButton("Cor");
		btColorChoose.setPreferredSize(new Dimension(20, 20));

		cBoxFont = new JComboBox<>(fontFamily);
		cBoxFont.setPreferredSize(new Dimension(20, 20));
		cBoxFont.setSelectedItem("Arial");

		this.add(titulo, BorderLayout.NORTH);
		this.add(descricao, BorderLayout.CENTER);
		this.add(btColorChoose, BorderLayout.WEST);
		this.add(cBoxFont, BorderLayout.SOUTH);

		this.setBackground(new Color(252, 250, 199));
		System.out.println("Panel Task Funcionando");

		btColorChoose.addActionListener(ev -> {
			 //ColorChoose();		
			panelMenu = new PanelMenu(this);
			panelMenu.setVisible(true);
		});

		cBoxFont.addActionListener(ev -> {
			MudarFont();
		});

		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				offsetX = e.getX();
				offsetY = e.getY();
			}
		});

		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				setLocation(getLocation().x + e.getX() - offsetX, getLocation().y + e.getY() - offsetY);
			}
		});

	}

	public void ColorChoose() {

		color = JColorChooser.showDialog(null, TOOL_TIP_TEXT_KEY, Color.black);
		this.setBackground(color);
	}
	
	public void ColorChoose(Color color) {
		this.setBackground(color);
	}

	public void MudarFont() {
		Font fonte = new Font((String) cBoxFont.getSelectedItem(), Font.PLAIN, 14);
		this.setFont(fonte);
		titulo.setFont(fonte);
		descricao.setFont(fonte);
//		revalidate();
//		repaint();	
	}

	public void MudarFont(Font fonte) {		
		this.setFont(fonte);
		titulo.setFont(fonte);
		descricao.setFont(fonte);	
	}
	
}