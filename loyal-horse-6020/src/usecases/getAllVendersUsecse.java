package usecases;

import java.util.List;

import Bean.Vender;
import Exception.VenderException;
import dao.Dao;
import dao.DaoImpl;

public class getAllVendersUsecse {
	
public static void allVenders() {
		
		Dao dao = new DaoImpl();
		
		try {
			
		List<Vender> venders= dao.getAllVenders();
		
		venders.forEach(s ->{
			
			System.out.println("Vender id : "+s.getVender_id());
			System.out.println("Vender name : "+s.getVender_name());
			System.out.println("Vender email: "+s.getVender_email());
			System.out.println("Vender password: "+s.getVender_password());
			
			System.out.println("================================");
			
		});
		
		}catch(VenderException ve) {
			System.out.println(ve.getMessage());
		}
}
}
