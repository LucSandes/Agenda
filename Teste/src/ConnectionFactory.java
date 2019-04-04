import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static {
		try {
			Class.forName("com.mysql.jbdc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	/*public static Connection conectar() throws SQLException {
		String servidor = "localhost";
		String porta = "3306";
		String database = "agenda";
		String usuario = "Alunos";
		String senha = "alunos";
		return DriverManager.getConnection(
				"jbdc:mysql://" + servidor + ":" + porta + "/" + database + "?user=" + usuario + "&password=" + senha);
	}

	public static void desconectar(Connection conn) throws SQLException {
		conn.close();
	}*/

	public static Connection obtemConexao() throws SQLException {
		return DriverManager
		.getConnection("jdbc:mysql://localhost:3306/lagenda?useTimezone=True&serverTimezone=UTC&user=Alunos&password=alunos");
		}

	
}
