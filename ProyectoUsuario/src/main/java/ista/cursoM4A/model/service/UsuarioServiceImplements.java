package ista.cursoM4A.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.cursoM4A.model.dao.IusuarioDao;
import ista.cursoM4A.model.entity.Usuario;

@Service
public class UsuarioServiceImplements implements IUsuarioService{

	@Autowired
	public IusuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll(){
		return (List<Usuario>)usuarioDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		return usuarioDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		return usuarioDao.save(usuario);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		usuarioDao.deleteById(id);
	}
	
}
