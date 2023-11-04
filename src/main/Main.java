package main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import views.TelaPrincipal;

public class Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {

				try {
					TelaPrincipal tela = new TelaPrincipal();
					tela.setVisible(true);
					tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

}
