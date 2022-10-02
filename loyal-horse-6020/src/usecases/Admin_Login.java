package usecases;

import java.util.Scanner;

import Bean.Admin;
import Exception.VenderException;
import dao.Dao;
import dao.DaoImpl;

public class Admin_Login {
	
	public static void adminLogin() {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		Dao dao=new DaoImpl();
		
		try {
			Admin admin = dao.loginAdmin(uname, pass);
		
			System.out.println("");
			System.out.println("Welcome Admin ");
	 		System.out.println("");
	 		System.out.println(" Admin id :- "+ admin.getAdmin_id());
	 		System.out.println(" Admin Name :- "+ admin.getAdmin_Name());
	 		System.out.println(" Admin Email :- "+ admin.getAdmin_email());
	 		System.out.println("");
	 	
		}catch (VenderException e) {
			System.out.println(e.getMessage());
		}
	}
}
