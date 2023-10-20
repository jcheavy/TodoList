package model;

import java.io.Serializable;

public class Tarefa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String titulo;
	private String Descrição;
	
	public Tarefa() {}

	public Tarefa(Integer id, String titulo, String descrição) {
		
		this.id = id;
		this.titulo = titulo;
		Descrição = descrição;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescrição() {
		return Descrição;
	}

	public void setDescrição(String descrição) {
		Descrição = descrição;
	}

	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", titulo=" + titulo + ", Descrição=" + Descrição + "]";
	}
	
}
