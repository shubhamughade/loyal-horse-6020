package dao;

import java.util.List;

import Bean.Admin;
import Bean.Bid;
import Bean.Tender;
import Bean.Vender;
import Exception.BidException;
import Exception.TenderException;
import Exception.VenderException;

public interface Dao {
	
	public Admin loginAdmin(String username, String password)throws VenderException;
	
	public String registerVender(Vender vender);
	
	public List<Vender> getAllVenders()throws VenderException;
	
	public String registerTender(Tender tender);
	
	public List<Tender> getAllTenders()throws TenderException;
	
	public List<Bid> getAllBids()throws BidException;
	
	public Vender loginVender(String username, String password)throws VenderException;
	
}
