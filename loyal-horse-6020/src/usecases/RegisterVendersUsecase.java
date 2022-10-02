package usecases;

import java.util.Scanner;

import Bean.Vender;
import dao.Dao;
import dao.DaoImpl;

public class RegisterVendersUsecase {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Vender id:");
		int vender_id= sc.nextInt();
		
		System.out.println("Enter Vender Name:");
		String vender_name= sc.next();
		
		System.out.println("Enter Vender Email:");
		String vender_email= sc.next();
		
		System.out.println("Enter Vender password:");
		String vender_password= sc.next();
		
		
		Dao dao=new DaoImpl();
		
		
		
		Vender vender = new Vender();
		
		vender.setVender_id(vender_id);
		vender.setVender_name(vender_name);
		vender.setVender_email(vender_email);
		vender.setVender_password(vender_password);
		
		String result= dao.registerVender(vender);
		
		System.out.println(result);
}
}
