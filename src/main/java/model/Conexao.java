package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao implements IConnection {

	@Override
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/Shopping", "root", "");
		    } catch (SQLException e)
		    {
		    throw new SQLException (e);
		    }
	}

}
