package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Admin;
import Bean.Bid;
import Bean.Tender;
import Bean.Vender;
import Connection.DButil;
import Exception.BidException;
import Exception.TenderException;
import Exception.VenderException;

public class DaoImpl implements Dao {

	@Override
	public Admin loginAdmin(String username, String password) throws VenderException {
		
		Admin admin = null;
		
		try(Connection conn = DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from Admin where Admin_email = ? AND Admin_password = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
				if(rs.next()) {
				
				int id= rs.getInt("admin_id");
				String name= rs.getString("Admin_Name");
				String email= rs.getString("Admin_email");
				String pass= rs.getString("Admin_password");
				
				admin=new Admin(id,name,email,pass);	
				
				
			}else
				throw new VenderException("Invalid Username or password.. ");
			
		} catch (SQLException e) {
			throw new VenderException(e.getMessage());
		}
		return admin;
	}

	@Override
	public String registerVender(Vender vender) {
		
		String message = "Not Inserted..";

		try(Connection conn= DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into venders(vender_id,vender_name,vender_email,vender_password) values(?,?,?,?)");
			
			ps.setInt(1, vender.getVender_id());
			ps.setString(2, vender.getVender_name());
			ps.setString(3, vender.getVender_email());
			ps.setString(4, vender.getVender_password());
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Vender Registered Sucessfully !";
		
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public List<Vender> getAllVenders() throws VenderException {
		
		List<Vender> venders = new ArrayList<>();
		
		
		try(Connection conn= DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from Venders");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				int r= rs.getInt("vender_id");
				String n= rs.getString("vender_name");
				String e= rs.getString("vender_email");
				String p= rs.getString("vender_password");
				
				Vender vender =	new Vender(r,n,e,p);
				
				venders.add(vender);
			
			}
			
		} catch (SQLException e) {
			throw new VenderException(e.getMessage());
		}
		
		
		if(venders.size() == 0)
			throw new VenderException("No Vendors found..");
		
		return venders;
	}

	@Override
	public String registerTender(Tender tender){
		
		String message = "Not Inserted..";

		try(Connection conn= DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into tenders(tender_id,tendor_name,tender_amount,tender_add) values(?,?,?,?)");
			
			ps.setInt(1, tender.getTender_id());
			ps.setString(2, tender.getTendor_name());
			ps.setInt(3, tender.getTender_amount());
			ps.setString(4, tender.getTender_add());
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Tender Registered Sucessfully !";
		
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public List<Tender> getAllTenders() throws TenderException {
		
		List<Tender> tenders = new ArrayList<>();
		
		try(Connection conn= DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from Tenders");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				int id= rs.getInt("tender_id");
				String name= rs.getString("tendor_name");
				int amount= rs.getInt("tender_amount");
				String add= rs.getString("tender_add");
				
				Tender tender =	new Tender(id,name,amount,add);
				
				tenders.add(tender);
			
			}
			
		} catch (SQLException e) {
			throw new TenderException(e.getMessage());
		}
		
		
		if(tenders.size() == 0)
			throw new TenderException("No Tenders found..");
		
		return tenders;
	}

	@Override
	public List<Bid> getAllBids() throws BidException {
		
		List<Bid> bids = new ArrayList<>();
		
		try(Connection conn= DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from Bids");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				int id= rs.getInt("bid_id");
				int amount= rs.getInt("bid_amount");
				int status= rs.getInt("bid_status");
				String date= rs.getString("bid_date");
				int t_id= rs.getInt("Tender_id");
				int v_id= rs.getInt("Vender_id");
				
				Bid bid =	new Bid(id,amount,status,date,t_id,v_id);
				
				bids.add(bid);
			
			}
			
		} catch (SQLException e) {
			throw new BidException(e.getMessage());
		}
		
		if(bids.size() == 0)
			throw new BidException("No bids found..");
		
		return bids;
	}

	@Override
	public Vender loginVender(String username, String password) throws VenderException {
		
		Vender vender = null;
		
		try(Connection conn = DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from venders where vender_email = ? AND vender_password = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
				if(rs.next()) {
				
				int id= rs.getInt("vender_id");
				String name= rs.getString("vender_name");
				String email= rs.getString("vender_email");
				String pass= rs.getString("vender_password");
				
				vender=new Vender(id,name,email,pass);	
				
				
			}else
				throw new VenderException("Invalid Username or password.. ");
			
		} catch (SQLException e) {
			throw new VenderException(e.getMessage());
		}
		return vender;
	}
	
	
	
	
}

