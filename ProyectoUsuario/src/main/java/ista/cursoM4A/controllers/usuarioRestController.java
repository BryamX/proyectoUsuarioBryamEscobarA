package ista.cursoM4A.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ista.cursoM4A.model.entity.Usuario;
import ista.cursoM4A.model.service.IUsuarioService;

@RestController
@RequestMapping("/api")
public class usuarioRestController {

	@Autowired
	private IUsuarioService UsuarioService;
	
	@GetMapping("/usuario")
	public List<Usuario> index(){
		return UsuarioService.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario show(@PathVariable Long id) {
		return UsuarioService.findById(id);
	}
	
	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		return UsuarioService.save(usuario);
	}
	
	@PutMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
		Usuario usuarios= UsuarioService.findById(id);
		
		usuarios.setNombre(usuario.getNombre());
		usuarios.setClave(usuario.getClave());
		usuarios.setEmail(usuario.getEmail());
		usuarios.setEstado(usuario.isEstado());
		
		
		
		return UsuarioService.save(usuarios);
		
	}
	
	@DeleteMapping("/usuario/{id}")
	public void delete(@PathVariable Long id) {
		UsuarioService.delete(id);
	}
	
	
}
