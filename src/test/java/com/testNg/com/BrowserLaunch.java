package com.testNg.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserLaunch {
      
	@BeforeSuite
	
	private void browserSetUp() {
       System.out.println("SETUP");
	}
	
	@BeforeTest
	
	private void browser() {
        System.out.println("chrome");
	}
	
	@BeforeClass
	
	private void url() {
       System.out.println("amazon");
	}
	
	@BeforeMethod
	
	private void login() {
    System.out.println("login");
	}
	
	@Test
	private void iphoneSearch() {
       System.out.println("Search iphone");
	}
	
	@Test
	private void addToCart() {
      System.out.println("add to Cart");
	}
	
	@AfterMethod
	private void logout() {
      System.out.println("logout");
	}
	
	@AfterClass
	private void close() {
       System.out.println("browser close");
	}
	
	@AfterTest
	private void verfication() {
      System.out.println("verification done");
	}
	
	@AfterSuite
	private void cookies() {
      System.out.println("cookies deleted");
	}
	
	
}   
