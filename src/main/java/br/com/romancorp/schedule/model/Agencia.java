package br.com.romancorp.schedule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itmn032_agencia")
public class Agencia {
	
	@Id   					//corresponde a PK na tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY) // indica que o campo é auto increment
	@Column(name="id_user") //define o nome da tabela
	private int id;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	@Column(name="hora_inicio")
	private int horaInicio;
	
	@Column(name="hora_fim")
	private int horaFim;

}
