package com.wura.web.models;

public class Dog extends Pet {
	public Dog() {} 
	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		if(this.weight < 30) {
			return this.getName() +  " hopped into your lap and cuddled you";
		} else {
			return this.getName() + " curls up next to you!";
		}
	}
	
}

