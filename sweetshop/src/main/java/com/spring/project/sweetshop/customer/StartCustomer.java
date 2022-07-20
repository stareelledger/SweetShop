package com.spring.project.sweetshop.customer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.project.sweetshop.dao.CustomerDao;
import com.spring.project.sweetshop.dao.SweetDao;

import com.spring.project.sweetshop.entities.Customer;
import com.spring.project.sweetshop.entities.Sweet;

public class StartCustomer {
	 public  void custCall( )
	    {	
	        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	        CustomerDao customerDao=context.getBean("customerDao",CustomerDao.class);
	        SweetDao sweetDao=context.getBean("sweetDao",SweetDao.class);
	        System.out.println("Welcome to the Sweet Shop");
	        System.out.println("=========================================================");

	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("1)New User");
	        System.out.println("2)Old User");
	      
	        
	        

	            try {
	            	  int n=Integer.parseInt(br.readLine());
	            	if(n==1) {
	    	        	System.out.println("Enter new customer id:");
	            		int id=Integer.parseInt(br.readLine());
	            		System.out.println("Enter new customer name:");
	            		String name=br.readLine();
	            		System.out.println("Enter new customer password:");
	            		String password=br.readLine();
	            		Customer customer=new Customer(id,name,password);
	            		System.out.println(customerDao.insert(customer));
	            		System.out.println("New customer inserted");
	            		
	    	        }
	            	
	            		System.out.println("Give Login info:");
	            		System.out.println("Enter customer id:");
	            		int id=Integer.parseInt(br.readLine());
	            		System.out.println("Enter customer name:");
	            		String name=br.readLine();
	            		System.out.println("Enter customer password:");
	            		String password=br.readLine();
	            		Customer customer=customerDao.getCustomer(id);
	            		
	            		if(customer.getCustpass().equals(password)) {
	            			System.out.println("Customer: "+name+" log in successfull");
	            			boolean p=true;
	            			while(p) {
	            			System.out.println("1) View all sweets info");
	            			System.out.println("2) View all sweet products");
	            			System.out.println("3) View all sweet categories");
	            			System.out.println("4) View one sweet info based on sweet Id");
	            			System.out.println("5) Exit");

	            			
	            		
	            			int r=Integer.parseInt(br.readLine());
	            			switch(r) {
	            			case 1:
	            				List<Sweet> allSweets=sweetDao.getAllSweets();
	                    		for(Sweet obj:allSweets) {
	                    			System.out.println("________________________________________");
	                    			System.out.println("Category: " +obj.getCategory());
	                    			System.out.println("Product: " +obj.getProduct());
	                    			System.out.println("Rate: " +obj.getRate());
	                    			System.out.println("Offer: " +obj.getOffer());
	                    			System.out.println("________________________________________");
	                    		}
	                    		break;
	            			case 2:
	            				List<Sweet> allProduct=sweetDao.getAllSweets();
	            				System.out.println("All Products");
	            				System.out.println("________________________________________");
	                    		for(Sweet obj:allProduct) {
	                    			System.out.println( obj.getProduct());
	                    			
	                    		}
	                    		System.out.println("________________________________________");
	                    		break;
	            			case 3:
	            				List<Sweet> allCategory=sweetDao.getAllSweets();
	            				System.out.println("All Category");
	            				System.out.println("________________________________________");
	            				for(Sweet obj:allCategory) {
	                    			System.out.println(obj.getCategory());
	                    			
	                    		}
	                    		System.out.println("________________________________________");
	                    		break;
	            			case 4:
	            				System.out.println("Enter Sweet Id ");
	            				int a=Integer.parseInt(br.readLine());
	            				Sweet s=sweetDao.getSweet(a);
	            				System.out.println("Category: " +s.getCategory());
                    			System.out.println("Product: " +s.getProduct());
                    			System.out.println("Rate: " +s.getRate());
                    			System.out.println("Offer: " +s.getOffer());
	                    		System.out.println("________________________________________");
	                    		break;
	            			case 5:
	            				p=false;
	            				break;
	            			default:
	            				System.out.println("Wrong options");
	            				break;
	            				
	            			}

	            		}
	            		
	            		}
	            		else {
	                    	System.out.println("wrong admin password");
	                    }
	            }
	            catch(Exception e){
	            	
	            System.out.println(e);

	        }
	          ((ClassPathXmlApplicationContext)context).close();  
	    }
}
