package Main;

import java.util.Scanner;

import dao.Dao;
import dao.DaoImpl;
import usecases.Admin_Login;
import usecases.RegisterTendersUsecase;
import usecases.Vender_Login;
import usecases.getAllBidsUsecse;
import usecases.getAllTendersUsecse;
import usecases.getAllVendersUsecse;

public class Main {
	
	public static void main(String[] args) {
		
		Dao dao = new DaoImpl();
		
		System.out.println("");
		System.out.println("--- Welcome to Tender Management System ---");
		System.out.println("");
		System.out.println("********************************************");
		System.out.println("1.Administrator");
		System.out.println("2.Vendor");
		System.out.println("********************************************");
		System.out.println("Choose option for Login");
		
		Scanner sc = new Scanner(System.in);
		
		int opt=sc.nextInt();
		
		if(opt==1) {
			
			System.out.println("");
			System.out.println("1.Login with his Account");
			System.out.println("2.Register new Vendor");
			System.out.println("3.View all the vendor");
			System.out.println("4.Create new Tenders");
			System.out.println("5.View all the Tenders");
			System.out.println("6.View all the Bids");
			System.out.println("7.Assign Tender to a vendor");
			System.out.println("");
			System.out.println("*******************************************");
			System.out.println("");
			
			
			String will = "Yes";
			
			while(will.equalsIgnoreCase("yes")) {
				
				System.out.println("Choose option for Process");
				int number = sc.nextInt();
				
				switch (number) {
	
			      case 1:
			    	  Admin_Login.adminLogin();
			        break;
	
			      case 2:
			    	  RegisterTendersUsecase.createVendor();
			        break;
	
			      case 3:
			    	  getAllVendersUsecse.allVenders();
			        break;
	
			      case 4:
			    	  RegisterTendersUsecase.createVendor();
			        break;
			        
			      case 5:
			    	  getAllTendersUsecse.allTenders();
				        break;
				        
			      case 6:
			    	  getAllBidsUsecse.allBids();
				        break;
				        
			      case 7:
			    	  getAllBidsUsecse.allBids();
				        break;
			      
			      default:
			        System.out.println("Invalid Number");
			        System.out.println("");
			        break;
			    }
				
				System.out.println("If You Want to access the another process from Administrator, Enter (Yes/No)");
				will = sc.next();
				
				
			}
		}
		else if(opt==2) {
			
			System.out.println("");
			System.out.println("1.Login with his Account");
			System.out.println("2.View all Current Tenders");
			System.out.println("3.Place a Bid Against a Tender");
			System.out.println("4.View His own Bid History");
			System.out.println("");
			System.out.println("*******************************************");
			System.out.println("");
			
			String will = "Yes";
			while(will.equalsIgnoreCase("yes")) {
				
				System.out.println("Choose option for Process");
			
			int number = sc.nextInt();
			
			switch (number) {

		      case 1:
		    	  Vender_Login.venderLogin();
		        break;

		      case 2:
		    	  getAllTendersUsecse.allTenders();
		        break;

		      case 3:
		    	  getAllVendersUsecse.allVenders();
		        break;

		      case 4:
		    	  getAllBidsUsecse.allBids();
		        break;
		        
		      default:
			        System.out.println("Invalid Number");
			        break;
			
		}
			System.out.println("If You Want to access the another process from Administrator, Enter (Yes/No)");
			will = sc.next();
		}
		}
		else {
			System.out.println("Invalid Entry");
		}
		
		System.out.println("");
		System.out.println("***Thanks for visiting***");
		
		}
	}
