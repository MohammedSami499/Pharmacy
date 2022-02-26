package models;

public class Vendors {

	private String name;
	private int age;
	private int serialNumber;
	private int phoneNumber;
	private Gender gender;
	
	public Vendors() {
		
	}

	public Vendors(String name, int age, int serialNumber, int phoneNumber, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.serialNumber = serialNumber;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
}
