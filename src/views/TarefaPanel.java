package views;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JLabel;

public class TarefaPanel extends Panel {

	private static final long serialVersionUID = 1L;
	
	private JLabel titulo;
	private JLabel texto;
	
	public TarefaPanel() {
		
		setLayout(new BorderLayout());
		titulo = new JLabel("Titulo");
		this.add(titulo, BorderLayout.NORTH);
		
		texto = new JLabel("Descrição da tarefa");
		this.add(texto, BorderLayout.CENTER);
		
	}
}
