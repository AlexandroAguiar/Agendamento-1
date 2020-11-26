package br.com.romancorp.schedule.controller;

import br.com.romancorp.schedule.dao.AgenciaDAO;
import br.com.romancorp.schedule.model.Agencia;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AgenciaController{
	/*
	 * A referencia dao do tipo Agencia DAO será injetada o que é isso? Eu
	 * (programador) vou delegar a busca e instanciação de algum objeto que
	 * implemente esta interface para a maquina virtual.
	 */
	@Autowired
	private AgenciaDAO dao;
	
	@GetMapping("/agencias")
	public ArrayList<Agencia> recuperarTodas(){
		ArrayList<Agencia> lista;
		lista =  (ArrayList<Agencia>)dao.findAll(); // recuperei os registros do banco e armazenei na lista (SELECT)
		return lista; // retorno os dados
	}

}
