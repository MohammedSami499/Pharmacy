package models;

public class Clients {

	private String name;
	private int id;
	private int age;
	private int phoneNo;
	private String lastVisit;
	private Gender gender;
	
	public Clients(String name, int age, int phoneNo, String lastVisit , Gender gender , int id) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.lastVisit = lastVisit;
		this.gender = gender;
		this.id = id;
	}
	
	public Clients() {}

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

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getLastVisit() {
		return lastVisit;
	}

	public void setLastVisit(String lastVisit) {
		this.lastVisit = lastVisit;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	
}
