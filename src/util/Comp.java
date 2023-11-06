package util;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Comp {
	
	public static final int TAM_150  = 150;
	public static final int TAM_50   = 50;
	public static final int TAM_250  = 250;
	public static final int TAM_80   = 80;
	public static final int TAM_10   = 10;
	public static final int TAM_CPF  = 15; // 000.000.000-00
	public static final int TAM_CNPJ = 20; // 00-000.000/0001-00
	public static final int TAM_TEL  = 14; // 00-99734-5535
	
	
	
	
	/**
	 * JButton
	 * @param desc
	 * @param w
	 * @param h
	 * @return new dimension
	 */
	public static JButton botao(String desc, int w, int h) {
		JButton but = new JButton(desc);
		but.setPreferredSize(new Dimension(w, h));
		but.setFont(StrFont.gramond_14);
		return but;
	}
	
	public static JButton botao(String desc) {
		JButton but = new JButton(desc);
		but.setPreferredSize(new Dimension(70, 20));
		but.setFont(StrFont.gramond_13);
		return but;
	}
	
	/**
	 * Button branco quadrado
	 * @param desc
	 * @return
	 */
	
	public static JButton btQuad(String desc) {
		JButton but = new JButton(desc);
		but.setPreferredSize(new Dimension(119, 30));
		but.setFont(StrFont.taoma_14);
		but.setBackground(StrFont.verde);
		but.setForeground(Color.WHITE);
		but.setBorder(javax.swing.BorderFactory.createLineBorder(StrFont.verde, 1));
		but.setRequestFocusEnabled(false);
		but.setRolloverEnabled(false);
	    //but.setMargin(new Insets(2, 1000, 2, 14));
		return but;
	}

	public static JButton btBorda(String desc) {
		JButton but = new JButton(desc);
		but.setPreferredSize(new Dimension(70, 60));
		but.setFont(StrFont.taoma_14);
		but.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		but.setForeground(Color.WHITE);
		//but.setRequestFocusEnabled(false);
		//but.setRolloverEnabled(false);
		//but.setMargin(new Insets(2, 1000, 2, 14));
		return but;
	}

	
  
	public void validaVazio (JTextField txf) {	
		if(txf.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "O campo não pode ser vazio");
		}
	}
	
	public static JLabel lbTaoma14 (String texto) {
		JLabel label = new JLabel(texto);
		label.setFont(StrFont.taoma_14);
		return label;
	}
	
}