package com.giftos.DAO;
import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.giftos.DB.GiftosDBConnection;
import com.giftos.DTO.CustomerRegDTO;

public class CustomerRegDAO {
	
	public CustomerRegDAO() {
		
	}
	public int save1(CustomerRegDTO t1) {
		int x   = 0 ;
		
		System.out.println(t1);
		try {
			Connection con1 = com.giftos.DB.GiftosDBConnection.getConn();
			PreparedStatement ps = con1.prepareStatement("insert into regiss(cname,cadd,mob,email,unm,pw )values(?,?,?,?,?,?)");
			ps.setString(1, t1.getCname());
			ps.setString(2, t1.getCadd());
			ps.setString(3, t1.getMob());
			ps.setString(4, t1.getEmail());
			ps.setString(5, t1.getUnm());
			ps.setString(6, t1.getPw());
			
			x =ps.executeUpdate();
			
			
			
			
		}catch(Exception tt) {
			System.out.println(tt);
			
			
		}
		
		
		return x ; 
		
	}
	
	public Vector loginChk(CustomerRegDTO lg) {
		Vector data = new Vector();
		try {
		
		Connection con1 = com.giftos.DB.GiftosDBConnection.getConn();
		PreparedStatement ps = con1.prepareStatement("select * from regiss where unm = ? AND pw = ?");
		ps.setString(1, lg.getUnm());
		ps.setString(2, lg.getPw());
		ResultSet rs =ps.executeQuery();
		if (rs.next()) {
			data.add(rs.getInt(1));
			data.add(rs.getString(2));
			data.add(rs.getString(3));
			data.add(rs.getString(4));
			data.add(rs.getString(5));
			data.add(rs.getString(6));
			data.add(rs.getString(7));
			
		}
		
		} catch (Exception var6 ) {
			System.out.println(var6);
		}
		
		
	
	
		return data ; 
	   }
	
	public int update(CustomerRegDTO t1) {
		int x = 0 ;
		try {
			Connection con1 = GiftosDBConnection.getConn();
			PreparedStatement ps = con1.prepareStatement
		("update regiss set cname = ? ,cadd = ? , mob = ? ,email = ? ,unm = ? ,pw = ? where cid =? ");
			ps.setString(1, t1.getCname());
			ps.setString(2, t1.getCadd());
			ps.setString(3, t1.getMob());
			ps.setString(4, t1.getEmail());
			ps.setString(5, t1.getUnm());
			ps.setString(6, t1.getPw());
			ps.setInt(7, t1.getCid());
			x = ps.executeUpdate();
		}catch(Exception var5) {
			System.out.println(var5);
		}
		return x ; 
	}
	
	

}
