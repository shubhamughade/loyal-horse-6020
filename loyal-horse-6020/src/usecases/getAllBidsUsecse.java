package usecases;

import java.util.List;

import Bean.Bid;
import Exception.BidException;
import Exception.TenderException;
import dao.Dao;
import dao.DaoImpl;

public class getAllBidsUsecse {
	
public static void allBids() {
		
		Dao dao = new DaoImpl();
		
		try {
			
		List<Bid> bids= dao.getAllBids();
		
		bids.forEach(s ->{
			
			System.out.println("Bid id : "+s.getBid_id());
			System.out.println("Bid Amount : "+s.getBid_amount());
			System.out.println("Bid Status : "+s.getBid_status());
			System.out.println("Bid date : "+s.getBid_date());
			System.out.println("Tender id : "+s.getTender_id());
			System.out.println("Vender id : "+s.getVender_id());
			
			System.out.println("=========================================");
			
		});
		
		}catch(BidException te) {
			System.out.println(te.getMessage());
		}
}
}
