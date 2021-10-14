package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class cart {

	private By cartButton =By.id("cart");
	
	public static void cartPage() {
		System.out.println("Cart Page");
		
	}
	
	public void addToCart() {
		System.out.println("Add to Cart Page");
		System.out.println("add feature done.");
	}
}
