package br.com.romancorp.schedule.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.romancorp.schedule.model.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario,Integer>{
	
	//metodo que busca por email e senha
	public Usuario findByEmailAndSenha(String email, String senha);
	
	//metodo busca por email ou racf
	public Usuario findByEmailOrRacf(String email, String racf);

}
