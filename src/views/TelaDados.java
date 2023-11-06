package views;

import java.net.URL;
import java.nio.file.Path;
import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.github.lgooddatepicker.components.DatePicker;

import util.Comp;

public class TelaDados extends JDialog {

	private static final long serialVersionUID = 1L;
	
	
	private JLabel lbTitulo;	
	private JLabel lbNome;
	private JLabel lbDataInicio;
	private JLabel lbDataFim;
	private JTextField txfNome;
	
    private DatePicker datePicker;
    private DatePicker datePickerFim;
    
    private JButton btPicker;
    private JButton btSalvar;
	
    ImageIcon Icon;
	public TelaDados() {
		
		ImageIcon dateIcon = new ImageIcon(getClass().getResource("/imagens/datepickerbutton1.png"));
		ImageIcon saveIcon = new ImageIcon(getClass().getResource("/imagens/diskette24.png"));
		
		setTitle("Projeto");		
		setLocation(200, 200);
		setSize(320, 230);
		setLayout(null);
		
		lbTitulo  = Comp.lbTaoma14("Novo Projeto");		
		
		txfNome = new JTextField();
		lbNome = Comp.lbTaoma14("Nome: ");
		
		datePicker = new DatePicker();
		datePicker.setDate(LocalDate.now());
		btPicker = datePicker.getComponentToggleCalendarButton();
		btPicker.setText("");
		btPicker.setIcon(dateIcon);
		
		lbDataInicio = Comp.lbTaoma14("Inicio : ");
		
		lbDataFim = Comp.lbTaoma14("Fim : ");
		datePickerFim = datePickerIcon(dateIcon);
		
		btSalvar = Comp.btQuad("    Salvar       ");
		
		
		lbTitulo.setBounds(80, 10, 100, 23);
		lbNome.setBounds(10, 40, 45, 23);		
		txfNome.setBounds(60, 40, 220, 23);
		txfNome.setBorder(null);
		
		lbDataInicio.setBounds(10, 70, 100, 23);
		datePicker.setBounds(60, 70, 220, 30);
		
		lbDataFim.setBounds(10, 103, 100, 23);
		datePickerFim.setBounds(60, 103, 220, 30);
		
		btSalvar.setBounds(60, 136, 220, 30);
		
		
		
		
		add(lbTitulo);
		add(lbNome);
		add(txfNome);
		add(lbDataInicio);
		add(datePicker);
		add(lbDataFim);
		add(datePickerFim);
		add(btSalvar);
		
		setVisible(true);
	}
	
	
	
	public static DatePicker datePickerIcon(ImageIcon Icon) {		
		DatePicker picker = new DatePicker();
		JButton btPicker = new JButton();
		picker.setDate(LocalDate.now());
		btPicker = picker.getComponentToggleCalendarButton();
		btPicker.setText("");
		btPicker.setIcon(Icon);
		return picker;
	}
}
