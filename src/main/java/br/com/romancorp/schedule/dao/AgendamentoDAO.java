package br.com.romancorp.schedule.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.romancorp.schedule.model.Agendamento;

public interface AgendamentoDAO extends CrudRepository<Agendamento, Integer> {
	
	public ArrayList<Agendamento> findAllByDataAgendamento(LocalDate data);
	public ArrayList<Agendamento> findAllByNomeClienteContains(String nome);
}
