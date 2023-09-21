package controller;
import java.sql.SQLException;

import model.Shop;

public class ShopCadastro {
	
	public static void main (String [] args) throws ClassNotFoundException, SQLException 
	{ 
		Shop shop = new Shop();
		ShopDao dao = new ShopDao();
		// pronto para gravar
	    shop.setId(2);
		shop.setNome("CCS, Maputo");
		shop.setLocalizacao("Maputo");
		// grave nessa conexão!!!
		// método elegante
    //	dao.actualizar(shop);
		dao.delete(shop);
    	System.out.println("Cleaned");
		
	//	dao.Lista();
		
		
		
		
		
	}

}
