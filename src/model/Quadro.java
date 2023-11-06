package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Quadro {
	
	private int id;
	private Date data;
	private String titulo;
	private String descricao;
	
	private List<Tarefa> tarefas = new ArrayList<>();
	
	public Quadro() {}

}
