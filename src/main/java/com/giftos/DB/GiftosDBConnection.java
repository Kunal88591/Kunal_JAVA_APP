package com.giftos.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class GiftosDBConnection implements GiftosDBconfig {
	public static Connection getConn() {
		Connection con = null;
		try {
			Class.forName(Driver);
			con = DriverManager.getConnection(URL,UNM,PW);
			
			
			
		}catch(Exception tt) {
			System.out.println(tt);
			
		}
		
		
		
		return con;
		
	}

}
