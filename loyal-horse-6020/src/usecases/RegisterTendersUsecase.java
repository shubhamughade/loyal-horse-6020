package usecases;

import java.util.Scanner;

import Bean.Tender;
import dao.Dao;
import dao.DaoImpl;

public class RegisterTendersUsecase {
	
public static void createVendor() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Tender id:");
		int tender_id= sc.nextInt();
		
		System.out.println("Enter Tender Name:");
		String tender_name= sc.next();
		
		System.out.println("Enter Tender Amount:");
		int tender_amount= sc.nextInt();
		
		System.out.println("Enter Tender Address:");
		String vender_add= sc.next();
		
		
		Dao dao=new DaoImpl();
		
		
		Tender tender = new Tender();
		
		tender.setTender_id(tender_id);
		tender.setTendor_name(tender_name);
		tender.setTender_amount(tender_amount);
		tender.setTender_add(vender_add);;
		
		String result= dao.registerTender(tender);
		
		System.out.println(result);
}
}
