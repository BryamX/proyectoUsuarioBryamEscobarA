package ista.cursoM4A.model.service;

import java.util.List;

import ista.cursoM4A.model.entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);
	

}
