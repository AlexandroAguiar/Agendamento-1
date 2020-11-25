package br.com.romancorp.schedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.romancorp.schedule.dao.UsuarioDao;
import br.com.romancorp.schedule.model.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao dao;
	
	/*  O método logarUsuario vai receber um JSON correspondente ao objeto Usuario
	 *  vindo no corpo da requisicao através do método POST
	 *  Este método POST é o que permite ao FRONT END enviar dados para o BACK END
	 */
	@PostMapping("/login")
	public ResponseEntity<Usuario> logarUsuario(@RequestBody Usuario userLogin) {
		
		Usuario resp = dao.findByEmailOrRacf(userLogin.getEmail(), userLogin.getRacf());
		if (resp!= null) {
			if (resp.getSenha().equals(userLogin.getSenha())){
					return ResponseEntity.ok(resp);
			}else {
				return ResponseEntity.status(401).build();
			}
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}
