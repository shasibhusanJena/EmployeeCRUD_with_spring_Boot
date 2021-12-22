package net.codejava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="address1",nullable = true,length=25)
	private String address1;
	
	@Column(name = "address2",nullable = true,length = 25)
	private String address2;
	
	@Column(name="state",nullable = false)
	private String State;
	
	@Column(name="country",nullable = false)
	private String country;
	
	@Column(name="pincode",nullable = false,length=6)
	private Long pincode;
	
}
