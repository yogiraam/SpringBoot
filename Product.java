package com.abc.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProductPortal")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	 private int productCode;
	String category;
	String productName;
	float price;
	String dealerName;
	float UserRating;
	public Product(String category, String productName, float price, String dealerName,float userRating) {
		super();
		this.productCode = productCode;
		this.category = category;
		this.productName = productName;
		this.price = price;
		this.dealerName = dealerName;
		this.UserRating = userRating;
	}
	

}
