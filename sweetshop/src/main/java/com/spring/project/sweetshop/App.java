package com.spring.project.sweetshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.spring.project.sweetshop.admin.StartAdmin;
import com.spring.project.sweetshop.customer.StartCustomer;


public class App 
{
    public static void main( String[] args )throws Exception 
    
    {	while(true) {
    	System.out.println("Log in as:");
    	System.out.println("1)Admin");
    	System.out.println("2)Customer");
    	System.out.println("3)Exit");
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    	int i=Integer.parseInt(br.readLine());
    	if(i==1) {
    		StartAdmin admin=new StartAdmin();
    		admin.admin_call();
    	}
    	else if(i==2) {
    		StartCustomer cust=new StartCustomer();
        	cust.custCall();	
    	}
    	else {
    		break;
    	}
    }
    }
    }
