package ista.cursoM4A.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)//id auto
	private Long id_usuario;
	
	private String nombre;
	private String clave;
	private String email;
	private boolean estado;
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public Usuario(Long id_usuario, String nombre, String clave, String email, boolean estado) {
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.clave = clave;
		this.email = email;
		this.estado = estado;
	}
	public Usuario() {
		
	}
	
	
	
	
	
	
	
}
