package br.com.romancorp.schedule.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.romancorp.schedule.model.Agencia;

/*
	Mapeaa as oparacoes de banco de dados create:insert, update, select:find, update, delete
	quando declaramos uma inteface, temos uma declaração
	que vamos utilizar as operações basicas do crud (atraves do repositorio crud), indicando
	que este CRUD irá manipular objetos do tipo Agencia
	Precisa ser o tipo da chave primaria no segundo argumento
*/
public interface AgenciaDAO extends CrudRepository<Agencia,Integer>{
	
}
