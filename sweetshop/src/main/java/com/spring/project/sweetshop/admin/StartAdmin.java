package com.spring.project.sweetshop.admin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.project.sweetshop.dao.AdminDao;
import com.spring.project.sweetshop.dao.SweetDao;
import com.spring.project.sweetshop.entities.Admin;
import com.spring.project.sweetshop.entities.Sweet;

public class StartAdmin {
	 public  void admin_call( )
	    {	
	        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	        AdminDao adminDao=context.getBean("adminDao",AdminDao.class);
	        SweetDao sweetDao=context.getBean("sweetDao",SweetDao.class);
	        System.out.println("Welcome to the Admin");
	        System.out.println("=========================================================");

	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


	            try {
	            	

	            		System.out.println("Enter admin id:");
	            		int id=Integer.parseInt(br.readLine());
	            		System.out.println("Enter admin name:");
	            		String name=br.readLine();
	            		System.out.println("Enter admin password:");
	            		String password=br.readLine();
	            		Admin admin=adminDao.getAdmin(id);
	            		System.out.println(admin.getAdpassword());
	            		
	            		if(admin.getAdpassword().equals(password)) {
	            			System.out.println("Admin: "+name+" log in successfull");
	            			boolean p=true;
	            			while(p) {
	            			System.out.println("1) Add another Admin");
	            			System.out.println("2) Update Admin");
	            			System.out.println("3) Delete Admin");
	            			System.out.println("4) Add Sweet");
	            			System.out.println("5) Update Sweet");
	            			System.out.println("6) Delete Sweet");
	            			System.out.println("7) Log out");
	            			
	            			int n=Integer.parseInt(br.readLine());
	            			switch(n) {
	            			case 1:
	            				System.out.println("Enter new admin id:");
	                    		int newid=Integer.parseInt(br.readLine());
	                    		System.out.println("Enter new admin name:");
	                    		String newname=br.readLine();
	                    		System.out.println("Enter new admin password:");
	                    		String newpassword=br.readLine();
	                    		Admin newadmin=new Admin(newid,newname,newpassword);
	                    		adminDao.insert(newadmin);
	                    		System.out.println("New Admin Inserted");
	                    		break;
	            			case 2:
	            				System.out.println("Enter updated admin id:");
	                    		int updatedid=Integer.parseInt(br.readLine());
	                    		System.out.println("Enter updated admin name:");
	                    		String updatedname=br.readLine();
	                    		System.out.println("Enter updated admin password:");
	                    		String updatedpassword=br.readLine();
	                    		Admin updatedadmin=new Admin(updatedid,updatedname,updatedpassword);
	                    		adminDao.updateAdmin(updatedadmin);
	                    		System.out.println("Admin Updated");
	                    		break;
	            			case 3:
	            				System.out.println("Enter admin id:");
	                    		int delid=Integer.parseInt(br.readLine());
	                    		adminDao.deleteAdmin(delid);
	                    		System.out.println("Admin Deleted");
	                    		break;
	            			case 4:
	            				System.out.println("Enter new sweet id:");
	                    		int swid=Integer.parseInt(br.readLine());
	            				System.out.println("Enter new sweet category:");
	                    		String category=br.readLine();
	                    		System.out.println("Enter new sweet product:");
	                    		String product=br.readLine();
	                    		System.out.println("Enter new sweet rate:");
	                    		int rate=Integer.parseInt(br.readLine());
	                    		System.out.println("Enter new sweet offer:");
	                    		int offer=Integer.parseInt(br.readLine());
	                    		Sweet sweet=new Sweet(swid,category,product,rate,offer);
	                    		sweetDao.insert(sweet);
	                    		System.out.println("New Sweet Inserted");
	                    		break;
	            			case 5:
	            				System.out.println("Enter new sweet offer:");
	                    		int sid=Integer.parseInt(br.readLine());
	            				System.out.println("Enter new sweet category:");
	                    		String scategory=br.readLine();
	                    		System.out.println("Enter new sweet product:");
	                    		String sproduct=br.readLine();
	                    		System.out.println("Enter new sweet rate:");
	                    		int srate=Integer.parseInt(br.readLine());
	                    		System.out.println("Enter new sweet offer:");
	                    		int soffer=Integer.parseInt(br.readLine());
	                    		Sweet ssweet=new Sweet(sid,scategory,sproduct,srate,soffer);
	                    		sweetDao.updateSweet(ssweet);
	                    		System.out.println("Sweet Update");
	                    		break;
	            			case 6:
	            				System.out.println("Enter Sweet Id:");
	                    		Integer categ = Integer.parseInt(br.readLine());
	                    		sweetDao.deleteSweet(categ);
	                    		System.out.println("Sweet Deleted");
	                    		break;
	            			case 7:
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
	            
	    }

}
