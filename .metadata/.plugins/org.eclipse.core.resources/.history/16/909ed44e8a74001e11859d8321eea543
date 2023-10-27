package com.mycom.myapp.dto;

import java.util.Arrays;

import org.springframework.stereotype.Repository;

@Repository
public class CarDto {
	private String name2;
	private int price;
	private String owner;
	private String[] nickNames;

	// setname, getname을 사용하기 때문에 이걸로 이름을 맞춰주어야함 
	public String getName2() {
		return name2;
	}

	public void setName2(String name) {
		this.name2 = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String[] getNickNames() {
		return nickNames;
	}

	public void setNickNames(String[] nickNames) {
		this.nickNames = nickNames;
	}
	
	

	@Override
	public String toString() {
		return "CarDto [name2=" + name2 + ", price=" + price + ", owner=" + owner + ", nickNames="
				+ Arrays.toString(nickNames) + "]";
	}


}
