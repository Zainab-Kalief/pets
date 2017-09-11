package com.wura.web.models;

public abstract class Pet implements PetInterface {
	private String name;
	private String breed;
	protected int weight;
	
	public void createPet(String name, String breed, int weight) {
		this.setName(name);
		this.setBreed(breed);
		this.weight = weight;
	}
	public Pet() {}
	public Pet(String name, String breed, int weight) {
		createPet(name, breed, weight);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
