package model;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConnection {
	
	public Connection getConnection() throws SQLException, ClassNotFoundException;

}
