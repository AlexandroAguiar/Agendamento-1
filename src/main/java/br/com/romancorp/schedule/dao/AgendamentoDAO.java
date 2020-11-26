package br.com.romancorp.schedule.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.romancorp.schedule.model.Agendamento;

public interface AgendamentoDAO extends CrudRepository<Agendamento, Integer> {
	

}
