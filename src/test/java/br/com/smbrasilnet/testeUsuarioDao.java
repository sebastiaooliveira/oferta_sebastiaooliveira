package br.com.smbrasilnet;

import br.com.smbrasilnet.persistencia.entidade.Usuario;
import br.com.smbrasilnet.persistencia.jdbc.UsuarioDao;

public class testeUsuarioDao {

	public static void main(String[] args) {
		testExcluir();
		
	}
	public static void testCadastrar(){
       Usuario usu = new Usuario();
		
		usu.setNome("jao");
		usu.setLogin("jajao");
		usu.setSenha("qaz12");
		//cadastrando
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.cadastrar(usu);
	}

	public static void testAlterar(){
	       Usuario usu = new Usuario();
			usu.setId(4);
			usu.setNome("sebastiao");
			usu.setLogin("sebas");
			usu.setSenha("qaz1245");
			//cadastrando
			UsuarioDao usuDao = new UsuarioDao();
			usuDao.alterar(usu);
			System.out.println("Alterado com Sucesso");
		}
	
	public static void testExcluir(){
	       Usuario usu = new Usuario();
			usu.setId(4);
			
			//Excluindo
			UsuarioDao usuDao = new UsuarioDao();
			usuDao.excluir(usu);
			System.out.println("Excluido com Sucesso");
		}
	
	
}
