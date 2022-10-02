package usecases;

import java.util.Scanner;

import Bean.Vender;
import Exception.VenderException;
import dao.Dao;
import dao.DaoImpl;

public class Vender_Login {
	
public static void venderLogin() {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		Dao dao=new DaoImpl();
		
		try {
			
			Vender vender = dao.loginVender(uname, pass);
		
			System.out.println("");
			System.out.println("Welcome Vender ");
	 		System.out.println("");
	 		System.out.println(" Vender id :- "+ vender.getVender_id());
	 		System.out.println(" Vender Name :- "+ vender.getVender_name());
	 		System.out.println(" Vender Email :- "+ vender.getVender_email());
	 		System.out.println("");
	 	
		}catch (VenderException e) {
			System.out.println(e.getMessage());
		}
	}
}
