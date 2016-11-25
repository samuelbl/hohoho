package br.com.hohoho.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.hohoho.dao.UsuarioDAO;
import br.com.hohoho.modelo.Usuario;

@ManagedBean
@ViewScoped
public class UsuariosBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private Usuario usuario = new Usuario();


	public Usuario getUsuario() {
		return usuario;
	}
	
	public String cadastrarUsuario(){
		String retorno;
		if (UsuarioDAO.getInstance().existeRetornaId(usuario) != null){
			///
		}
		else{
			UsuarioDAO.getInstance().adiciona(this.usuario);
		}
		
		return "
	}
	
}
