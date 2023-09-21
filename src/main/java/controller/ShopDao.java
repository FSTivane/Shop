package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Conexao;
import model.Shop;

public class ShopDao {
	
	private Connection connection;

	public ShopDao() throws ClassNotFoundException, SQLException {
		this.connection = new Conexao().getConnection();
	}
	
	public void adicionaShop(Shop shop) 
	{
		String sql = "insert into shop (shop_id, shop_nome, shop_localizacao)"
				+ "values (?, ?, ?)";
		try {
			PreparedStatement stmt=connection.prepareStatement(sql);
			stmt.setInt(1, shop.getId());
			stmt.setString(2, shop.getNome());
			stmt.setString(3, shop.getLocalizacao());
			
			stmt.execute();
			stmt.close();
			// Show mensages after the data was saved 
			System.out.println("Gravado");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Lista () throws SQLException 
	{
		// Select all information on shop table
		PreparedStatement stmt = connection.prepareStatement("select * from shop");
		// execute the  selection
		ResultSet set= stmt.executeQuery();
		
		// Result data iteration
		while(set.next()) 
		{
			System.out.println(
					set.getString("Shop_id") 
					+"-"+ set.getString("Shop_nome")
					+"-"+ set.getString("Shop_localizacao")
					);
		}
		stmt.execute();
		stmt.close();
	}
	
	// method used to update data on table
	void actualizar (Shop shop) 
	{
		String sql = "update shop set shop_nome=?,shop_localizacao=?"
				+ "where shop_id=?";
		try {
			PreparedStatement stmt =connection.prepareStatement(sql);
			stmt.setString(1, shop.getNome());
			stmt.setString(2, shop.getLocalizacao());
			stmt.setInt(3, shop.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// method used to clear 
	void delete (Shop shop) 
	{
		String sql = "delete from shop where shop_id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, shop.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
