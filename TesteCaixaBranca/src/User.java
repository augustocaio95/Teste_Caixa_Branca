package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * A classe User representa um usuário do sistema e fornece métodos para
 * autenticar o usuário no banco de dados.
 *
 * @author Caio Augusto Carvalho dos Santos
 * @version 1.0
 * @since Release 1.0 da aplicação
 */
public class User {

	/**
	 * Estabelece uma conexão com o banco de dados MySQL.
	 *
	 * @return a conexão estabelecida com o banco de dados, ou null se ocorrer algum
	 *         erro.
	 */
	public Connection conectarBD() {
		// Ponto de entrada do programa.
		Connection conn = null;
		try {
			// Chamada ao método conectarBD().
			Class.forName("com.mysqlDriver.Manager").newInstance(); // Ponto 2
			String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
			// Tentativa de carregar o driver JDBC.
			conn = DriverManager.getConnection(url); // Ponto 4
		} catch (Exception e) {
			// Retorno do método conectarBD().
			return conn; // Ponto 5
		}
	}

	/**
	 * Nome do usuário autenticado.
	 */
	public String nome = "";

	/**
	 * Resultado da autenticação do usuário.
	 */
	public boolean result = false;

	/**
	 * Verifica se as credenciais de login fornecidas correspondem a um usuário no
	 * banco de dados.
	 *
	 * @param login o nome de usuário fornecido para autenticação.
	 * @param senha a senha fornecida para autenticação.
	 * @return true se o usuário foi autenticado com sucesso, false caso contrário.
	 */
	public boolean verificarUsuario(String login, String senha) {
		String sql = "";
		Connection conn = conectarBD();
		// Chamada ao método verificarUsuario().
		// Construção da consulta SQL.
		sql += "select nome from usuario "; // Ponto 7
		sql += "where login = " + "'" + login + "'";
		sql += " and senha = " + "'" + senha + "'";
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			// Execução da consulta SQL.
			if (rs.next()) {
				result = true;
				nome = rs.getString("nome");
			}
		} catch (Exception e) {
			// Verificação do resultado da consulta.
			// Retorno do método verificarUsuario().
			// Ponto 10
		}
		return result;
	}
}
