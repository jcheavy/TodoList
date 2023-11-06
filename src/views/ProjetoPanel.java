package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import util.Comp;
import util.StrFont;

public class ProjetoPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel titulo;
	private JLabel descricao;
	private int offsetX, offsetY;
	
	private JButton btAddTarefa;
	
	private JPanel listPanel;
	private JPanel topPanel;
	

	public ProjetoPanel() {		
		
		ImageIcon taskicon = new ImageIcon(getClass().getResource("/imagens/task24.png"));
		
		GridLayout layout = new GridLayout(10, 1);

		this.setPreferredSize(new Dimension(210, 400));
		this.setLayout(new BorderLayout());
		
		
		titulo = new JLabel("Titulo");		
		descricao = new JLabel("Um breve descição da tarefa");	
		
		topPanel = new JPanel(new GridLayout(3,1));
		topPanel.setBackground(Color.cyan);
		
	    listPanel = new JPanel();
	    listPanel.setLayout(layout);
		
		btAddTarefa = Comp.btQuad("  Adicionar Tarefa");
		btAddTarefa.setIcon(taskicon);
		
		topPanel.add(titulo);
		topPanel.add(btAddTarefa);

		this.add(topPanel, BorderLayout.NORTH);	
		
		this.add(listPanel, BorderLayout.CENTER);
		
		
		//Listeners

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
		
		btAddTarefa.addActionListener(ev ->{
			addTarefaPanel();
		});

	}

	
	private void addTarefaPanel() {
		
		TarefaPanel panel = new TarefaPanel();		
		listPanel.add(panel);
		listPanel.revalidate();
		listPanel.repaint();
	}


	
	
}