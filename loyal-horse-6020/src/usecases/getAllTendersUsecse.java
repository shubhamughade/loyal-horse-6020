package usecases;

import java.util.List;

import Bean.Tender;
import Exception.TenderException;
import dao.Dao;
import dao.DaoImpl;

public class getAllTendersUsecse {
	
public static void allTenders(){
		
		Dao dao = new DaoImpl();
		
		try {
			
		List<Tender> tenders= dao.getAllTenders();
		
		tenders.forEach(s ->{
			
			System.out.println("Tender id : "+s.getTender_id());
			System.out.println("Tender name : "+s.getTendor_name());
			System.out.println("Tender amount: "+s.getTender_amount());
			System.out.println("Tender add: "+s.getTender_add());
			
			System.out.println("=========================================");
			
		});
		
		}catch(TenderException te) {
			System.out.println(te.getMessage());
		}
}
}
