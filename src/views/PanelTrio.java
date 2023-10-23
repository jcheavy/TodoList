package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class PanelTrio extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JPanel panelEsq;
	private JPanel panelCenter;
	private JPanel panelDir;
    private final int LARG = 300;
    private final int  COMP = 720;
    
	
	public PanelTrio() {
		
		setLayout(new BorderLayout());
		
		panelEsq    = new JPanel();
		panelCenter = new JPanel();
		panelDir    = new JPanel();
		
		
		panelEsq.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.RED));
		panelEsq.setPreferredSize(new Dimension(LARG, COMP));
		
	
		panelCenter.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.RED));
		panelCenter.setPreferredSize(new Dimension(LARG, COMP));		
		
			
		panelDir.setPreferredSize(new Dimension(LARG, COMP));
		
		this.add(panelEsq, BorderLayout.WEST);
		this.add(panelCenter, BorderLayout.CENTER);
		this.add(panelDir, BorderLayout.EAST);
		
		
	}
}
