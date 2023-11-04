package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PanelMenu extends JFrame implements ChangeListener{

	private static final long serialVersionUID = 1L;
	
	
	JComboBox cBoxFont;
	JLabel lbFonte;
	JColorChooser colorChoose;
	JPanel panelFlow;
	TarefaPanel tarefaPanel;
	
	public PanelMenu(TarefaPanel tarefaPanel) {
		
		setTitle("Menu - Ecolha cor e fonte");
		this.tarefaPanel = tarefaPanel;
		String[] fontFamily = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		setLayout(new BorderLayout());
		setSize(450, 400);
		
		
		panelFlow = new JPanel(new FlowLayout());
		panelFlow.setPreferredSize(new Dimension(400,25));
		
		lbFonte = new JLabel("Fonte");
		lbFonte.setPreferredSize(new Dimension(80,20));
		
		cBoxFont = new JComboBox(fontFamily);
		cBoxFont.setPreferredSize(new Dimension(300,20));
		
		colorChoose = new JColorChooser();
		
		panelFlow.add(lbFonte);
		panelFlow.add(cBoxFont);
		
		/**  Listeners */
		
		
		cBoxFont.addActionListener(ev ->{
			MudarFont();
		});
		
		colorChoose.getSelectionModel().addChangeListener(this);
		
		/** Listeners */
		
		add(panelFlow, BorderLayout.NORTH);
		add(colorChoose, BorderLayout.CENTER);
		setVisible(true);
	}
	
	private void MudarFont() {
		Font fonte = new Font((String) cBoxFont.getSelectedItem(), Font.PLAIN, 14);
		tarefaPanel.MudarFont(fonte);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		Color newColor = colorChoose.getColor();	
		tarefaPanel.ColorChoose(newColor);
	}
}
